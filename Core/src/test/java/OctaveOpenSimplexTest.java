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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukas Mansour
 */
class OctaveOpenSimplexTest {
    private JNoise simplex = JNoise.newBuilder().octaveOpenSimplex().setSeed(1629)
            .setOctaves(4).setPersistence(0.5).setLacunarity(0.5).build();
    
    @Test
    @DisplayName("Octave OpenSimplex Noise 2D")
    void test2D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.2533937725911552, simplex.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.2565444472504081, simplex.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.2595234250214047, simplex.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.26232095197548316, simplex.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.2649274206588736, simplex.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("Octave OpenSimplex Noise 3D")
    void test3D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.015934511624029497, simplex.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(-0.014561345670909871, simplex.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.01339703468788919, simplex.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.01246025979865441, simplex.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.011768913097458396, simplex.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("Octave OpenSimplex Noise 4D")
    void test4D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.15001069691932484, simplex.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.13866297817998705, simplex.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.12716003050085414, simplex.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.1155525815608907, simplex.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.10389062849630334, simplex.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
