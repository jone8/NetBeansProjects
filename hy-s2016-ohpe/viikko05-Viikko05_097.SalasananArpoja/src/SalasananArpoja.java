
import java.util.Random;

public class SalasananArpoja {

    private int pituus;
    private Random random;
// Määrittele muuttuja tässä

    public SalasananArpoja(int salasananPituus) {
        this.random = new Random();
        this.pituus = salasananPituus;
// Alusta muuttujat tässä
    }

    public String luoSalasana() {
        // Kirjoita tähän koodi, joka palauttaa uuden salasanan
        String salasana = "";
        int apu = this.pituus;
        while (apu > 0) {
            int luku = this.random.nextInt(25);
            char merkki = "abcdefghijklmnopqrstuvwxyz".charAt(luku);
            salasana = salasana + merkki;
            apu--;
        }

        return salasana;
    }
}
