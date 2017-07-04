/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liikkuvakuvio;

import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Kari
 */
public class Koostekuvio extends Kuvio {

    private ArrayList<Kuvio> kuviot;

    public Koostekuvio() {

        super(0, 0);
        this.kuviot = new ArrayList<Kuvio>();
    }

    @Override
    public void piirra(Graphics graphics) {
        for (Kuvio tamaKuvio : this.kuviot) {
            tamaKuvio.piirra(graphics);
        }
    }

    public void liita(Kuvio k) {
        this.kuviot.add(k);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Kuvio tamaKuvio : kuviot) {
            tamaKuvio.siirra(dx, dy);
        }
    }
}
