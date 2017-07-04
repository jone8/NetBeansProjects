/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liikkuvakuvio;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Kari
 */
public class Piirtoalusta extends JPanel {

    private Kuvio kuvio;

    public Piirtoalusta(Kuvio kuvio) {
        super.setBackground(Color.CYAN);
        this.kuvio = kuvio;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        kuvio.piirra(graphics);
    }
}
