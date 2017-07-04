
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(24);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(60);
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(60);
        tunnit.asetaArvo(tunnitAlussa);
        minuutit.asetaArvo(minuutitAlussa);
        sekunnit.asetaArvo(sekunnitAlussa);

// luodaan kello joka asetetaan parametrina annettuun aikaan
    }

    public void etene() {

     
       

        // kello etenee sekunnilla
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return "";
    }
}
