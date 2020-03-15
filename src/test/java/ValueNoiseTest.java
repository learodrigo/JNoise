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
class ValueNoiseTest {
    private JNoise valueLinear = JNoise.newBuilder().value().setInterpolationType(InterpolationType.LINEAR).setSeed(1629).build();
    private JNoise valueCosine = JNoise.newBuilder().value().setInterpolationType(InterpolationType.COSINE).setSeed(1629).build();
    
    @Test
    @DisplayName("Value Noise 1D Linear")
    void test1DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.1339626863086599, valueLinear.getNoise(2019 / 100.0));
        assertEquals(0.13615314625203595, valueLinear.getNoise(2020 / 100.0));
        assertEquals(0.13834360619541275, valueLinear.getNoise(2021 / 100.0));
        assertEquals(0.1405340661387888, valueLinear.getNoise(2022 / 100.0));
        assertEquals(0.14272452608216563, valueLinear.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 1D Cosine")
    void test1DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.11128260115866857, valueCosine.getNoise(2019 / 100.0));
        assertEquals(0.11326097856887246, valueCosine.getNoise(2020 / 100.0));
        assertEquals(0.11532679936997584, valueCosine.getNoise(2021 / 100.0));
        assertEquals(0.11747802484625608, valueCosine.getNoise(2022 / 100.0));
        assertEquals(0.11971253199789021, valueCosine.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 2D Linear")
    void test2DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.6230113115960725, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.6248014720585207, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.6266824881540604, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.6286543598826982, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.6307170872444279, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 2D Cosine")
    void test2DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.709587845318952, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.7117709974340759, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.7137355058024601, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.7154797633271149, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.7170017170008582, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 3D Linear")
    void test3DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.4327920176037312, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(-0.43022442582734055, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.42713091456895946, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.4235209398082659, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.419403957524917, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 3D Cosine")
    void test3DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.6330315016177734, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(-0.6307453964810501, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.627022981178703, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.6218886256088907, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.6153740224246169, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 4D Linear")
    void test4DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.22054280908862606, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(0.2169155241724114, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.21286132265097324, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.20838767091758664, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.2035016596594095, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Value Noise 4D Cosine")
    void test4DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.36572199796158916, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(0.36030437925066916, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.3538907047585263, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.3465255614769931, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.3382558324320184, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
