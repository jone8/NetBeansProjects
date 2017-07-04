
public class Ohjelma {

    public static void main(String[] args) {
        int luku = 1;
        for (int korkeus = 1; korkeus <= 10; korkeus++) {
            int tulostettavaLuku = 0;
            for (int apu = 1; apu <= 10; apu++) {

                tulostettavaLuku = tulostettavaLuku + luku;

                System.out.print(tulostettavaLuku);
                System.out.print(" ");
            }
            System.out.println("");
            luku = luku + 1;
        }
    }
}
