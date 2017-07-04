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
public class OstoksiaTest {

    Ostoskori ostoskori;

    public OstoksiaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ostoskori = new Ostoskori();
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
    public void luodunOstoskorinHintaJaTuotteidenMaaraOnNolla() {
        assertEquals(0, ostoskori.hinta());
        assertEquals(0, ostoskori.tuotteitaKorissa());
    }

    @Test
    public void yhdenTuotteenLisaamisenJalkeenKorissaYksiTuote() {
        Tuote karjala = new Tuote("Karjala", 3);
        ostoskori.lisaaTuote(karjala);
        assertEquals(1, ostoskori.tuotteitaKorissa());
    }

    @Test
    public void yhdenTuotteenLisaamisenJalkeenKorinHintaSamaKuinTuotteenHinta() {
        Tuote karjala = new Tuote("Karjala", 3);
        ostoskori.lisaaTuote(karjala);
        assertEquals(3, ostoskori.hinta());
    }

    @Test
    public void kahdenEriTuotteenLisaamisenJalkeenKorissaKaksiTuotetta() {
        Tuote karjala = new Tuote("Karjala", 3);
        Tuote leipa = new Tuote("leipa", 4);
        ostoskori.lisaaTuote(karjala);
        ostoskori.lisaaTuote(leipa);
        assertEquals(2, ostoskori.tuotteitaKorissa());
    }

    @Test
    public void kahdenEriTuotteenLisaamisenJalkeenKorinHintaOikea() {
        Tuote karjala = new Tuote("Karjala", 3);
        Tuote leipa = new Tuote("leipa", 4);
        ostoskori.lisaaTuote(karjala);
        ostoskori.lisaaTuote(leipa);
        assertEquals(7, ostoskori.hinta());
    }

    @Test
    public void kahdenSamanTuotteenLisaamisenJalkeenKorissaOnKaksiTuotetta() {
        Tuote karjala = new Tuote("Karjala", 3);
        ostoskori.lisaaTuote(karjala);
        ostoskori.lisaaTuote(karjala);
        assertEquals(2, ostoskori.tuotteitaKorissa());
    }

    @Test
    public void kahdenSamanTuotteenLisaamisenJalkeenHintaOikea() {
        Tuote karjala = new Tuote("Karjala", 3);
        ostoskori.lisaaTuote(karjala);
        ostoskori.lisaaTuote(karjala);
        assertEquals(6, ostoskori.hinta());
    }

    @Test
    public void metodiOstoksetToimii() {
        Tuote karjala = new Tuote("Karjala", 3);
        ostoskori.lisaaTuote(karjala);
        assertEquals(1, ostoskori.ostokset().size());

    }
}
