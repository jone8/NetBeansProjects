import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int annettu= Integer.parseInt(lukija.nextLine());
        int apu= annettu;
        int tuloste=annettu; 
        while(apu>1&& annettu>0){
            apu--;
            tuloste=tuloste*apu;
        }
        if(tuloste>0)    {
            System.out.println(tuloste);
        }
        if (annettu==0){
            System.out.println("1");
        }       
   
    
    
    }
}
