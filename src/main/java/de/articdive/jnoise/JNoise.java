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

package de.articdive.jnoise;


import de.articdive.jnoise.api.NoiseGenerator;
import de.articdive.jnoise.noise.opensimplex.OctaveOpenSimplexNoiseBuilder;
import de.articdive.jnoise.noise.opensimplex.OpenSimplexBuilder;
import de.articdive.jnoise.noise.perlin.OctavePerlinNoiseBuilder;
import de.articdive.jnoise.noise.perlin.PerlinNoiseBuilder;
import de.articdive.jnoise.noise.value.OctaveValueNoiseBuilder;
import de.articdive.jnoise.noise.value.ValueNoiseBuilder;
import de.articdive.jnoise.noise.white.WhiteNoiseBuilder;

/**
 * @author Lukas Mansour
 */
public final class JNoise {
    private final NoiseGenerator noiseGenerator;
    
    private JNoise(NoiseGenerator noiseGenerator) {
        this.noiseGenerator = noiseGenerator;
    }
    
    /**
     * Evaluates the noise at a 1D point.
     *
     * @param x X value of the point
     * @return A value representing the noise at the point (x), its bounds are noise-type dependant!
     */
    public double getNoise(double x) {
        return noiseGenerator.evaluateNoise(x);
    }
    
    /**
     * Evaluates the noise at a 2D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @return A value representing the noise at the point (x,y), its bounds are noise-type dependant!
     */
    public double getNoise(double x, double y) {
        return noiseGenerator.evaluateNoise(x, y);
    }
    
    /**
     * Evaluates the noise at a 3D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @param z Z value of the point
     * @return A value representing the noise at the point (x,y,z), its bounds are noise-type dependant!
     */
    public double getNoise(double x, double y, double z) {
        return noiseGenerator.evaluateNoise(x, y, z);
    }
    
    /**
     * Evaluates the noise at a 4D point.
     *
     * @param x X value of the point
     * @param y Y value of the point
     * @param z Z value of the point
     * @param w W value of the point
     * @return A value representing the noise at the point (x,y,z,w), its bounds are noise-type dependant!
     */
    public double getNoise(double x, double y, double z, double w) {
        return noiseGenerator.evaluateNoise(x, y, z, w);
    }
    
    public static JNoiseBuilder newBuilder() {
        return new JNoiseBuilder();
    }
    
    public static JNoise build(NoiseGenerator generator) {
        return new JNoise(generator);
    }
    
    public static class JNoiseBuilder {
        public PerlinNoiseBuilder perlin() {
            return new PerlinNoiseBuilder();
        }
        
        public OctavePerlinNoiseBuilder octavePerlin() {
            return new OctavePerlinNoiseBuilder();
        }
        
        public WhiteNoiseBuilder white() {
            return new WhiteNoiseBuilder();
        }
        
        public OpenSimplexBuilder openSimplex() {
            return new OpenSimplexBuilder();
        }
        
        public OctaveOpenSimplexNoiseBuilder octaveOpenSimplex() {
            return new OctaveOpenSimplexNoiseBuilder();
        }
        
        public ValueNoiseBuilder value() {
            return new ValueNoiseBuilder();
        }
        
        public OctaveValueNoiseBuilder octaveValue() {
            return new OctaveValueNoiseBuilder();
        }
    }
}
