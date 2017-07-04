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
public class MaksimipainollinenLaatikko extends Laatikko {

    private List<Tavara> tavarat;
    private int maksimipaino;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        int yhteispaino = 0;
        for (Tavara tamaTavara : this.tavarat) {
            yhteispaino = yhteispaino + tamaTavara.getPaino();

        }
        if (tavara.getPaino() + yhteispaino <= this.maksimipaino) {
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
