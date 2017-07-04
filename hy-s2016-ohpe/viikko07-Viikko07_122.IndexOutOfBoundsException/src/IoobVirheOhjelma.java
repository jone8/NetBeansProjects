
import java.util.*;

public class IoobVirheOhjelma {

    public static void main(String[] args) {
        // Toteuta tänne ohjelma, jossa tapahtuu IndexOutOfBounds -virhe
        ArrayList<String> lista = new ArrayList<>();
        lista.add("kello");
        lista.add("koira");
        lista.get(3);
    }
}
