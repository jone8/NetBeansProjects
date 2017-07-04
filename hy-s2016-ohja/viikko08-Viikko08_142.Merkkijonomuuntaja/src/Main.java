
public class Main {

    public static void main(String[] args) {
//         Testaa ohjelmaasi täällä
//       Muuntaja skanditPois = new Muuntaja();
//skanditPois.lisaaMuunnos(new Muunnos('ä', 'a'));
//skanditPois.lisaaMuunnos(new Muunnos('ö', 'o'));
//System.out.println(skanditPois.muunna("ääliö älä lyö, ööliä läikkyy"));

String sana = "porkkana";
Muunnos muunnos1 = new Muunnos('a', 'b');
sana = muunnos1.muunna(sana);

System.out.println(sana);

Muunnos muunnos2 = new Muunnos('k', 'x');
sana = muunnos2.muunna(sana);

System.out.println(sana);    
    
    }

}
