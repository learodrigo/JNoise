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

import de.articdive.jnoise.JNoise;

/**
 * @param <T> A NoiseGenerator that will be generated.
 * @author Lukas Mansour
 */
public abstract class NoiseBuilder<T extends NoiseGenerator> {
    // For Ramanujan
    protected int seed = 1729;
    
    /**
     * Sets the seed off the to-be-generated noise-generator.
     *
     * @param seed an integer to seed the noise-generator.
     * @return {@link NoiseBuilder<T>}
     */
    public abstract NoiseBuilder<T> setSeed(int seed);
    
    /**
     * Generates the noise-generator.
     *
     * @return {@link T}
     */
    public abstract JNoise build();
    
    
}
