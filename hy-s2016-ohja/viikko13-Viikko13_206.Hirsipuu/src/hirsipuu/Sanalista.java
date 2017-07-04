package hirsipuu;

import java.util.ArrayList;
import java.util.List;

public class Sanalista {

    private List<String> sanat;

    public Sanalista(List<String> sanat) {
        this.sanat = sanat;
    }

    public List<String> sanat() {
        return this.sanat;
    }

    public Sanalista sanatJoidenPituusOn(int pituus) {
        List<String> uusiSanalista = new ArrayList<>();
        Sanalista uusiSanalistaOlio = new Sanalista(uusiSanalista);
        for (String tama : this.sanat) {
            if (tama.length() == pituus) {
                uusiSanalista.add(tama);
            }
        }
        return uusiSanalistaOlio;
    }

    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {
        List<String> uusiSanalista = new ArrayList<>();
        Sanalista uusiSanalistaOlio = new Sanalista(uusiSanalista);
        for (String tama : this.sanat) {
            if (!tama.contains(kirjain + "")) {
                uusiSanalista.add(tama);
            }
        }
        return uusiSanalistaOlio;
    }

    public Sanalista sanatJoissaMerkit(String merkkijono) {
        List<String> uusiSanalista = new ArrayList<>();
        Sanalista uusiSanalistaOlio = new Sanalista(uusiSanalista);
        int lisataanko = 0;
        for (String tama : this.sanat) {
            lisataanko = 0;
            for (int i = 0; i < merkkijono.length(); i++) {

                if (!(tama.charAt(i) == (merkkijono.charAt(i))
                        || merkkijono.charAt(i) == ('-'))) {

                    lisataanko--;
                }
            }
            if (lisataanko == 0) {
                uusiSanalista.add(tama);

            }
        }
        return uusiSanalistaOlio;
    }

    public int koko() {
        return this.sanat.size();
    }

}
