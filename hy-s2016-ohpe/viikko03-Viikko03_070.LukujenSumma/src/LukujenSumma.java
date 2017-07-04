
import java.util.ArrayList;

public class LukujenSumma {

    public static int summa(ArrayList<Integer> lista) {
        int luku=0;
        for(int luvut: lista){
           luku=luku+luvut;
// Kirjoita koodia tänne

        }
        return (luku);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Summa: " + summa(lista));

        lista.add(10);

        System.out.println("Summa: " + summa(lista));
    }

}
