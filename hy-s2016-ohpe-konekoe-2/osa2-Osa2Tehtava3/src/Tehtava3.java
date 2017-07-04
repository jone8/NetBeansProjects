
import java.util.*;

public class Tehtava3 {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        System.out.print("Kuinka monta: ");
        int monta = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna lukuja:");
        int luku;
        while (monta > 0) {
            luku = Integer.parseInt(lukija.nextLine());

            luvut.add(luku);
            monta--;
        }

        while (apu < monta) {
            int apu = 0;
            lista.onkoListalla()
        }

        System.out.println("Tulos: " + onkoListalla());
//        int luku=0;
//        int uusiluku=0;
//        while(monta>0){
//          uusiluku=Integer.parseInt(lukija.nextLine());
//        if(uusiluku==luku){
//            continue;
//        }
//        else{
//            luku=uusiluku;
//        }
//        monta--;
//        }
//
//        System.out.println("Tulos: " + luku);
    }

    public static int onkoListalla(ArrayList<Integer> lista, int luku) {
        // kirjoita koodia tähän
        int tulos = 0;
        int montako = 0;
        for (int i : lista) {
            if (i == luku) {
                montako = montako + 1;
            }

            if (montako > 1) {
                tulos = 0;
            } else {
                tulos = luku;
            }
        }
        return tulos;

    }
}
