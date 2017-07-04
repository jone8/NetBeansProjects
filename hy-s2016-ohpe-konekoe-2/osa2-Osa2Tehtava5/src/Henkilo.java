/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Henkilo {

    private String nimi;
    private String numero;

    public Henkilo(String nimiAlussa, String numeroAlussa) {
        this.nimi = nimiAlussa;
        this.numero = numeroAlussa;
    }

    public void vaihdaNumeroa(String uusiNumero) {
        this.numero = uusiNumero;
    }

    public String toString() {
        return this.nimi + ", puh: " + this.numero;
    }

    public String getNimi() {
        return this.nimi;
    }

    public String getNumero() {
        String palautusNumero = this.numero;
        return palautusNumero;
    }
}
