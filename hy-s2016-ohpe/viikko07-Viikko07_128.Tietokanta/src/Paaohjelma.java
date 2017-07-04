import java.util.*;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
    Scanner lukija=new Scanner(System.in);
        
        Lintu koira=new Lintu("koiruli", "koir");
     
    
    lisaa(lukija);
    
    }
public void lisaa(Scanner lukija){
    System.out.println("Nimi:");
    String nimi=lukija.nextLine();
    System.out.println("Latinankielinen nimi:");
    String latinanKielinenNimi=lukija.nextLine();
    Lintu lintu=new Lintu(nimi, latinanKielinenNimi);
}
    
}
