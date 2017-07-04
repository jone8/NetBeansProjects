/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import matopeli.domain.Pala;
import matopeli.peli.Matopeli;

/**
 *
 * @author Kari
 */
public class Piirtoalusta extends JPanel implements Paivitettava {

    private Matopeli matopeli;
    private int palanSivunPituus;

    public Piirtoalusta(Matopeli matopeli, int palanSivunPituus) {
//       this.matopeli=new Matopeli(100, 100);
// oli pitkään ongelma

        this.matopeli = matopeli;
//       !!!
        this.palanSivunPituus = palanSivunPituus;
    }

    @Override
    protected void paintComponent(Graphics g) {
//       ??protected

        super.paintComponent(g);

        for (Pala tama : this.matopeli.getMato().getPalat()) {
            g.setColor(Color.BLACK);

            g.fill3DRect(tama.getX() * this.palanSivunPituus,
                    tama.getY() * this.palanSivunPituus, this.palanSivunPituus,
                    this.palanSivunPituus, true);
        }

        g.setColor(Color.RED);
        g.fillOval(this.matopeli.getOmena().getX() * this.palanSivunPituus,
                this.matopeli.getOmena().getY() * this.palanSivunPituus,
                this.palanSivunPituus, this.palanSivunPituus);
//    tarkista omenan sijainti

    }

    @Override
    public void paivita() {
        repaint();
    }
}
