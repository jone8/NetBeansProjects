
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ateria) {
        if (!ateriat.contains(ateria)) {
            ateriat.add(ateria);
        }
    }

    public void tulostaAteriat() {
        for (String eka : ateriat) {
            System.out.println(eka);
        }
    }

    public void tyhjennaRuokalista() {
        ateriat.clear();
    }

    // toteuta tänne tarvittavat metodit
}
