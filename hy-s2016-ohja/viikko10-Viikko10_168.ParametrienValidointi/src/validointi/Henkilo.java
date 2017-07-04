package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

        if (nimi == null) {
            throw new IllegalArgumentException("Nimi ei saa olla null");
        }
        if (nimi == "") {
            throw new IllegalArgumentException("Nimi ei saa olla tyhjä");
        }
        if (nimi.length() > 40) {
            throw new IllegalArgumentException("Nimen täytyy olla alle 41 merkkiä"
                    + "pitkä");
        }
        if (ika < 0 || ika > 120) {
            throw new IllegalArgumentException("Iän tulee olla väliltä 0-120");
        }
        nimi = nimi;
        ika = ika;

    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
