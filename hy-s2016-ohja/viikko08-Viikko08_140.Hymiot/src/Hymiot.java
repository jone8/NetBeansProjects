
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
        // tulostaHymioityna("Metodi");
        // tulostaHymioityna("Hajautustaulu");
        // tulostaHymioityna("Rajapinta");
        tulostaHymioityna("Mikael");
    }

    private static void tulostaHymioityna(String merkkijono) {

        hymioRivi(merkkijono);

        if (onkoParillinen(merkkijono)) {
            System.out.print(":) " + merkkijono + " :)");
            System.out.println("");
        } else {
            System.out.print(":) " + merkkijono + "  :)");
            System.out.println("");
        }
        hymioRivi(merkkijono);
    
    }

    private static void hymioRivi(String merkkijono) {
        if (onkoParillinen(merkkijono)) {

            for (int i = merkkijono.length(); i > merkkijono.length() / 2 - 3; i--) {
                System.out.print(":)");
            }
        } else {
            for (int i = merkkijono.length(); i > merkkijono.length() / 2 - 3; i--) {
                System.out.print(":)");
            }
        }
        System.out.println("");
    }

    private static boolean onkoParillinen(String merkkijono) {
        if (merkkijono.length() % 2 == 0) {
            return true;
        }
        return false;
    }

}
