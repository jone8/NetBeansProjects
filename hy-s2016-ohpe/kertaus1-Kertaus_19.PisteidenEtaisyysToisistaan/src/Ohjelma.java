
public class Ohjelma {

    public static void main(String[] args) {
        Piste piste = new Piste(2.4, 2.4);
        Piste toinenPiste = new Piste(2.4, 2);
        System.out.println(piste.etaisyys(toinenPiste));

    }

}
