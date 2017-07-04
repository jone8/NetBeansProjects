
public class Paaohjelma {

    public static void main(String[] args) {

        onViikonpaiva("ti");
        onViikonpaiva("lu");

        kaikkiVokaaleja("merkkijonoo");
        kaikkiVokaaleja("aeuyyoaöä");

        hopohopo("höpöhöpöhöpöhöpöhöpöhöpö");
        hopohopo("hopohopo");
        hopohopo("pöhö");
        hopohopo("merkkijono");
    }

    public static boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            System.out.println("Muoto on oikea");
            return true;
        }
        System.out.println("Muoto ei ole oikea");
        return false;
    }

    public static boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[a|e|y|u||i|o|å|ö|ä]*")) {
            System.out.println("Muoto on oikea");
            return true;
        }
        System.out.println("Muoto ei ole oikea");
        return false;
    }

    public static boolean hopohopo(String merkkijono) {
        if (merkkijono.matches("(höpö)*")) {
            System.out.println("Muoto on oikea");
            return true;
        }
        System.out.println("Väärin!");
        return false;
    }
//
//    public static boolean kellonaika(String merkkijono) {
//        if (merkkijono.matches([0-2])) {
//            System.out.println("Muoto on oikea");
//            return true;
//        }
//        System.out.println("Väärin!");
//        return false;
//    }

}
