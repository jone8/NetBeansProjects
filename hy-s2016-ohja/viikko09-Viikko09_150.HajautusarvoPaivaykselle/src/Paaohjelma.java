
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Paivays paivays = new Paivays(1, 1, 1000);
        System.out.println(paivays.hashCode());
        Paivays toinenpaivays= new Paivays(1, 1, 1900);
        System.out.println(toinenpaivays.hashCode());
    
    }
}
