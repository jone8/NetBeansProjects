/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perintaa;

/**
 *
 * @author Kari
 */
public abstract class Elain implements Aanteleva {

    protected String nimi;

    public Elain(String nimi) {
        this.nimi = nimi;
    }

    public Elain() {

    }

    public void syo() {
        System.out.println(this.nimi + " syo");
    }

    public void nuku() {
        System.out.println(this.nimi + " nukkuu");
    }

    public String getNimi() {
        return this.nimi;
    }
}
