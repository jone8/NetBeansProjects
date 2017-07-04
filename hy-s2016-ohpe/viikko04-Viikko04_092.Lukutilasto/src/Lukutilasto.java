
public class Lukutilasto {

    private int lukujenMaara;
    private int summaluku;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summaluku = 0;
    }

    public void lisaaLuku(int luku) {
        int summaluku = 0;
        this.lukujenMaara = this.lukujenMaara + 1;
        this.summaluku = this.summaluku + luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }

    public int summa() {
        return this.summaluku;
    }

    public double keskiarvo() {
        double ka = 0;
        if (this.lukujenMaara != 0) {
            ka = (double) this.summaluku / this.lukujenMaara;
        }
        return ka;
    }
}
