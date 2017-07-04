
import java.util.ArrayList;
import java.util.Random;

public class LottoRivi {

    private ArrayList<Integer> numerot;
private Random random;

    public LottoRivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    this.random=new Random();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
       
        int i=7;
        int numero;
        while(i>0){
         numero=random.nextInt(38)+1;
        this.numerot.add(numero);
         i--;
        }
        
// Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
    }

    public boolean sisaltaaNumeron(int numero) {
        numerot.contains(numero);
// Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return true;
    }
}
