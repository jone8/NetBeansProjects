
import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-6")
public class AsuntoTest {

    @Test
    public void asunnonLuominenOnnistuu() {
        Asunto asunto = new Asunto(1, 10, 1000);
        assertFalse(asunto == null);
    }

    @Test
    public void metodiSuurempiToimii() {
        Asunto asunto = new Asunto(1, 10, 1000);
        Asunto kerrosAsunto = new Asunto(1, 20, 1000);
        assertEquals(asunto.suurempi(kerrosAsunto), false);
    }

    @Test
    public void metodiHintaEroToimii() {
        Asunto asunto = new Asunto(1, 15, 5000);
        Asunto kerrosAsunto = new Asunto(1, 20, 3000);
        assertEquals(asunto.hintaero(kerrosAsunto), 15000);
    }

    @Test
    public void metodiHintaEroEiPalautaNegatiivista() {
        Asunto asunto = new Asunto(1, 15, 5000);
        Asunto kerrosAsunto = new Asunto(1, 20, 3000);
        assertEquals(kerrosAsunto.hintaero(asunto), 15000);
    }

    @Test
    public void metodiKalliimpiToimii() {
        Asunto asunto = new Asunto(1, 10, 10);
        Asunto kerrosAsunto = new Asunto(1, 20, 10);
        assertEquals(kerrosAsunto.kalliimpi(asunto), true);
    }
}
