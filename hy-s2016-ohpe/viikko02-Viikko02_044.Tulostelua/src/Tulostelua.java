
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
        // 44.1
    }

    public static void tulostaNelio(int sivunpituus) {

        int extra = sivunpituus;
        while (extra > 0) {
            tulostaTahtia(sivunpituus);
            extra--;
        }

        // 44.2
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        while (korkeus > 0) {
            tulostaTahtia(leveys);
            korkeus--;
        }
// 44.3
    }

    public static void tulostaKolmio(int koko) {
        int apu = 1;
        while (apu <= koko) {
            tulostaTahtia(apu);
            apu++;
        }
// 44.4 
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
