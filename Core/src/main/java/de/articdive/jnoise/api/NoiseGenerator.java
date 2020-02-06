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

/**
 * @author Lukas Mansour
 */
public abstract class NoiseGenerator {
    protected final int seed;
    
    protected NoiseGenerator(int seed) {
        this.seed = seed;
    }
    
    /**
     * Evaluates the noise at a 1D point.
     *
     * @param x X value of the point
     * @return A value representing the noise at the point (x), its bounds are noise-type dependant!
     */
    public abstract double evaluateNoise(double x);
    
    /**
     * Evaluates the noise at a 2D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @return A value representing the noise at the point (x,y), its bounds are noise-type dependant!
     */
    public abstract double evaluateNoise(double x, double y);
    
    /**
     * Evaluates the noise at a 3D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @param z Z value of the point
     * @return A value representing the noise at the point (x,y,z), its bounds are noise-type dependant!
     */
    public abstract double evaluateNoise(double x, double y, double z);
    
    /**
     * Evaluates the noise at a 4D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @param z Z value of the point
     * @param w W value of the point
     * @return A value representing the noise at the point (x,y,z,w), its bounds are noise-type dependant!
     */
    public abstract double evaluateNoise(double x, double y, double z, double w);
}
