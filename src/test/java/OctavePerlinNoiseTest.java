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
class OctavePerlinNoiseTest {
    private JNoise perlinLinear = JNoise.newBuilder().octavePerlin().setInterpolationType(InterpolationType.LINEAR)
            .setSeed(1629).setOctaves(4).setPersistence(0.5).setLacunarity(0.5).build();
    private JNoise perlinCosine = JNoise.newBuilder().octavePerlin().setInterpolationType(InterpolationType.COSINE)
            .setSeed(1629).setOctaves(4).setPersistence(0.5).setLacunarity(0.5).build();
    
    @Test
    @DisplayName("Octave Perlin Noise 1D Linear")
    void test1DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.051463560228070050, perlinLinear.getNoise(2019 / 100.0));
        assertEquals(0.056725281445312144, perlinLinear.getNoise(2020 / 100.0));
        assertEquals(0.061989938382640865, perlinLinear.getNoise(2021 / 100.0));
        assertEquals(0.067239621766924070, perlinLinear.getNoise(2022 / 100.0));
        assertEquals(0.072455839454271860, perlinLinear.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 1D Cosine")
    void test1DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.038602935711200180, perlinCosine.getNoise(2019 / 100.0));
        assertEquals(0.042846667425584725, perlinCosine.getNoise(2020 / 100.0));
        assertEquals(0.047186605977931916, perlinCosine.getNoise(2021 / 100.0));
        assertEquals(0.051627556655644405, perlinCosine.getNoise(2022 / 100.0));
        assertEquals(0.056172418801729790, perlinCosine.getNoise(2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 2D Linear")
    void test2DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.007879567334631420, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.011443546797068542, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.014693033593224093, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.017616070907669660, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.020205244332618652, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 2D Cosine")
    void test2DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.045904519864161770, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.051647970184082924, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.057062616028868650, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.062111795691112270, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.066760734042404970, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 3D Linear")
    void test3DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.16317989790930170, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(0.16657675080850523, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.16938404412640200, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.17165433217120000, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.17344514524291724, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 3D Cosine")
    void test3DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.24148030898461270, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(0.24615080374152010, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.25011816081851407, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.25338772841420687, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.25596861383464790, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 4D Linear")
    void test4DLinear() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.10651285489252872, perlinLinear.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.10529952081725101, perlinLinear.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.10379496199027224, perlinLinear.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.10198592479564353, perlinLinear.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.09986212328843083, perlinLinear.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave Perlin Noise 4D Cosine")
    void test4DCosine() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.15892184942051960, perlinCosine.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.14983738960594342, perlinCosine.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.14035105840930498, perlinCosine.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.13056747021810522, perlinCosine.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.12059203582235076, perlinCosine.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
