
public class Ohjelma {

    public static void main(String[] args) {
        Ympyra ympyra = new Ympyra(2.6, 2.4, 1);
        Ympyra toinenYmpyra = new Ympyra(2, 2, 6);
        System.out.println(ympyra.osuuko(toinenYmpyra));
    }

}
