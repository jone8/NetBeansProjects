
public class VahenevaLaskuri {

    private int arvo;
    private int alkuArvo;// oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.alkuArvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if (arvo > 0) {
            arvo--;
        }
    }

    public void nollaa() {
        arvo = 0;

    }

    public void palautaAlkuarvo() {
        arvo = alkuArvo;

    }
// kirjoita tänne metodin toteutus
    // laskurin arvon on siis tarkoitus vähentyä yhdellä

    // ja tänne muut metodit
}
