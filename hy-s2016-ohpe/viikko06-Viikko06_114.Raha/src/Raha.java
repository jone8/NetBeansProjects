
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(euroa + lisattava.eurot(), senttia + lisattava.sentit());
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {

        if (verrattava.eurot() + ((double) verrattava.sentit() / 100) > this.euroa + ((double) this.senttia / 100)) {
            return true;
        } else {
            return false;
        }
    }

    public Raha miinus(Raha vahentaja) {
        int uusieuroa = 0;
        int uusisenttia = 0;

        uusieuroa = euroa - vahentaja.eurot();
        uusisenttia = senttia - vahentaja.sentit();
        if (uusisenttia < 0) {
            System.out.println("eka" + uusisenttia);
            uusisenttia = 100 + uusisenttia;
            System.out.println("toka" + uusisenttia);
            uusieuroa = uusieuroa - 1;
        }
        if (uusieuroa < 0) {
            uusisenttia = 0;
            uusieuroa = 0;
        }

        Raha uusi = new Raha(uusieuroa, uusisenttia);
        return uusi;
    }
}
