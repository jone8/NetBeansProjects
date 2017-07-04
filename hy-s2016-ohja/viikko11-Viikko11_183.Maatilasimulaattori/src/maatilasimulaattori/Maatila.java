/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.ArrayList;

/**
 *
 * @author Kari
 */
public class Maatila implements Eleleva {

    private String omistaja;
    private Navetta navetta;
    private ArrayList<Lehma> lehmalista;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmalista = new ArrayList<>();
    }

    public void lisaaLehma(Lehma lehma) {
        lehmalista.add(lehma);
    }

    public String getOmistaja() {
        return this.omistaja;
    }

//public ArrayList getLehmat(){
//    return this.lehmalista;
//}
    public String getLehmat() {
        StringBuilder sb = new StringBuilder();
        if (this.lehmalista.isEmpty()) {
            System.out.println("Ei lehmiä.");
        } else {

            System.out.println("Lehmät\n        ");
            for (Lehma tamaLehma : this.lehmalista) {
                sb.append(tamaLehma.toString()).append("\n");
            }
        }
        return sb.toString();

    }

    public void hoidaLehmat() {
        this.navetta.poikkeusLypsyRobottiaEiAsennettu();
        for (Lehma tamaLehma : lehmalista) {
            this.navetta.hoida(tamaLehma);
        }
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }

    @Override
    public void eleleTunti() {
        for (Lehma tamaLehma : this.lehmalista) {
            tamaLehma.eleleTunti();
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        sb.append("Maatilan omistaja: "+this.omistaja+"\n");
       sb.append("Navetan maitosäiliö: "+this.navetta.getMaitosailio()+ " \n");
         if (this.lehmalista.isEmpty()) {
            System.out.println("Ei lehmiä.");
        } else {

            sb.append("Lehmät:\n");
            for (Lehma tamaLehma : this.lehmalista) {
              sb.append("        ");
                sb.append(tamaLehma+"\n");
            }
        }
        return sb.toString();
    
    }
}
