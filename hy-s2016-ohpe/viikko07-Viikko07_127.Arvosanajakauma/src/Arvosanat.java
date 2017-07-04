
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Arvosanat {

    private ArrayList<Integer> arvoSanaLista;

    public Arvosanat() {
        this.arvoSanaLista = new ArrayList<Integer>();

    }

    public void lisaa(int luku) {
        this.arvoSanaLista.add(luku);
    }

    public void arvosanatTahtina() {
        System.out.println("Arvosanajakauma:");
        System.out.println("5: " + tahtienMaara(vitostenMaara()));
        System.out.println("4: " + tahtienMaara(nelostenMaara()));
        System.out.println("3: " + tahtienMaara(kolmostenMaara()));
        System.out.println("2: " + tahtienMaara(kakkostenMaara()));
        System.out.println("1: " + tahtienMaara(ykkostenMaara()));
        System.out.println("0: " + tahtienMaara(hylattyjenMaara()));
        System.out.println("Hyväksymisprosentti: " + hyvaksymisprosentti());

    }

    public double hyvaksymisprosentti() {
        double kokoMaara = hylattyjenMaara + ykkostenMaara + kakkostenMaara + kolmostenMaara
                + nelostenMaara + vitostenMaara;
        double hyvaksyttyjenMaara = kokoMaara - hylattyjenMaara;
        if (kokoMaara > 0) {
            return (double) (hyvaksyttyjenMaara / kokoMaara) * 100;
        } else {
            return 0;
        }
    }

    public static String tahtienMaara(int maara) {
        String tahdet = "";
        for (maara = maara; maara > 0; maara--) {
            tahdet = tahdet + "*";
        }
        return tahdet;
    }

    int hylattyjenMaara = 0;

    public int hylattyjenMaara() {
        for (int eka : arvoSanaLista) {
            if (eka > -1 && eka < 30) {
                hylattyjenMaara++;
            }
        }

        return hylattyjenMaara;
    }

    int ykkostenMaara = 0;

    public int ykkostenMaara() {
        for (int eka : arvoSanaLista) {
            if (eka > 29 && eka < 35) {
                ykkostenMaara++;
            }
        }
        return ykkostenMaara;
    }

    int kakkostenMaara = 0;

    public int kakkostenMaara() {
        for (int eka : arvoSanaLista) {
            if (eka > 34 && eka < 40) {
                kakkostenMaara++;
            }
        }
        return kakkostenMaara;
    }

    int kolmostenMaara = 0;

    public int kolmostenMaara() {

        for (int eka : arvoSanaLista) {
            if (eka > 39 && eka < 45) {
                kolmostenMaara++;
            }
        }
        return kolmostenMaara;
    }

    int nelostenMaara = 0;

    public int nelostenMaara() {

        for (int eka : arvoSanaLista) {
            if (eka > 44 && eka < 50) {
                nelostenMaara++;
            }
        }
        return nelostenMaara;
    }

    int vitostenMaara = 0;

    public int vitostenMaara() {

        for (int eka : arvoSanaLista) {
            if (eka > 49 && eka < 61) {
                vitostenMaara++;
            }
        }
        return vitostenMaara;
    }
// public int arvoSanojenMaara(int arvosana ){
//int hylattyjenMaara=0;
//int ykkostenMaara=0;
//int kakkostenMaara=0;
//int kolmostenMaara=0;
//int nelostenMaara=0;
//int vitostenMaara=0;
//
//for(int eka: this.arvoSanaLista) {
//if(eka>-1&&eka<30){
//     hylattyjenMaara++;
//}
//
// if(eka>34&& eka<40){
//     kakkostenMaara++;
// }
// if(eka> 39&& eka<45){
//     kolmostenMaara++;
// }  
// if(eka> 44&& eka<50){
//     nelostenMaara++;
// }
// if(eka>49&&eka<61){
//     vitostenMaara++;
// }   
//
//    }
//return 0;
//}

    public void tulosta() {
        for (int eka : this.arvoSanaLista) {
            System.out.println(eka);
        }
    }

}
