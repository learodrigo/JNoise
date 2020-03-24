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
import de.articdive.jnoise.interpolation.InterpolationType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukas Mansour
 */
class OctaveValueNoiseTest {
    private JNoise valueLinear = JNoise.newBuilder().octaveValue().setSeed(1629)
            .setOctaves(4).setPersistence(0.5).setLacunarity(0.5).setInterpolationType(InterpolationType.LINEAR).build();
    private JNoise valueCosine = JNoise.newBuilder().octaveValue().setSeed(1629)
            .setOctaves(4).setPersistence(0.5).setLacunarity(0.5).setInterpolationType(InterpolationType.COSINE).build();
    
    @Test
    @DisplayName("Octave Value Noise 1D Linear")
    void test1DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.00864557985460861, valueLinear.getNoise(2019 / 100.0));
        assertEquals(0.009448389660101341, valueLinear.getNoise(2020 / 100.0));
        assertEquals(0.01025119946559433, valueLinear.getNoise(2021 / 100.0));
        assertEquals(0.011054009271087033, valueLinear.getNoise(2022 / 100.0));
        assertEquals(0.011856819076580032, valueLinear.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 1D Cosine")
    void test1DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.0020295710500578103, valueCosine.getNoise(2019 / 100.0));
        assertEquals(0.002847010565891006, valueCosine.getNoise(2020 / 100.0));
        assertEquals(0.0036955544954157204, valueCosine.getNoise(2021 / 100.0));
        assertEquals(0.004574219942496664, valueCosine.getNoise(2022 / 100.0));
        assertEquals(0.0054819840091148596, valueCosine.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 2D Linear")
    void test2DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.04368733766564166, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.044073701264600654, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.044530157576932856, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.04505670660263861, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.04565334834171766, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 2D Cosine")
    void test2DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.017134840342461228, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.017792302542536942, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.018437095229051778, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.01906849165287024, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.019685466865458624, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 3D Linear")
    void test3DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.19316888457396547, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(-0.19274788142144672, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.19201685806559723, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.1909810598906404, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.18964573228078876, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 3D Cosine")
    void test3DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.29820691717980163, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(-0.29735345007324077, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.2957150380136678, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.2933043709762153, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.2901380881928633, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 4D Linear")
    void test4DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.33615720462557835, valueLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(0.3347386657876239, valueLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.33304678297212686, valueLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.3310848612204112, valueLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.32885602337847664, valueLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Value Noise 4D Cosine")
    void test4DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.4959397763942764, valueCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(0.49371790740539656, valueCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.4908261214692306, valueCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.4872870520107825, valueCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.4831248394686891, valueCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
