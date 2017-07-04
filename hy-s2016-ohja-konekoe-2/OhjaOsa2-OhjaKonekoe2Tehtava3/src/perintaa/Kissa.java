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
public class Kissa extends Elain {

    public Kissa(String nimi) {
        super(nimi);
    }

    public Kissa() {
        super.nimi = "Kissa";
    }

    public void mourua() {
        System.out.println(this.nimi + " mouruaa");
    }

    @Override
    public void aantele() {
        mourua();
    }

}
