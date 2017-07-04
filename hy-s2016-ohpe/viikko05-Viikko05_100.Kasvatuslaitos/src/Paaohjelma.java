
public class Paaohjelma {

    public static void main(String[] args) {
        Kasvatuslaitos kumpulanneuvola = new Kasvatuslaitos();
        Henkilo kukka = new Henkilo("Kukka", 2, 100, 7);
        System.out.println(kumpulanneuvola.punnitse(kukka));
        kumpulanneuvola.syota(kukka);
        System.out.println(kumpulanneuvola.punnitse(kukka));
        System.out.println(kumpulanneuvola.punnitukset());
// kirjoita tänne testikoodia 
    }
}
