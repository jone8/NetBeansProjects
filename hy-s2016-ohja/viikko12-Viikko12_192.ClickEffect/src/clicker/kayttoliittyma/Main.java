package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import clicker.sovelluslogiikka.OmaLaskuri;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Laskuri la = new OmaLaskuri();

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(la);
        SwingUtilities.invokeLater(kayttoliittyma);

    }
}
