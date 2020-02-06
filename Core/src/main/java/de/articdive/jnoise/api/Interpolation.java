/*
 * JNoise
 * Copyright (C) 2020 Articdive (Lukas Mansour)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.articdive.jnoise.api;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Lukas Mansour
 */
public abstract class Interpolation {
    /**
     * Interpolates between 2 dot products a and b.
     *
     * @param a       first dot product
     * @param b       second dot product
     * @param fractal interpolation fractal
     * @return interpolated value
     */
    public abstract double interpolate(double a, double b, double fractal);
    
    /**
     * Interpolates between n dot products.
     * The amount of fractals represents the dimension.
     * The amount of dot products must be 2^(amount of fractals).
     *
     * @param fractals A list of fractals starting with the first stage fractal and ending with the n-th stage fractal.
     * @param doubles  A list of dot products.
     * @return interpolated value between all dot products.
     */
    public double interpolate(LinkedList<Double> fractals, LinkedList<Double> doubles) {
        if (doubles.size() != Math.pow(2, fractals.size())) {
            throw new IllegalArgumentException("The amount of doubles must be 2^(amount of fractals).");
        }
        Map<Integer, LinkedList<Double>> map = new HashMap<>(fractals.size());
        map.put(0, doubles);
        for (int i = 0; i < fractals.size(); i++) {
            LinkedList<Double> lastLevel = map.get(i);
            LinkedList<Double> nextLevel = new LinkedList<>();
            double fractalValue = fractals.get(i);
            for (int j = 0; j < lastLevel.size(); j += 2) {
                nextLevel.add(interpolate(lastLevel.get(j), lastLevel.get(j + 1), fractalValue));
            }
            map.put(i + 1, nextLevel);
//            map.put(i, null);
        }
        // This should only have 1 element, the final value!
        return map.get(fractals.size()).get(0);
    }
}
