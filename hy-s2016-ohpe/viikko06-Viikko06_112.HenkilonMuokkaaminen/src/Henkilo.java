
import java.util.Calendar;

public class Henkilo {

    private String nimi;
    private Paivays syntymapaiva;

    public Henkilo(String nimi, int pp, int kk, int vv) {
        this.nimi = nimi;
        this.syntymapaiva = new Paivays(pp, kk, vv);
    }

    public Henkilo(String nimi, Paivays syntymapaiva) {
        this.nimi = nimi;
        this.syntymapaiva = syntymapaiva;
    }

    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.syntymapaiva = new Paivays(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public int ika() {
        Paivays tamaPaivays = new Paivays(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
        int ika = this.syntymapaiva.erotusVuosissa(tamaPaivays);

// laske henkilön ikä syntymäpäivän ja tämän päivän perusteella
        // tämä päivä saadaan selville seuraavasti
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // tammikuun numero on 0 joten lisätään 1
        // Calendar.getInstance().get(Calendar.YEAR);
        return ika;
    }

    public boolean vanhempiKuin(Henkilo verrattava) {
        int ero = this.syntymapaiva.erotusPaivissa(verrattava.syntymapaiva);
        if (ero > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getNimi() {
        return this.nimi;
    }

    public String toString() {
        return this.nimi + ", syntynyt " + this.syntymapaiva;
    }

}
