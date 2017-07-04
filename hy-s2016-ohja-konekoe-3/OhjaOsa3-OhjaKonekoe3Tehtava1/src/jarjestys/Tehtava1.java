package jarjestys;

import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
Jarjestaja jarjestaja=new Jarjestaja(lukija);
jarjestaja.aloita();
    }

}
