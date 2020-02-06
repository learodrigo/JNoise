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

package de.articdive.jnoise.noise.opensimplex;

import de.articdive.jnoise.JNoise;
import de.articdive.jnoise.api.NoiseBuilder;

/**
 * @author Lukas Mansour
 */
public final class OctaveOpenSimplexNoiseBuilder extends NoiseBuilder<OctaveOpenSimplexNoiseGenerator> {
    private double frequency = 1.0;
    private int octaves = 1;
    private double persistence = 1.0;
    private double lacunarity = 1.0;
    
    @Override
    public OctaveOpenSimplexNoiseBuilder setSeed(int seed) {
        this.seed = seed;
        return this;
    }
    
    /**
     * Sets the frequency for the {@link OctaveOpenSimplexNoiseGenerator}.
     *
     * @param frequency the new frequency for the {@link OctaveOpenSimplexNoiseGenerator}.
     * @return {@link OctaveOpenSimplexNoiseBuilder} this
     */
    public OctaveOpenSimplexNoiseBuilder setFrequency(double frequency) {
        if (frequency <= 0) {
            throw new IllegalArgumentException("Frequency must be a non-zero positive value.");
        }
        this.frequency = frequency;
        return this;
    }
    
    /**
     * Sets the amount of octaves for the {@link OctaveOpenSimplexNoiseGenerator}.
     *
     * @param octaves the new amount of octaves for the {@link OctaveOpenSimplexNoiseGenerator}.
     * @return {@link OctaveOpenSimplexNoiseBuilder} this
     */
    public OctaveOpenSimplexNoiseBuilder setOctaves(int octaves) {
        if (octaves <= 0) {
            throw new IllegalArgumentException("The amount of octaves must be a non-zero positive integer.");
        }
        this.octaves = octaves;
        return this;
    }
    
    /**
     * Sets the persistence for the {@link OctaveOpenSimplexNoiseGenerator}.
     *
     * @param persistence the new persistence for the {@link OctaveOpenSimplexNoiseGenerator}.
     * @return {@link OctaveOpenSimplexNoiseBuilder} this
     */
    public OctaveOpenSimplexNoiseBuilder setPersistence(double persistence) {
        if (persistence <= 0) {
            throw new IllegalArgumentException("Persistence must be a non-zero positive value.");
        }
        this.persistence = persistence;
        return this;
    }
    
    /**
     * Sets the frequency for the {@link OctaveOpenSimplexNoiseGenerator}.
     *
     * @param lacunarity the new lacunarity for the {@link OctaveOpenSimplexNoiseGenerator}.
     * @return {@link OctaveOpenSimplexNoiseBuilder} this
     */
    public OctaveOpenSimplexNoiseBuilder setLacunarity(double lacunarity) {
        if (lacunarity <= 0) {
            throw new IllegalArgumentException("Lacunarity must be a non-zero positive value.");
        }
        this.lacunarity = lacunarity;
        return this;
    }
    
    
    @Override
    public JNoise build() {
        return JNoise.build(new OctaveOpenSimplexNoiseGenerator(seed, frequency, octaves, persistence, lacunarity));
    }
}
