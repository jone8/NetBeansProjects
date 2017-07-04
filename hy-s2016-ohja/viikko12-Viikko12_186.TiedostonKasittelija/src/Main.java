
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        TiedostonKasittelija t = new TiedostonKasittelija();

        ArrayList<String> rivit = new ArrayList<>();
        rivit.add("koira");
        rivit.add("kissa");
        rivit.add("heppa");

        t.tallenna(("src/koesyote1.txt"), rivit);

        for (String rivi : t.lue("src/koesyote1.txt")) {
            System.out.println(rivi);

//            
//             for (String riv : t.lue("src/koesyote1.txt")) {
//            System.out.println(riv);
        }
    }
}
//}
