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

import de.articdive.jnoise.api.Interpolation;
import de.articdive.jnoise.api.NoiseGenerator;

/**
 * The bounds of this Octave Perlin Noise implementation are: [-1, 1]
 *
 * @author Lukas Mansour
 */
public final class OctavePerlinNoiseGenerator extends NoiseGenerator {
    private final PerlinNoiseGenerator perlinNoiseGenerator;
    private final int octaves;
    private final double persistence;
    private final double lacunarity;
    
    OctavePerlinNoiseGenerator(int seed, Interpolation interpolation, double frequency, int octaves, double persistence, double lacunarity) {
        super(seed);
        this.perlinNoiseGenerator = new PerlinNoiseGenerator(seed, interpolation, frequency);
        this.octaves = octaves;
        this.persistence = persistence;
        this.lacunarity = lacunarity;
    }
    
    @Override
    public double evaluateNoise(double x) {
        double output = 0;
        double amplitude = 1;
        double lacunarity = 1;
        double maxValue = 0;
        for (int i = 0; i < this.octaves; i++) {
            // Frequency is already inlcuded in the PerlinNoiseGenerator!
            output += perlinNoiseGenerator.evaluateNoise(x * lacunarity) * amplitude;
            maxValue += amplitude;
            
            amplitude *= this.persistence;
            lacunarity *= this.lacunarity;
        }
        return output / maxValue;
    }
    
    @Override
    public double evaluateNoise(double x, double y) {
        double output = 0;
        double amplitude = 1;
        double lacunarity = 1;
        double maxValue = 0;
        for (int i = 0; i < this.octaves; i++) {
            // Frequency is already inlcuded in the PerlinNoiseGenerator!
            output += perlinNoiseGenerator.evaluateNoise(x * lacunarity, y * lacunarity) * amplitude;
            maxValue += amplitude;
            
            amplitude *= this.persistence;
            lacunarity *= this.lacunarity;
        }
        return output / maxValue;
    }
    
    @Override
    public double evaluateNoise(double x, double y, double z) {
        double output = 0;
        double amplitude = 1;
        double lacunarity = 1;
        double maxValue = 0;
        for (int i = 0; i < this.octaves; i++) {
            // Frequency is already inlcuded in the PerlinNoiseGenerator!
            output += perlinNoiseGenerator.evaluateNoise(x * lacunarity, y * lacunarity, z * lacunarity) * amplitude;
            maxValue += amplitude;
            
            amplitude *= this.persistence;
            lacunarity *= this.lacunarity;
        }
        return output / maxValue;
    }
    
    @Override
    public double evaluateNoise(double x, double y, double z, double w) {
        double output = 0;
        double amplitude = 1;
        double lacunarity = 1;
        double maxValue = 0;
        for (int i = 0; i < this.octaves; i++) {
            // Frequency is already inlcuded in the PerlinNoiseGenerator!
            output += perlinNoiseGenerator.evaluateNoise(x * lacunarity, y * lacunarity, z * lacunarity, w * lacunarity) * amplitude;
            maxValue += amplitude;
            
            amplitude *= this.persistence;
            lacunarity *= this.lacunarity;
        }
        return output / maxValue;
    }
}
