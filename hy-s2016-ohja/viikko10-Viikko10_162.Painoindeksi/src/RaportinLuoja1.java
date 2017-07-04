
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;
import java.util.*;

public class RaportinLuoja1 implements Raportoiva {

    private List<String> alipainoiset;
    private List<String> normaalipainoiset;
    private List<String> ylipainoiset;
    private List<String> merkittavastiYlipainoiset;
    private PainoindeksiRaportti raportti1;

    public RaportinLuoja1() {
        this.alipainoiset = new ArrayList<>();
        this.normaalipainoiset = new ArrayList<>();
        this.ylipainoiset = new ArrayList<>();
        this.merkittavastiYlipainoiset = new ArrayList<>();

        this.raportti1 = new PainoindeksiRaportti(alipainoiset,
                normaalipainoiset, ylipainoiset, merkittavastiYlipainoiset);
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        for (Henkilo eka : henkilotiedot) {

            double painoindeksi = 0;
            painoindeksi = eka.getPaino() / (eka.getPituus() * eka.getPituus());
            if (painoindeksi < 18.5) {
                alipainoiset.add(eka.getNimi());
            } else if (painoindeksi < 25) {
                normaalipainoiset.add(eka.getNimi());
            } else if (painoindeksi < 30) {
                ylipainoiset.add(eka.getNimi());

            } else if (painoindeksi > 30) {
                merkittavastiYlipainoiset.add(eka.getNimi());
            }
        }


        return raportti1;
    }
}
