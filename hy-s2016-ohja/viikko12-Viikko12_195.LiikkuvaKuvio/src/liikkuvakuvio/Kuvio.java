/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liikkuvakuvio;

import java.awt.Graphics;

/**
 *
 * @author Kari
 */
public abstract class Kuvio {

    private int x;
    private int y;

    public Kuvio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void siirra(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public abstract void piirra(Graphics graphics);

}
