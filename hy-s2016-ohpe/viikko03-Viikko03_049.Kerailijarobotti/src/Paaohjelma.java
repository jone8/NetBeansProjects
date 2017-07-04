
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {

        Ohjain.kaynnista();
int y=0;
while(y<14){  
  int x=0; 
   
  while(x<13){
   Ohjain.liiku();
  
  int c=0;
   while(c<1) {
       if(x%2==0){
       
           Ohjain.nosta();
      c++;
       }
       else{
           c++;}
       
   x++;    
   }
   

  }

  
    if(y%2==0){ 
        Ohjain.vasen();
    Ohjain.liiku();
    Ohjain.vasen();
    y++;
    }
    else{
        Ohjain.oikea();
        Ohjain.liiku();
        Ohjain.oikea();
    y++;
    }     
}
        


// ohjelmoi liikkeet tänne
        // Huom! Älä luota testeihin -- kokeile, että ohjelma toimii
        // oikein ohjelmaa ajamalla.
        Ohjain.sammuta();
    }

}
