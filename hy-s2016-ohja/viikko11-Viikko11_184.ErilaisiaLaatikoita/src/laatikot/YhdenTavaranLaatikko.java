/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laatikot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kari
 */
public class YhdenTavaranLaatikko extends Laatikko {

    private List<Tavara> tavarat;

    public YhdenTavaranLaatikko() {
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavarat.size() < 1) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.tavarat.contains(tavara)) {
            return true;
        }
        return false;
    }

}
