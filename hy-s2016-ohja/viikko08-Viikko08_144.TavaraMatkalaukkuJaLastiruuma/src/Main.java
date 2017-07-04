
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!

        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lisaaMatkalaukutTiiliskivilla(lastiruuma);
        System.out.println(lastiruuma);
    }

    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {

        for (int paino = 1; paino <= 100; paino++) {

            Tavara tiiliskivi = new Tavara("tiiliskivi", paino);
            Matkalaukku laukku = new Matkalaukku(100);
            laukku.lisaaTavara(tiiliskivi);
            lastiruuma.lisaaMatkalaukku(laukku);
        }

        // 100 matkalaukun lisääminen, jokaiseen tulee tiiliskivi
    }
}
