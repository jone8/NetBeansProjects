
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        int tahtienmaara = 0;
        for (int i = 0; i < taulukko.length; i++) {
            tahtienmaara = taulukko[i];
            for (int a = 0; a < tahtienmaara; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
