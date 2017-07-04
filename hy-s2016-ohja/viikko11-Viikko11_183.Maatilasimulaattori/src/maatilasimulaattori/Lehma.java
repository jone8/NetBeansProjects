/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.Random;

/**
 *
 * @author Kari
 */
public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private double maitoaUtareissa;
    private int utareidenTilavuus;
    private Random random=new Random();
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma() {
//this.nimi=new Random(NIMIA);
        this.maitoaUtareissa = 0;
        this.utareidenTilavuus = 15 + random.nextInt(26);
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
    }

    public Lehma(String nimi) {
        this();
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public double getTilavuus() {
        return utareidenTilavuus;
    }

    public double getMaara() {
        return this.maitoaUtareissa;
    }

    @Override
    public String toString() {
        return this.nimi + " " + Math.ceil(this.getMaara()) + "/" + this.getTilavuus();
    }

    @Override
    public double lypsa() {
        double lypsettyMaara = this.maitoaUtareissa;
        this.maitoaUtareissa = 0;
        return lypsettyMaara;
    }

    @Override
    public void eleleTunti() {
       double maara= 0.7+random.nextDouble()*1.3;
        if (maara > this.utareidenTilavuus-this.maitoaUtareissa) {
            this.maitoaUtareissa = this.utareidenTilavuus;
        } else {
            this.maitoaUtareissa = this.maitoaUtareissa+maara;
        }
    }

}
