
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       String a =".- ";
String B="-...";


        morsekoodi("abccc");
    }

    public static void morsekoodi(String merkkijono) {
        int sananPituus = merkkijono.length();

        for (int apu = 0; apu < sananPituus; apu++) {
            String kirjain=merkkijono.substring(apu);

        }
    }
}
