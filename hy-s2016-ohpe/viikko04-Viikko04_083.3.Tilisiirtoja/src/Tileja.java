
public class Tileja {

    public static void main(String[] args) {
        Tili tiliA = new Tili("Tili A", 100);
        Tili tiliB = new Tili("Tili B", 0);
        Tili tiliC = new Tili("Tili C", 0);
        tilisiirto(tiliA, tiliB, 50);
        tilisiirto(tiliB, tiliC, 25);
        System.out.println(tiliA);
        System.out.println(tiliB);
        System.out.println(tiliC);

// Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
    }

    public static void tilisiirto(Tili mista, Tili minne, double paljonko) {
        mista.otto(paljonko);
        minne.pano(paljonko);
    }
}
