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

import de.articdive.jnoise.JNoise;
import de.articdive.jnoise.noise.interpolation.InterpolationType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukas Mansour
 */
class PerlinNoiseTest {
    private JNoise perlinLinear = JNoise.newBuilder().perlin().setInterpolationType(InterpolationType.LINEAR).setSeed(1629).build();
    private JNoise perlinCosine = JNoise.newBuilder().perlin().setInterpolationType(InterpolationType.COSINE).setSeed(1629).build();
    
    @Test
    @DisplayName("Perlin Noise 1D Linear")
    void test1DLinear() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinLinear.getNoise(i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.22132705582800172, perlinLinear.getNoise(2019 / 100.0));
        assertEquals(0.23475199999999904, perlinLinear.getNoise(2020 / 100.0));
        assertEquals(0.24821522014800113, perlinLinear.getNoise(2021 / 100.0));
        assertEquals(0.2616829163519985, perlinLinear.getNoise(2022 / 100.0));
        assertEquals(0.2751200541320006, perlinLinear.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 1D Cosine")
    void test1DCosine() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinCosine.getNoise(i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.1938974011699214, perlinCosine.getNoise(2019 / 100.0));
        assertEquals(0.20495278522681143, perlinCosine.getNoise(2020 / 100.0));
        assertEquals(0.21619060746980232, perlinCosine.getNoise(2021 / 100.0));
        assertEquals(0.227620580079088, perlinCosine.getNoise(2022 / 100.0));
        assertEquals(0.23924889875882097, perlinCosine.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 2D Linear")
    void test2DLinear() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinLinear.getNoise(i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.10876559178557305, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.11249770179379222, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.11562586214316604, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.11812827843379223, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.11999169282557266, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 2D Cosine")
    void test2DCosine() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinCosine.getNoise(i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.17608257348234954, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.18482305715287706, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.1929440266366987, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.2003751349776051, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.20704954615192192, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 3D Linear")
    void test3DLinear() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinLinear.getNoise(i, i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.25012859919043495, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(0.24827794889773933, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.24549847360080862, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.2418959026317744, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.2375849194019896, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 3D Cosine")
    void test3DCosine() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinCosine.getNoise(i, i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.3902216536705175, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(0.39006195573945146, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.38860602241696923, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.3858658067576627, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.3818607540188719, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 4D Linear")
    void test4DLinear() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinLinear.getNoise(i, i, i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.1499302355412132, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.1429695447532221, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.13549673750457536, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.1274939640808546, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.11894884785485678, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Perlin Noise 4D Cosine")
    void test4DCosine() {
        // All integers should = 0.0
        for (int i = 0; i < 100; i++) {
            // Sometimes there is -0.0
            assertEquals(0.0, Math.abs(perlinCosine.getNoise(i, i, i, i)));
        }
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.24059654656559812, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.21906779989163788, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.1967926000280144, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.17396779465265377, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.15079181992110155, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
