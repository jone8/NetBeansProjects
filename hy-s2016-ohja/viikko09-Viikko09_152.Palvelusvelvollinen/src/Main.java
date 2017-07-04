
public class Main {

    public static void main(String[] args) {
        // Testaa koodiasi täällä!
        Sivari s = new Sivari();
        Asevelvollinen a = new Asevelvollinen(200);

        System.out.println(s.getTJ());
        System.out.println(a.getTJ());

        s.palvele();
        a.palvele();

        System.out.println(s.getTJ());
        System.out.println(a.getTJ());
    }
}
