
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Sana: ");
        String sana = lukija.nextLine();
        int sananPituus = sana.length();
        for (int apu = 0; apu < sananPituus; apu++) {
            System.out.println(sana.charAt(apu));
        }
    }

}
