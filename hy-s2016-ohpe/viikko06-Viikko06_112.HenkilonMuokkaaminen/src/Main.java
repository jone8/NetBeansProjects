
public class Main {

    public static void main(String[] args) {
        // voit kopioida tänne testikoodia materiaalista

        Henkilo pekka = new Henkilo("Pekka", new Paivays(15, 2, 1983));
        Henkilo iina = new Henkilo("iina");

        System.out.println(pekka);
        System.out.println(iina);
    }
}
