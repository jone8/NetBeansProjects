package sanakirja;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        MuistavaSanakirja sanakirja = new MuistavaSanakirja("src/sanat.txt");

        sanakirja.lataa();

//     sanakirja.poista("uno");
//     sanakirja.poista("kaksi");
//      sanakirja.poista("kissa");
//      sanakirja.poista("koira");
        sanakirja.lisaa("frog", "sammakko");
        sanakirja.lisaa("dog", "koira");
        sanakirja.tallenna();

    }
}
