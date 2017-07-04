
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Maksukortti antinKortti = new Maksukortti(0.9);

        Kassapaate unicafeExactum = new Kassapaate();

        double vaihtorahaa = unicafeExactum.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        System.out.println(unicafeExactum.syoEdullisesti(antinKortti));
        System.out.println(unicafeExactum);
        System.out.println(antinKortti.saldo());
        unicafeExactum.lataaRahaaKortille(antinKortti, 10);
        System.out.println(antinKortti.saldo());
        antinKortti.otaRahaa(2);
        System.out.println(antinKortti.saldo());
    }
}
