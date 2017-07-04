
import java.util.Scanner;

public class Tehtava4 {

    public static void main(String[] args) {

        Pilli viulu = new Pilli("bjoing");
        Pilli huilu = new Pilli("hjuing");
        viulu.soita();
        huilu.soita();
        viulu.soita();
        // tulostaa:
        // 
        // bjoing
        // hjuing 
        // bjoing
    }

}
