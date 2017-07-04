/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
import java.util.*;

public class Varasto {

    private Map<String, Integer> varastonTuotteidenHinnat;
    private Map<String, Integer> varastonTuotteidenSaldot;

    public Varasto() {
        this.varastonTuotteidenHinnat = new HashMap<>();
        this.varastonTuotteidenSaldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        varastonTuotteidenHinnat.put(tuote, hinta);
        varastonTuotteidenSaldot.put(tuote, saldo);
    }

    public int hinta(String tuote) {
        if (varastonTuotteidenHinnat.containsKey(tuote)) {
            return varastonTuotteidenHinnat.get(tuote);
        }
        return -99;
    }

    public int saldo(String tuote) {
        if (!varastonTuotteidenSaldot.containsKey(tuote)) {
            return 0;

        } else if (varastonTuotteidenSaldot.get(tuote) < 1) {
            return 0;
        }

        return varastonTuotteidenSaldot.get(tuote);
    }

    public boolean ota(String tuote) {
        if (!varastonTuotteidenSaldot.containsKey(tuote)) {
            return false;
        } else if (varastonTuotteidenSaldot.get(tuote) > 0) {
            int uusiSaldo = varastonTuotteidenSaldot.get(tuote) - 1;
            varastonTuotteidenSaldot.put(tuote, uusiSaldo);
            return true;
        }

        return false;
    }

    public Set<String> tuotteet() {
        Set<String> tulostettavat = new HashSet<>();

        for (String eka : varastonTuotteidenHinnat.keySet()) {
            tulostettavat.add(eka);
        }
        return tulostettavat;
    }
}
