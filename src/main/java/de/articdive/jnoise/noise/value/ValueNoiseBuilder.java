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

package de.articdive.jnoise.noise.value;

import de.articdive.jnoise.JNoise;
import de.articdive.jnoise.api.Interpolation;
import de.articdive.jnoise.api.NoiseBuilder;
import de.articdive.jnoise.noise.interpolation.CosineInterpolation;
import de.articdive.jnoise.noise.interpolation.InterpolationType;
import de.articdive.jnoise.noise.interpolation.LinearInterpolation;

/**
 * @author Lukas Mansour
 */
public final class ValueNoiseBuilder extends NoiseBuilder<ValueNoiseGenerator> {
    private InterpolationType interpolationType = InterpolationType.LINEAR;
    private double frequency = 1.00;
    
    @Override
    public ValueNoiseBuilder setSeed(int seed) {
        this.seed = seed;
        return this;
    }
    
    /**
     * Sets the Interpolation for the {@link ValueNoiseGenerator}
     *
     * @param interpolationType The new {@link InterpolationType} for the {@link ValueNoiseGenerator}
     * @return {@link ValueNoiseBuilder} this
     */
    public ValueNoiseBuilder setInterpolationType(InterpolationType interpolationType) {
        this.interpolationType = interpolationType;
        return this;
    }
    
    /**
     * Sets the frequency for the {@link ValueNoiseGenerator}.
     *
     * @param frequency the new frequency for the {@link ValueNoiseGenerator}.
     * @return {@link ValueNoiseBuilder} this
     */
    public ValueNoiseBuilder setFrequency(double frequency) {
        if (frequency <= 0) {
            throw new IllegalArgumentException("Frequency must be a non-zero positive value.");
        }
        this.frequency = frequency;
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
        return JNoise.build(new ValueNoiseGenerator(seed, interpolation, frequency));
    }
}
