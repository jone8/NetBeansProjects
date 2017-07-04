/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.gui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import matopeli.Suunta;
import matopeli.domain.Mato;

/**
 *
 * @author Kari
 */
public class Nappaimistonkuuntelija implements KeyListener {

    Mato mato;
//    private Component component;

    public Nappaimistonkuuntelija(Mato mato) {
        this.mato = mato;
//        this.component = component;
    }
//

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.mato.setSuunta(Suunta.YLOS);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.mato.setSuunta(Suunta.OIKEA);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.mato.setSuunta(Suunta.ALAS);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.mato.setSuunta(Suunta.VASEN);
        }
//        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
