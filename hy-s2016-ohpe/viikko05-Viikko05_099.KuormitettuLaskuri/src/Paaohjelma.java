
public class Paaohjelma {

    public static void main(String[] args) {
        Laskuri testaaja = new Laskuri();
        System.out.println(testaaja.arvo());
        testaaja.lisaa();
        System.out.println(testaaja.arvo());
        testaaja.vahenna();
        System.out.println(testaaja.arvo());
        testaaja.lisaa(7);
        System.out.println(testaaja.arvo());
        testaaja.lisaa(-5);
        System.out.println(testaaja.arvo());

// tee tänne testikoodia
    }
}
