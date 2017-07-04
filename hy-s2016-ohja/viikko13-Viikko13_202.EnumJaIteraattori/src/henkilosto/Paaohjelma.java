package henkilosto;

public class Paaohjelma {

    public static void main(String[] args) {

        Tyontekijat yliopisto = new Tyontekijat();
        yliopisto.lisaa(new Henkilo("Matti", Koulutus.FT));
        yliopisto.lisaa(new Henkilo("Pekka", Koulutus.FilYO));

        System.out.println("==");

        yliopisto.tulosta();

        yliopisto.irtisano(Koulutus.FilYO);

        System.out.println("==");

        yliopisto.tulosta();

        yliopisto.tulosta(Koulutus.FT);

//        
//Tyontekijat t = new Tyontekijat(); 
//Henkilo h = new Henkilo("Arto", Koulutus.FT); 
//        System.out.println(h.getKoulutus());
//t.lisaa(h); 
//t.tulosta(Koulutus.FT); 
    }
}
