
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Ostoskori {

    List<Ostos> ostokset;
//    Map<Tuote, Integer> tuotteet;

    public Ostoskori() {
        this.ostokset = new ArrayList<>();
//        this.tuotteet = new HashMap<>();

    }

    public int tuotteitaKorissa() {
        int maara = 0;
        return ostokset.size();
    }

    public int hinta() {
        // kertoo korissa olevien tuotteiden yhteenlasketun hinnan
        int hinta = 0;
        for (Ostos tamaOstos : ostokset) {
            hinta = hinta + tamaOstos.hinta();
        }

        return hinta;
    }

    public void lisaaTuote(Tuote lisattava) {
        Ostos lisattavaOstos = new Ostos(lisattava);
        ostokset.add(lisattavaOstos);

    }

    public void poista(Tuote poistettava) {
        // poistaa tuotteen
    }

    public List<Ostos> ostokset() {
        // palauttaa listan jossa on korissa olevat ostokset

        return ostokset;
    }

    public void tyhjenna() {
        // tyhjentää korin
    }
}
