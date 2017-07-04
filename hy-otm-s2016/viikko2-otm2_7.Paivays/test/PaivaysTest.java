
import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-7")
public class PaivaysTest {

    @Test
    public void toStringUutenavuotena() {
        Paivays paivays = new Paivays(1, 1, 2017);
        assertEquals("1.1.2017", paivays.toString());
    }

    @Test
    public void eteneKuukaudenVaihtuessa() {
        Paivays paivays = new Paivays(29, 2, 2017);
        paivays.etene();
        paivays.etene();
        assertEquals("1.3.2017", paivays.toString());
    }

    @Test
    public void eteneVuodenVaihtuessa() {
        Paivays paivays = new Paivays(30, 12, 2018);
        paivays.etene();
        assertEquals("1.1.2019", paivays.toString());
    }

    @Test
    public void eteneVoiEdetaMontaPaivaa() {
        Paivays paivays = new Paivays(2, 8, 2019);
        paivays.etene(10);
        assertEquals("12.8.2019", paivays.toString());
    }

    @Test
    public void eteneMontaPaivaaToimiiKuukaudenVaihtuessa() {
        Paivays paivays = new Paivays(25, 10, 2016);
        paivays.etene(6);
        assertEquals("1.11.2016", paivays.toString());
    }

    @Test
    public void eteneMontaPaivaaToimiiVuodenVaihtuessa() {
        Paivays paivays = new Paivays(25, 12, 2016);
        paivays.etene(6);
        assertEquals("1.1.2017", paivays.toString());
    }

    @Test
    public void metodiPaivienPaastatoimii() {
        Paivays paivays = new Paivays(3, 2, 2017);
        Paivays uusiPvm = paivays.paivienPaasta(3);
        assertEquals("3.2.2017", paivays.toString());
        assertEquals("6.2.2017", uusiPvm.toString());
    }

    @Test
    public void PaivienPaastaVuodenVaihtuessa() {
        Paivays paivays = new Paivays(24, 12, 2017);
        Paivays uusiPvm = paivays.paivienPaasta(7);
        assertEquals("24.12.2017", paivays.toString());
        assertEquals("1.1.2018", uusiPvm.toString());
    }

    @Test
    public void PaivienPaastaKuukaudenVaihtuessa() {
        Paivays paivays = new Paivays(24, 11, 2017);
        Paivays uusiPvm = paivays.paivienPaasta(7);
        assertEquals("24.11.2017", paivays.toString());
        assertEquals("1.12.2017", uusiPvm.toString());
    }
}
