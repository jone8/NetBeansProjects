
import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Before;

@Points("3-7")
public class JoukkueTest {

    Joukkue joukkue;

    @Before
    public void setUp() {
        joukkue = new Joukkue("Kumpulan pallo");
    }

    @Test
    public void alussaKokoNolla() {
        assertEquals(0, joukkue.koko());
    }

    @Test
    public void metodiKokoToimii() {
        Pelaaja aapeli = new Pelaaja("Aapeli", 10);
        Pelaaja paavo = new Pelaaja("Paavo");
        Pelaaja marja = new Pelaaja("Marja", 2);
        Pelaaja anneli = new Pelaaja("Anneli");

        joukkue.lisaaPelaaja(aapeli);
        joukkue.lisaaPelaaja(paavo);
        joukkue.lisaaPelaaja(marja);
        joukkue.lisaaPelaaja(anneli);

        assertEquals(4, joukkue.koko());
    }

    @Test
    public void eiAnnaLisataYliMaksimiKoonPelaajia() {
        Pelaaja aapeli = new Pelaaja("Aapeli");
        Pelaaja paavo = new Pelaaja("Paavo");
        Pelaaja marja = new Pelaaja("Marja");
        Pelaaja anneli = new Pelaaja("Anneli");
        Pelaaja pete = new Pelaaja("Pete");
        Pelaaja kimmo = new Pelaaja("Kimmo");

        joukkue.lisaaPelaaja(aapeli);
        joukkue.lisaaPelaaja(paavo);
        joukkue.lisaaPelaaja(marja);
        joukkue.lisaaPelaaja(anneli);
        joukkue.lisaaPelaaja(pete);
        joukkue.lisaaPelaaja(kimmo);
        assertEquals(5, joukkue.koko());
    }

    @Test
    public void metodiHaeNimiToimii() {

        assertEquals("Kumpulan pallo", joukkue.haeNimi());
    }

    @Test
    public void metodiAsetaMaksimiKokoToimii() {
        joukkue.asetaMaksimikoko(1);
        Pelaaja aapeli = new Pelaaja("Aapeli", 10);
        Pelaaja paavo = new Pelaaja("Paavo");
        Pelaaja marja = new Pelaaja("Marja", 2);
        Pelaaja anneli = new Pelaaja("Anneli");

        joukkue.lisaaPelaaja(aapeli);
        joukkue.lisaaPelaaja(paavo);
        joukkue.lisaaPelaaja(marja);
        joukkue.lisaaPelaaja(anneli);

        assertEquals(1, joukkue.koko());
    }

    @Test
    public void metodiMaalitToimii() {
        Pelaaja aapeli = new Pelaaja("Aapeli", 10);
        Pelaaja paavo = new Pelaaja("Paavo");
        Pelaaja marja = new Pelaaja("Marja", 2);
        Pelaaja anneli = new Pelaaja("Anneli");

        joukkue.lisaaPelaaja(aapeli);
        joukkue.lisaaPelaaja(paavo);
        joukkue.lisaaPelaaja(marja);
        joukkue.lisaaPelaaja(anneli);

        joukkue.maalit();

        assertEquals(12, joukkue.maalit());
    }

}
