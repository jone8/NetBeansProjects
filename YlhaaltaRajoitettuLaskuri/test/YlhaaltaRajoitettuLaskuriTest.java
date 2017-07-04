/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kari
 */
public class YlhaaltaRajoitettuLaskuriTest {

    YlhaaltaRajoitettuLaskuri laskuri;

    public YlhaaltaRajoitettuLaskuriTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        laskuri = new YlhaaltaRajoitettuLaskuri(4);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    }

    @Test
    public void alkuarvoOnNolla() {

        assertEquals(0, laskuri.arvo());
    }

    @Test
    public void laskuriEteneeKerran() {
        laskuri.seuraava();
        assertEquals(1, laskuri.arvo());
    }

    @Test
    public void laskuriEteneeKaksiKertaa() {
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(2, laskuri.arvo());
    }

    @Test
    public void laskuriEteneeYlarajaanAsti() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(4, laskuri.arvo());
    }

    @Test
    public void laskuriEiYlitaYlaRajaa() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(0, laskuri.arvo());
    }

    @Test
    public void laskuriEteneeNormaalistiNollanJalkeen() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(1, laskuri.arvo());
    }

    @Test
    public void asetaArvoToimiiOikeinJosArvoSallitullaValilla() {
        laskuri.asetaArvo(3);
        assertEquals(3, laskuri.arvo());
    }

    @Test
    public void asetaArvoEiAsetaArvoaJosArvoVaarallaValilla() {
        laskuri.asetaArvo(7);
        assertEquals(0, laskuri.arvo());
    }

    @Test
    public void toStringTuottaaEtunollanKunArvoAlleKymmenen() {
        laskuri.asetaArvo(2);

        assertEquals("0" + laskuri.arvo(), laskuri.toString());
    }

    @Test
    public void toStringEiTuotaEtuNollaaKunArvoYliKymmenen() {
        YlhaaltaRajoitettuLaskuri toinenLaskuri = new YlhaaltaRajoitettuLaskuri(20);
        toinenLaskuri.asetaArvo(15);
        assertEquals("15", toinenLaskuri.toString());
    }
}
