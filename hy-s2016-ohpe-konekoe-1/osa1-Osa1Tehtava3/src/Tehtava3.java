
import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
      
      
      int pienempi=0;
      int edluku=1000;
      int suurempi=0;
      int edelluku=-1000;
      
      
      System.out.println("Syötä mittaus: ");
      while(true){
        int luku=Integer.parseInt(lukija.nextLine());
         if(luku>999) {
            break;
        } 
        
         int apu=0;  
        
          
        
        
        if(luku<edluku&& luku<999 && luku>-999){
            pienempi=luku;
            edluku=pienempi;
        }
        else if(luku>edluku&& luku<999&& luku>-999){
            pienempi=edluku;
                    edluku=pienempi;
        }
        while(apu<1){
            if(luku<edelluku&& luku<999 &&luku>-999){
                suurempi=luku;
                edelluku=suurempi;
            apu++;
            }
            else if(luku>-999&& luku<999){
                suurempi=luku;
                edelluku=suurempi;
            }
            
       
        }
        }
        System.out.println("Pienin mittaus: " + pienempi);
        System.out.println("Suurin mittaus: " + suurempi); 



// int pienempi = 0;
       //int suurempi=0;
       // int edluku = 1000;
        //int edelluku=-1000;

        //while (true) {
           // System.out.print("Syötä mittaus: ");
           // int luku = Integer.parseInt(lukija.nextLine());
           // if (luku > 999 || luku < -999) {
             //   break;
            //} else if (luku >= -999 && luku <= 999) {
              //  if (luku < edluku) {
                  //  pienempi = luku;
                  // suurempi=edluku;
                    
                    //System.out.println(suurempi);
                   // edluku = pienempi;
                    
                    
                //} else {
                 //   pienempi = edluku;
                   // suurempi=luku;
                    
                    //System.out.println(suurempi);
                    //edluku = pienempi;
                //}

           // }
        //}
        //System.out.println("Pienin mittaus: " + pienempi);
        //System.out.println("Suurin mittaus: " + suurempi);
    }
}
