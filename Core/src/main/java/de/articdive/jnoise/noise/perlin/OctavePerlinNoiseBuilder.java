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

package de.articdive.jnoise.noise.perlin;

import de.articdive.jnoise.JNoise;
import de.articdive.jnoise.api.Interpolation;
import de.articdive.jnoise.api.NoiseBuilder;
import de.articdive.jnoise.noise.interpolation.LinearInterpolation;
import de.articdive.jnoise.noise.interpolation.CosineInterpolation;
import de.articdive.jnoise.noise.interpolation.InterpolationType;

/**
 * @author Lukas Mansour
 */
public final class OctavePerlinNoiseBuilder extends NoiseBuilder<OctavePerlinNoiseGenerator> {
    private InterpolationType interpolationType = InterpolationType.LINEAR;
    private double frequency = 1.00;
    private int octaves = 1;
    private double persistence = 1;
    private double lacunarity = 1;
    
    @Override
    public OctavePerlinNoiseBuilder setSeed(int seed) {
        this.seed = seed;
        return this;
    }
    
    /**
     * Sets the Interpolation for the {@link OctavePerlinNoiseGenerator}
     *
     * @param interpolationType The new {@link InterpolationType} for the {@link OctavePerlinNoiseGenerator}.
     * @return {@link OctavePerlinNoiseBuilder} this
     */
    public OctavePerlinNoiseBuilder setInterpolationType(InterpolationType interpolationType) {
        this.interpolationType = interpolationType;
        return this;
    }
    
    /**
     * Sets the frequency for the {@link OctavePerlinNoiseGenerator}.
     *
     * @param frequency the new frequency for the {@link OctavePerlinNoiseGenerator}.
     * @return {@link OctavePerlinNoiseBuilder} this
     */
    public OctavePerlinNoiseBuilder setFrequency(double frequency) {
        if (frequency <= 0) {
            throw new IllegalArgumentException("Frequency must be a non-zero positive value.");
        }
        this.frequency = frequency;
        return this;
    }
    
    /**
     * Sets the amount of octaves for the {@link OctavePerlinNoiseGenerator}.
     *
     * @param octaves the new amount of octaves for the {@link OctavePerlinNoiseGenerator}.
     * @return {@link OctavePerlinNoiseBuilder} this
     */
    public OctavePerlinNoiseBuilder setOctaves(int octaves) {
        if (octaves <= 0) {
            throw new IllegalArgumentException("The amount of octaves must be a non-zero positive integer.");
        }
        this.octaves = octaves;
        return this;
    }
    
    /**
     * Sets the persistence for the {@link OctavePerlinNoiseGenerator}.
     *
     * @param persistence the new persistence for the {@link OctavePerlinNoiseGenerator}.
     * @return {@link OctavePerlinNoiseBuilder} this
     */
    public OctavePerlinNoiseBuilder setPersistence(double persistence) {
        if (persistence <= 0) {
            throw new IllegalArgumentException("Persistence must be a non-zero positive value.");
        }
        this.persistence = persistence;
        return this;
    }
    
    /**
     * Sets the frequency for the {@link OctavePerlinNoiseGenerator}.
     *
     * @param lacunarity the new lacunarity for the {@link OctavePerlinNoiseGenerator}.
     * @return {@link OctavePerlinNoiseBuilder} this
     */
    public OctavePerlinNoiseBuilder setLacunarity(double lacunarity) {
        if (lacunarity <= 0) {
            throw new IllegalArgumentException("Lacunarity must be a non-zero positive value.");
        }
        this.lacunarity = lacunarity;
        return this;
    }
    
    
    @Override
    public JNoise build() {
        Interpolation interpolation;
        switch (interpolationType) {
            case LINEAR: {
                interpolation = new LinearInterpolation();
                break;
            }
            case COSINE: {
                interpolation = new CosineInterpolation();
                break;
            }
            default: {
                throw new IllegalArgumentException(interpolationType + " is not a valid interpolation-type.");
            }
        }
        return JNoise.build(new OctavePerlinNoiseGenerator(seed, interpolation, frequency, octaves, persistence, lacunarity));
    }
}
