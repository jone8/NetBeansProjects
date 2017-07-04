package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        if (luvusta < 0) {
            throw new IllegalArgumentException("Kertomassa parametrin tulee olla ei-negatiivinen");
        }

        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (joukonKoko < 0 || osaJoukonKoko < 0) {
            throw new IllegalArgumentException("Binomikertoimen parametrin tulee olla ei-negatiivinen");
        }
        if (joukonKoko < osaJoukonKoko) {
            throw new IllegalArgumentException("Binomikertoimessa osajoukon koon tulee olla pienempi"
                    + "kuin joukon koon");
        }
        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
