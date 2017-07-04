
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RaportinLuoja2 implements Raportoiva {
    
    private List<String> alipainoiset;
    private List<String> normaalipainoiset;
    private List<String> ylipainoiset;
    private List<String> merkittavastiYlipainoiset;
    private PainoindeksiRaportti raportti1;
    
    public RaportinLuoja2() {
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
                lisaaNimi(alipainoiset, eka);
            } else if (painoindeksi < 25) {
                lisaaNimi(normaalipainoiset, eka);
            } else if (painoindeksi < 30) {
                lisaaNimi(ylipainoiset, eka);
                
            } else if (painoindeksi > 30) {
                lisaaNimi(merkittavastiYlipainoiset, eka);
            }
        }


        return raportti1;
    }
    
    public void lisaaNimi(List<String> lista, Henkilo eka) {
        lista.add(eka.getNimi());
    }    
    
}
