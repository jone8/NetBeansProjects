
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int pv, int kk, int vv) {
        this.paiva = pv;
        this.kuukausi = kk;
        this.vuosi = vv;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        // ensin verrataan vuosia
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        // jos vuodet ovat samat, verrataan kuukausia
        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        // vuodet ja kuukaudet samoja, verrataan päivää
        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    /*
     * Aiemmassa tehtävässä lisättiin luokalle metodi erotusVuosissa
     * Kannattaa kopioida metodi tänne, se helpottaa tehtävän tekemistä oleellisesti!
     */
    public int erotusVuosissa(Paivays verrattava) {
        int paivaysKontta = this.vuosi * 360 + this.kuukausi * 30 + this.paiva;
        int verrattavaKontta = verrattava.vuosi * 360 + verrattava.kuukausi * 30 + verrattava.paiva;
        int ero = paivaysKontta - verrattavaKontta;
        if (ero < 0) {
            ero = ero * -1;
        }
        int erotus = 0;
        while (ero >= 360) {
            ero -= 360;
            erotus++;
        }

        return erotus;
    }

    public int erotusPaivissa(Paivays verrattava) {
        int paivaysKontta = this.vuosi * 360 + this.kuukausi * 30 + this.paiva;
        int verrattavaKontta = verrattava.vuosi * 360 + verrattava.kuukausi * 30 + verrattava.paiva;
        int ero = verrattavaKontta - paivaysKontta;
        return ero;
    }

}
