import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana: ");
        String sana=lukija.nextLine();
        System.out.println("Sanan pituus: ");
        int pituus=Integer.parseInt(lukija.nextLine());
        int tulos= sana.length()-pituus;
        System.out.println("Tulos: "+ sana.substring(tulos));
    }
}
