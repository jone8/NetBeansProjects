
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        Scanner tiedostonLukija = new Scanner((new File(tiedosto)));
        ArrayList<String> rivit = new ArrayList<>();
        while (tiedostonLukija.hasNextLine()) {
            rivit.add(tiedostonLukija.nextLine());
        }
        tiedostonLukija.close();
        return rivit;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        FileWriter tallentaja = new FileWriter(tiedosto);
        tallentaja.write(teksti);
        tallentaja.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        FileWriter tallentaja = new FileWriter(tiedosto);
        for (String tamaRivi : tekstit) {
            tallentaja.write(tamaRivi + "\n");
        }
        tallentaja.close();
    }
}
