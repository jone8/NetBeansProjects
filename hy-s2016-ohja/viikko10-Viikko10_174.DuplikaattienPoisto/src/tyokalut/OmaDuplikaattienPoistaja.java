/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyokalut;

import java.util.Set;
import java.util.*;

/**
 *
 * @author Kari
 */
public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {

    private Set<String> merkkijonot;
    private int havaitutDuplikaatitKpl;

    public OmaDuplikaattienPoistaja() {
        this.merkkijonot = new HashSet<String>();
        this.havaitutDuplikaatitKpl = 0;
    }

    @Override
    public void lisaa(String merkkijono) {
        boolean lisatty = this.merkkijonot.add(merkkijono);
        if (!lisatty) {
            this.havaitutDuplikaatitKpl++;
        }
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return this.havaitutDuplikaatitKpl;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return this.merkkijonot;
    }

    @Override
    public void tyhjenna() {
        this.merkkijonot.clear();
        this.havaitutDuplikaatitKpl = 0;
    }

}
