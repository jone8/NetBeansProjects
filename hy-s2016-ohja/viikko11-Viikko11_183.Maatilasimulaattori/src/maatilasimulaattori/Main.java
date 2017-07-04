package maatilasimulaattori;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Testaa täällä ohjelmaasi
// Lypsyrobotti lypsyrobotti = new Lypsyrobotti();
//Lehma lehma = new Lehma();
//System.out.println("");
//
//Maitosailio sailio = new Maitosailio();
//lypsyrobotti.setMaitosailio(sailio);
//System.out.println("Säiliö: " + sailio);
//
//for(int i = 0; i < 2; i++) {
//    System.out.println(lehma);
//    System.out.println("Elellään..");
//    for(int j = 0; j < 5; j++) {
//        lehma.eleleTunti();
//    }
//    System.out.println(lehma);
//
//    System.out.println("Lypsetään...");
//    lypsyrobotti.lypsa(lehma);
//    System.out.println("Säiliö: " + sailio);
//    System.out.println("");
Maatila maatila = new Maatila("Esko", new Navetta(new Maitosailio()));
Lypsyrobotti robo = new Lypsyrobotti();
maatila.asennaNavettaanLypsyrobotti(robo);

maatila.lisaaLehma(new Lehma());
maatila.lisaaLehma(new Lehma());
maatila.lisaaLehma(new Lehma());

maatila.eleleTunti();
maatila.eleleTunti();

maatila.hoidaLehmat();

System.out.println(maatila);


//Maitosailio sailio = new Maitosailio();
//Maatila tila = new Maatila("pekka", new Navetta( sailio ));
//tila.asennaNavettaanLypsyrobotti( new Lypsyrobotti() );
//tila.lisaaLehma( new Lehma("Lehmä 1") );
//tila.lisaaLehma( new Lehma("Lehmä 2") );
//tila.lisaaLehma( new Lehma("Lehmä 3") );
//tila.lisaaLehma( new Lehma("Lehmä 4") );
//tila.lisaaLehma( new Lehma("Lehmä 5") );
//tila.eleleTunti();
//tila.hoidaLehmat();
//        System.out.println(sailio.getSaldo());
 
    }

}
