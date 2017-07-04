
import java.util.*;

public class Ohjelma {
 public static void yla(int montako, String kirjain){
     while(montako>0){
     System.out.print(kirjain);
 montako--;
     }
     System.out.println("");
 }  
 public static void keski(int montako, String kirjain){
     System.out.print(kirjain);
  for(montako=montako-2; montako>0; montako--){
      System.out.print(" "); 
      montako--;
}
     System.out.print(kirjain); 
 }
 public static void main(String[] args) {
    
    Scanner lukija=new Scanner(System.in);
//    public static void tulostax(int montako) {
    keski(1, "k");    
//        System.out.println("Korkeus?");
//        int korkeus=Integer.parseInt(lukija.nextLine());
//        System.out.println("Leveys?");
//        int leveys=Integer.parseInt(lukija.nextLine());
//        System.out.println("Kirjain?");
//        String kirjain=lukija.nextLine();
//   
// yla(leveys,kirjain );
// for(korkeus=korkeus-2; korkeus>0; korkeus--){
//     keski(leveys, kirjain);
// korkeus--;
// }
//  yla(leveys, kirjain);     
        

        
//        for (montako = montako; montako > 0; montako--) {
//            System.out.print("x");
//        }
//        System.out.println("");
//    }
//
//    public static void tulostaxo(int montako) {
//
//        for (montako = montako; montako > 0; montako--) {
//            System.out.print("x");
//            montako--;
//            if (montako > 0) {
//                System.out.print("o");
//            }
//
//        }
//        System.out.println("");
//    }
//
//    public static void tulostaxxz(int montako) {
//        for (montako = montako; montako > 0; montako--) {
//            System.out.print("x");
//            montako--;
//            if (montako > 0) {
//                System.out.print("x");
//            }
//            montako--;
//            if (montako > 0) {
//                System.out.print("z");
//            }
//
//        }
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner lukija = new Scanner(System.in);
//        System.out.println("Leveys?");
//        int leveys = Integer.parseInt(lukija.nextLine());
//        System.out.println("Korkeus?");
//        int korkeus = Integer.parseInt(lukija.nextLine());
//        while (korkeus > 0) {
//            tulostax(leveys);
//            korkeus--;
//            if (korkeus > 0) {
//                tulostaxo(leveys);
//                korkeus--;
//            }
//            if (korkeus > 0) {
//                tulostax(leveys);
//                korkeus--;
//            }
//            if (korkeus > 0) {
//                tulostaxo(leveys);
//                korkeus--;
//            }
//            if (korkeus > 0) {
//                tulostaxxz(leveys);
//                korkeus--;
//            }
//        }

    }
}

