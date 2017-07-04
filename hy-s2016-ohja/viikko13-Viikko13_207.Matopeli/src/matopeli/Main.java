package matopeli;

import java.util.Random;
import matopeli.domain.Pala;
import javax.swing.SwingUtilities;
import matopeli.domain.Mato;
import matopeli.gui.Kayttoliittyma;
import matopeli.peli.Matopeli;

public class Main { 

    public static void main(String[] args) {
        Mato matonen = new Mato(3, 2, Suunta.ALAS);
        System.out.println(matonen.getPalat());
        matonen.liiku();
        System.out.println(matonen.getPalat());
        System.out.println(matonen.getPituus());
        matonen.liiku();
        System.out.println(matonen.getPituus());

        Matopeli matopeli = new Matopeli(20, 20);

        System.out.println(matopeli.getOmena());
        System.out.println(matopeli.getMato().getPalat());

        Kayttoliittyma kali = new Kayttoliittyma(matopeli, 20);
        SwingUtilities.invokeLater(kali);

        while (kali.getPaivitettava() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Piirtoalustaa ei ole vielä luotu.");
            }
        }

        matopeli.setPaivitettava(kali.getPaivitettava());
        matopeli.start();

// kirjoita testikoodia tänne
// n. 10h. Niistä 6 h 6/7 testeihin.
    }
}
