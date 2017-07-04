package laatikot;

public class Main {
    
    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä

//        
//      Laatikko laatikko = new MaksimipainollinenLaatikko(5);
//laatikko.lisaa(new Tavara("a", 1));
//laatikko.lisaa(new Tavara("b", 2));
//laatikko.lisaa(new Tavara("c", 2));
//laatikko.lisaa(new Tavara("d", 1));
//laatikko.lisaa(new Tavara("f", 0));
//        System.out.println(laatikko.onkoLaatikossa(new Tavara("c")));  
        Tavara kello = new Tavara("kello", 1);
        Tavara saapas = new Tavara("saapas", 2);
        Tavara juusto = new Tavara("juusto", 7);
        Tavara kivi = new Tavara("kivi", 1);
        Tavara hoyhen = new Tavara("hoyhen", 0);
        
        Laatikko munLaatikko = new MaksimipainollinenLaatikko(10);
        munLaatikko.lisaa(kello);
        munLaatikko.lisaa(saapas);
        munLaatikko.lisaa(juusto);
        munLaatikko.lisaa(kivi);
        munLaatikko.lisaa(hoyhen);
        System.out.println(munLaatikko.onkoLaatikossa(kello));
        System.out.println(munLaatikko.onkoLaatikossa(saapas));
        System.out.println(munLaatikko.onkoLaatikossa(juusto));
        System.out.println(munLaatikko.onkoLaatikossa(kivi));
        System.out.println(munLaatikko.onkoLaatikossa(hoyhen));
        
    }
}
