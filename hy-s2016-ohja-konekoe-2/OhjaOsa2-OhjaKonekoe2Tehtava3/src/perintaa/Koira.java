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
public class Koira extends Elain {

    public Koira(String nimi) {
        super(nimi);
    }

    public Koira() {
        super.nimi = "Koira";

    }

    public void hauku() {
        System.out.println(this.nimi + " haukkuu");
    }

    @Override
    public void aantele() {
        hauku();
    }

}
