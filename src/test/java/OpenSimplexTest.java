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
class OpenSimplexTest {
    private JNoise simplex = JNoise.newBuilder().openSimplex().setSeed(1629).build();
    
    @Test
    @DisplayName("OpenSimplex Noise 2D")
    void test2D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.6904902018295257, simplex.getNoise(2019 / 100.0, 2023 / 100.0));
        assertEquals(0.6958411331517824, simplex.getNoise(2020 / 100.0, 2022 / 100.0));
        assertEquals(0.7008265873692782, simplex.getNoise(2021 / 100.0, 2021 / 100.0));
        assertEquals(0.7054292394533752, simplex.getNoise(2022 / 100.0, 2020 / 100.0));
        assertEquals(0.7096320778879546, simplex.getNoise(2023 / 100.0, 2019 / 100.0));
    }
    
    @Test
    @DisplayName("OpenSimplex Noise 3D")
    void test3D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.2466051338718475, simplex.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
        assertEquals(0.25345036290196526, simplex.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(0.2598545048609397, simplex.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(0.26577942258543774, simplex.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(0.2711884942149114, simplex.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
    }
    
    @Test
    @DisplayName("OpenSimplex Noise 4D")
    void test4D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(-0.21455927176612039, simplex.getNoise(2019 / 100.0, 2023 / 100.0, 2019 / 100.0, 2023 / 100.0));
        assertEquals(-0.19479861732896406, simplex.getNoise(2020 / 100.0, 2022 / 100.0, 2020 / 100.0, 2022 / 100.0));
        assertEquals(-0.17475255067647705, simplex.getNoise(2021 / 100.0, 2021 / 100.0, 2021 / 100.0, 2021 / 100.0));
        assertEquals(-0.15451565261172495, simplex.getNoise(2022 / 100.0, 2020 / 100.0, 2022 / 100.0, 2020 / 100.0));
        assertEquals(-0.13418124742617163, simplex.getNoise(2023 / 100.0, 2019 / 100.0, 2023 / 100.0, 2019 / 100.0));
    }
}
