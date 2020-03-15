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
class WhiteNoiseTest {
    private JNoise white = JNoise.newBuilder().white().setSeed(3003).build();
    
    @Test
    @DisplayName("White Noise 1D")
    void test1D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.0, white.getNoise(2019.0));
        assertEquals(0.0, white.getNoise(2020.0));
        assertEquals(0.0, white.getNoise(2021.0));
        assertEquals(0.0, white.getNoise(2022.0));
        assertEquals(0.0, white.getNoise(2023.0));
        assertEquals(1.0, white.getNoise(2024.0));
        assertEquals(0.0, white.getNoise(2025.0));
        assertEquals(1.0, white.getNoise(2026.0));
        assertEquals(0.0, white.getNoise(2027.0));
        assertEquals(0.0, white.getNoise(2028.0));
        assertEquals(0.0, white.getNoise(2029.0));
        assertEquals(0.0, white.getNoise(2030.0));
        assertEquals(1.0, white.getNoise(2031.0));
        assertEquals(0.0, white.getNoise(2032.0));
        assertEquals(1.0, white.getNoise(2033.0));
        assertEquals(0.0, white.getNoise(2034.0));
        assertEquals(0.0, white.getNoise(2035.0));
        assertEquals(0.0, white.getNoise(2036.0));
        assertEquals(0.0, white.getNoise(2037.0));
        assertEquals(0.0, white.getNoise(2038.0));
        assertEquals(1.0, white.getNoise(2039.0));
    }
    
    @Test
    @DisplayName("White Noise 2D")
    void test2D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(1.0, white.getNoise(2019.0, 2039.0));
        assertEquals(0.0, white.getNoise(2020.0, 2038.0));
        assertEquals(0.0, white.getNoise(2021.0, 2037.0));
        assertEquals(1.0, white.getNoise(2022.0, 2036.0));
        assertEquals(0.0, white.getNoise(2023.0, 2035.0));
        assertEquals(0.0, white.getNoise(2024.0, 2034.0));
        assertEquals(0.0, white.getNoise(2025.0, 2033.0));
        assertEquals(1.0, white.getNoise(2026.0, 2032.0));
        assertEquals(1.0, white.getNoise(2027.0, 2031.0));
        assertEquals(1.0, white.getNoise(2028.0, 2030.0));
        assertEquals(1.0, white.getNoise(2029.0, 2029.0));
        assertEquals(1.0, white.getNoise(2030.0, 2028.0));
        assertEquals(0.0, white.getNoise(2031.0, 2027.0));
        assertEquals(0.0, white.getNoise(2032.0, 2026.0));
        assertEquals(0.0, white.getNoise(2033.0, 2025.0));
        assertEquals(0.0, white.getNoise(2034.0, 2024.0));
        assertEquals(1.0, white.getNoise(2035.0, 2023.0));
        assertEquals(1.0, white.getNoise(2036.0, 2022.0));
        assertEquals(0.0, white.getNoise(2037.0, 2021.0));
        assertEquals(0.0, white.getNoise(2038.0, 2020.0));
        assertEquals(1.0, white.getNoise(2039.0, 2019.0));
    }
    
    @Test
    @DisplayName("White Noise 3D")
    void test3D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.0, white.getNoise(2019.0, 2039.0, 2019.0));
        assertEquals(1.0, white.getNoise(2020.0, 2038.0, 2020.0));
        assertEquals(0.0, white.getNoise(2021.0, 2037.0, 2021.0));
        assertEquals(1.0, white.getNoise(2022.0, 2036.0, 2022.0));
        assertEquals(0.0, white.getNoise(2023.0, 2035.0, 2023.0));
        assertEquals(1.0, white.getNoise(2024.0, 2034.0, 2024.0));
        assertEquals(0.0, white.getNoise(2025.0, 2033.0, 2025.0));
        assertEquals(1.0, white.getNoise(2026.0, 2032.0, 2026.0));
        assertEquals(0.0, white.getNoise(2027.0, 2031.0, 2027.0));
        assertEquals(0.0, white.getNoise(2028.0, 2030.0, 2028.0));
        assertEquals(1.0, white.getNoise(2029.0, 2029.0, 2029.0));
        assertEquals(0.0, white.getNoise(2030.0, 2028.0, 2030.0));
        assertEquals(1.0, white.getNoise(2031.0, 2027.0, 2031.0));
        assertEquals(0.0, white.getNoise(2032.0, 2026.0, 2032.0));
        assertEquals(0.0, white.getNoise(2033.0, 2025.0, 2033.0));
        assertEquals(1.0, white.getNoise(2034.0, 2024.0, 2034.0));
        assertEquals(1.0, white.getNoise(2035.0, 2023.0, 2035.0));
        assertEquals(1.0, white.getNoise(2036.0, 2022.0, 2036.0));
        assertEquals(0.0, white.getNoise(2037.0, 2021.0, 2037.0));
        assertEquals(0.0, white.getNoise(2038.0, 2020.0, 2038.0));
        assertEquals(0.0, white.getNoise(2039.0, 2019.0, 2039.0));
    }
    
    @Test
    @DisplayName("White Noise 4D")
    void test4D() {
        // Hardcoded values (if this changes the algorithm has been changed, this should never happen!)
        assertEquals(0.0, white.getNoise(2019.0, 2039.0, 2019.0, 2039.0));
        assertEquals(1.0, white.getNoise(2020.0, 2038.0, 2020.0, 2038.0));
        assertEquals(0.0, white.getNoise(2021.0, 2037.0, 2021.0, 2037.0));
        assertEquals(1.0, white.getNoise(2022.0, 2036.0, 2022.0, 2036.0));
        assertEquals(0.0, white.getNoise(2023.0, 2035.0, 2023.0, 2035.0));
        assertEquals(1.0, white.getNoise(2024.0, 2034.0, 2024.0, 2034.0));
        assertEquals(1.0, white.getNoise(2025.0, 2033.0, 2025.0, 2033.0));
        assertEquals(1.0, white.getNoise(2026.0, 2032.0, 2026.0, 2032.0));
        assertEquals(1.0, white.getNoise(2027.0, 2031.0, 2027.0, 2031.0));
        assertEquals(0.0, white.getNoise(2028.0, 2030.0, 2028.0, 2030.0));
        assertEquals(0.0, white.getNoise(2029.0, 2029.0, 2029.0, 2029.0));
        assertEquals(1.0, white.getNoise(2030.0, 2028.0, 2030.0, 2028.0));
        assertEquals(1.0, white.getNoise(2031.0, 2027.0, 2031.0, 2027.0));
        assertEquals(1.0, white.getNoise(2032.0, 2026.0, 2032.0, 2026.0));
        assertEquals(0.0, white.getNoise(2033.0, 2025.0, 2033.0, 2025.0));
        assertEquals(0.0, white.getNoise(2034.0, 2024.0, 2034.0, 2024.0));
        assertEquals(0.0, white.getNoise(2035.0, 2023.0, 2035.0, 2023.0));
        assertEquals(1.0, white.getNoise(2036.0, 2022.0, 2036.0, 2022.0));
        assertEquals(0.0, white.getNoise(2037.0, 2021.0, 2037.0, 2021.0));
        assertEquals(1.0, white.getNoise(2038.0, 2020.0, 2038.0, 2020.0));
        assertEquals(0.0, white.getNoise(2039.0, 2019.0, 2039.0, 2019.0));
    }
}
