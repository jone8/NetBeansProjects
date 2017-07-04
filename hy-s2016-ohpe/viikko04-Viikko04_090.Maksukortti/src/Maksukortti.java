/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkuSaldo) {
        this.saldo = alkuSaldo;
    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";

    }

    public void syoEdullisesti() {
        if (this.saldo >= 2.5) {
            this.saldo = this.saldo - 2.5;
        }
    }

    public void syoMaukkaasti() {
        if (saldo >= 4.3) {
            this.saldo = this.saldo - 4.3;
        }
    }

    public void lataaRahaa(double rahamaara) {
        if (rahamaara >= 0 && this.saldo + rahamaara <= 150) {
            this.saldo = this.saldo + rahamaara;
        } else if (this.saldo + rahamaara > 150) {
            this.saldo = 150;
        }

    }
}
