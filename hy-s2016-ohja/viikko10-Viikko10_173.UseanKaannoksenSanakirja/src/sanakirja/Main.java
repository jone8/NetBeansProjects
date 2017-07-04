package sanakirja;

public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        OmaUseanKaannoksenSanakirja sanak = new OmaUseanKaannoksenSanakirja();
        sanak.lisaa("koira", "dog");
        sanak.lisaa("koira", "chien");
        sanak.lisaa("ihminen", "human");
        System.out.println(sanak.kaanna("koira"));
        sanak.poista("koira");
        System.out.println(sanak.kaanna("ihminen"));

        UseanKaannoksenSanakirja sanakirja = new OmaUseanKaannoksenSanakirja();
        sanakirja.lisaa("kuusi", "six");
        sanakirja.lisaa("kuusi", "spruce");

        sanakirja.lisaa("pii", "silicon");
        sanakirja.lisaa("pii", "pi");

        System.out.println(sanakirja.kaanna("kuusi"));
        sanakirja.poista("pii");
        System.out.println(sanakirja.kaanna("pii"));
    }
}
