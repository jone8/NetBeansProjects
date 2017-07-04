
import java.util.*;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

    }

    // toteuta tänne staattinen luokkametodi palautaKoko, joka palauttaa parametrina 
    // saamansa lista-olion alkioiden lukumäärän
    public static int palautaKoko(List lista) {
        int i = 0;
        for (Object eka : lista) {
            i++;
        }
        return i;
    }

}
