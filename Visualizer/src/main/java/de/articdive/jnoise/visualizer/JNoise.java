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

package de.articdive.jnoise.visualizer;

import de.articdive.jnoise.noise.interpolation.InterpolationType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * @author Lukas Mansour
 */
public class JNoise {
    private static final int WINDOW_WIDTH = 960;
    private static final int WINDOW_HEIGHT = 1080;
    
    public static void main(String[] args) {
        BufferedImage output = new BufferedImage(WINDOW_WIDTH, WINDOW_HEIGHT, BufferedImage.TYPE_INT_RGB);
        de.articdive.jnoise.JNoise jnoise = de.articdive.jnoise.JNoise.newBuilder().octaveValue()
                .setInterpolationType(InterpolationType.COSINE)
                .setLacunarity(2).setOctaves(6).setPersistence(0.5).setSeed(1184582710).build();
        
        for (int x = 0; x < output.getWidth(); x++) {
            for (int y = 0; y < output.getHeight(); y++) {
                double noise = jnoise.getNoise((double) x / WINDOW_WIDTH * 10, (double) y / WINDOW_HEIGHT* 10);
//                // Convert (-1 upto 1) to (0 upto 1).
                noise = (noise + 1) / 2.0;
                int iNoise = (int) (noise * 256);
                output.setRGB(x, y, iNoise * 65536 + iNoise * 256 + iNoise);
            }
        }
        JFrame frame = new JFrame();
        frame.setTitle("JNoise - Visualizer");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        JPanel imagePane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(output, 0, 0, null);
            }
        };
        frame.add(imagePane);
    }
}
