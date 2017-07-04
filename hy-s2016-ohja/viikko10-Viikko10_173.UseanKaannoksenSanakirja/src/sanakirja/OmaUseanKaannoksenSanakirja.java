/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.util.Set;

/**
 *
 * @author Kari
 */
import java.util.*;

public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja {

    private Map<String, Set<String>> kaannokset;

    public OmaUseanKaannoksenSanakirja() {

        this.kaannokset = new HashMap<>();
    }

    @Override
    public void lisaa(String sana, String kaannos) {
        if (!this.kaannokset.containsKey(sana)) {
            this.kaannokset.put(sana, new HashSet<>());
        }
        this.kaannokset.get(sana).add(kaannos);
    }

    @Override
    public Set<String> kaanna(String sana) {
        for (String eka : this.kaannokset.keySet()) {
            if (this.kaannokset.containsKey(sana)) {
                return this.kaannokset.get(sana);
            }
        }
        return null;
    }

    @Override
    public void poista(String sana) {
        this.kaannokset.remove(sana);
    }
}
