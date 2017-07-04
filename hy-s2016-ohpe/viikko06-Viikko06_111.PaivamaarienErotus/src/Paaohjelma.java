
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia

        Paivays eka = new Paivays(10, 03, 2011);
        Paivays toka = new Paivays(10, 3, 2012);
        Paivays kolmas = new Paivays(25, 12, 2010);

        System.out.println(toka + " ja " + eka + " ero vuosissa: " + toka.erotusVuosissa(eka));

        System.out.println(kolmas + " ja " + eka + " ero vuosissa: " + kolmas.erotusVuosissa(eka));

        System.out.println(toka + " ja " + kolmas + " ero vuosissa: " + toka.erotusVuosissa(kolmas));
    }
}
