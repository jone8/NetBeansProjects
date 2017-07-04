package tyokalut;

public class Main {

    public static void main(String[] args) {
        OmaDuplikaattienPoistaja dupl = new OmaDuplikaattienPoistaja();
        dupl.lisaa("kissa");
        dupl.lisaa("kissa");
        dupl.lisaa("heppa");
        dupl.lisaa("kissa");
        dupl.lisaa("koira");
        dupl.lisaa("heppa");

        System.out.println(dupl.getHavaittujenDuplikaattienMaara());
        System.out.println(dupl.getUniikitMerkkijonot());

        dupl.tyhjenna();
        System.out.println(dupl.getUniikitMerkkijonot());
        System.out.println(dupl.getHavaittujenDuplikaattienMaara());

// Testaa luokkaa täällä
    }
}
