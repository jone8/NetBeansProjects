
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public abstract class Tyontekija {

    private String nimi;
    private int palkka;
    protected List<Tyontekija> alaiset;
    private List<String> kielet;

    public Tyontekija(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.alaiset = new ArrayList<>();
        this.kielet = new ArrayList<>();
    }

    public String haeNimi() {
        return this.nimi;
    }

    public int haePalkka() {
        return this.palkka;
    }

    public int laskeAlaiset() {
        int maara = 0;
        maara = this.alaiset.size();
        for (Tyontekija tama : this.alaiset) {
            maara += tama.laskeAlaiset();
        }
        return maara;
// ei ihan toimi?
//        return this.alaiset.size();
    }

    public void lisaaKieli(String kieli) {
        this.kielet.add(kieli);
    }

    public boolean onkoTaitoa(String kieli) {
        if (this.kielet.contains(kieli)) {
            return true;
        }
        return false;
    }

}
