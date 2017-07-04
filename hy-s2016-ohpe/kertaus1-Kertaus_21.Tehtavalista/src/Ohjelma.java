
public class Ohjelma {

    public static void main(String[] args) {
Tehtava t=new Tehtava("Siivoa koti");
        Tehtavalista lista = new Tehtavalista();
lista.lisaa("Käy kaupassa");
lista.lisaa("Siivoa koti");
lista.lisaa("Lenkitä koira");
System.out.println(lista);

        System.out.println(t.getonkoTehty());  

//lista.asetaTehdyksi(t);
//System.out.println(lista);
//Tehtava t = lista.annaTehtava(“Käy kaupassa”);
//t.asetaTekemattomaksi();
//lista.lisaa("Imuroi");
//System.out.println(lista);
    }

}
