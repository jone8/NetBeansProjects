
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi
                && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi
                && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

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
}
