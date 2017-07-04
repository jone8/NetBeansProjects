
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(1);
        luvut.add(3);
        luvut.add(5);
        luvut.add(3);
       luvut.add(1);

        System.out.println("Yleisin luku: " + yleisinLuku(luvut));
    }

    public static int yleisinLuku(ArrayList<Integer> luvut) {
        int eniten = 0;
         int enimmanMaara = 0;
           
       
            for (int apu = 0; apu < luvut.size(); apu++) {
          int verrattava = luvut.get(apu); 
             int maara=0;   
           
            for (int eka : luvut) {
                if (verrattava == eka) {
                    maara++;
                
                }
            }

           
            if (maara >= enimmanMaara) {
                eniten = luvut.get(apu);
                enimmanMaara = maara;
            }
        
            
            }
        return eniten;
    }

}
