
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tee tänne pääohjelma
        ArrayList<Opiskelija> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> haetut = new ArrayList<>();

        while (true) {

            System.out.print("Nimi: ");
            String uusiNimi = lukija.nextLine();
            if (uusiNimi.isEmpty()) {
                break;
            }

            System.out.print("Opiskelijanumero: ");
            String uusiNumero = lukija.nextLine();

            Opiskelija uusi = new Opiskelija(uusiNimi, uusiNumero);
            lista.add(uusi);
        }

        for (Opiskelija eka : lista) {

            System.out.println(eka);
        }
        System.out.println("Anna hakusana: ");
        String hakusana = lukija.nextLine();
        for (Opiskelija eka : lista) {
            String haettu = eka.haeNimi();
            String haettunro = eka.haeOpiskelijanumero();
            if (haettu.contains(hakusana)) {
                haetut.add(haettu + " " + "(" + haettunro + ")");
            }
        }
        System.out.println("Tulokset:");
        for (String eka : haetut) {
            System.out.println(eka);
        }

    }

}
