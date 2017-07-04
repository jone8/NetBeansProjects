
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Kirja implements Comparable<Kirja> {

    private String nimi;
    private int minimiKohdeIka;
    private List<Integer> testi;

    public Kirja(String nimi, int minimiKohdeika) {
        this.nimi = nimi;
        this.minimiKohdeIka = minimiKohdeika;
        this.testi = new ArrayList<>();
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getMinimiKohdeIka() {
        return this.minimiKohdeIka;
    }

    @Override
    public int compareTo(Kirja toinen) {
        return this.minimiKohdeIka - toinen.getMinimiKohdeIka();
    }
}
