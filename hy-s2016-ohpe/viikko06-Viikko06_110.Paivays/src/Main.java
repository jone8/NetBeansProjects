
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!

        Paivays munPaiva = new Paivays(29, 12, 2011);
        System.out.println(munPaiva);
        munPaiva.etene();
        System.out.println(munPaiva);

        System.out.println(munPaiva.paivienPaasta(10));

    }
}
