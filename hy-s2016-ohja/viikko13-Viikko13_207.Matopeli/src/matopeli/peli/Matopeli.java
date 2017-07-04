package matopeli.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import matopeli.Suunta;
import matopeli.domain.Mato;
import matopeli.domain.Omena;
import matopeli.gui.Paivitettava;

public class Matopeli extends Timer implements ActionListener {

    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitettava paivitettava;
    private Mato pelinMato;
    private Omena pelinOmena;
    private Random arpoja;

    public Matopeli(int leveys, int korkeus) {
        super(1000, null);

        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.pelinMato = new Mato(leveys / 2, korkeus / 2, Suunta.ALAS);

        this.arpoja = new Random();
        while (true) {
            this.pelinOmena = new Omena(arpoja.nextInt(leveys), arpoja.nextInt(korkeus));
            if (pelinOmena.getX() != leveys / 2 || pelinOmena.getY() != korkeus / 2) {
                return;
            }

        }

    }

    public boolean jatkuu() {
        return jatkuu;
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (!jatkuu) {
            return;
        }

        this.pelinMato.liiku();
//        this.pelinMato.lisaaMatoonPala(100, 100);

        if (this.pelinMato.osuu(pelinOmena)) {
            this.pelinMato.kasva();

            Omena uusiOmena = null;
            while (true) {
                uusiOmena = new Omena(arpoja.nextInt(leveys), arpoja.nextInt(korkeus));
                if (!this.pelinMato.osuu(uusiOmena)) {
                    this.pelinOmena = uusiOmena;
                    return;
                }
            }

        }

        if (this.pelinMato.osuuItseensa()) {
            jatkuu = false;
        }

        if (this.pelinMato.getMadonPaaPalaX() == -1 || this.pelinMato.getMadonPaaPalaY() == -1
                || this.pelinMato.getMadonPaaPalaX() == this.leveys
                || this.pelinMato.getMadonPaaPalaY() == this.korkeus) {
            jatkuu = false;
        }

        this.paivitettava.paivita();

//        setDelay(1000 / this.pelinMato.getPituus());
        setDelay(2000/ this.pelinMato.getPituus());
    }

    public Mato getMato() {
        return this.pelinMato;
    }

    public void setMato(Mato mato) {
        this.pelinMato = mato;
    }

    public Omena getOmena() {
        return this.pelinOmena;
    }

    public void setOmena(Omena omena) {
        this.pelinOmena = omena;
    }

//    private void arvoOmena(Omena omena) {
//        this.arpoja = new Random();
//        while (true) {
//            omena = new Omena(arpoja.nextInt(leveys), arpoja.nextInt(korkeus));
//            if (pelinOmena.getX() != leveys / 2 || pelinOmena.getY() != korkeus / 2) {
//                return;
//            }
//        }
//    }
}
