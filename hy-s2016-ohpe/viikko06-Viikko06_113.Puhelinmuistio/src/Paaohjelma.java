
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimiesi luokkien Henkilo ja Puhelinmuistio toimintaa

        Puhelinmuistio muistio = new Puhelinmuistio();

        Puhelinmuistio p = new Puhelinmuistio();
        p.lisaa("Pekka", "040-123654");
        p.lisaa("Jukka", "045-332211");
        p.haeNumero("Mikko");

        
        muistio.lisaa("Pekka Mikkola", "040-123123");
        muistio.lisaa("Antti Laaksonen", "045-456123");
        muistio.lisaa("Juhana Laurinharju", "050-222333");

        muistio.tulostaKaikki();

        System.out.println(muistio.haeNumero("Juhana Laurinharju"));
    }

}
