
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        for (int i = 0; i < taulukko.length - 1; i++) {
            System.out.print(taulukko[i] + ", ");
        }

        System.out.println(taulukko[taulukko.length - 1]);
// Kirjoita koodia tänne
    }
}
