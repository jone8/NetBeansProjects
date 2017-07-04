
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        Rekisterinumero other = (Rekisterinumero) obj;

        if (!this.maa.equals(other.maa)) {
            return false;
        }
        if (!this.rekNro.equals(other.rekNro)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.maa.hashCode() + this.rekNro.hashCode();
    }
}
