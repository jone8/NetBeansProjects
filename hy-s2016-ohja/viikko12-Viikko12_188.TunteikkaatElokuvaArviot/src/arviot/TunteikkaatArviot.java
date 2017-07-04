package arviot;

import java.util.List;

public class TunteikkaatArviot {

    private List<String> rivit;

    // Huom! Älä muuta konstruktorin parametrien määrää -- konstruktoria
    // saa toki muuten muuttaa
    public TunteikkaatArviot(List<String> rivit) {
        this.rivit = rivit;
    }

    public int sanojenLukumaara(String sana) {
        String merkkijono = "";
        for (String tamaRivi : rivit) {
            merkkijono = merkkijono + tamaRivi + " ";
        }
        String[] palat = merkkijono.split(" ");
        int montako = 0;
        for (String tamaSana : palat) {
            if (tamaSana.equalsIgnoreCase(sana)) {
                montako++;
            }

        }
        return montako;
    }

    public double sananTunne(String sana) {
        double arvosanojenSumma = 0;
        double montako = 0;
//        sana=sana.toLowerCase();
        for (String tamaRivi : rivit) {
            int loytyyko = 0;
            String[] rivinPalat = tamaRivi.split(" ");
//            if (tamaRivi.contains(sana)) {
            for (String eka : rivinPalat) {
                if (eka.equals(sana)) {
                    loytyyko++;
                }
                if (loytyyko > 0) {
//                    String tamanRivinArvio = "" + tamaRivi.charAt(0);

                    String tamanRivinArvio = "" + rivinPalat[0];
                    int tamanRivinArvioInt = Integer.parseInt(tamanRivinArvio);
//                    int tamanRivinarvio = Integer.parseInt(tamanRivinArvio);
                    System.out.println(tamanRivinArvioInt);
                    arvosanojenSumma = arvosanojenSumma + tamanRivinArvioInt;
                    montako++;

//                System.out.println("tamarivicharAt(0): " + tamaRivi.charAt(0));
//                System.out.println("montako: " + montako);
//                System.out.println("arvosanojensumma: " + arvosanojenSumma + "\n");
                }
            }
        }
        if (montako < 1) {
            return 2;
        }

        return arvosanojenSumma / montako;
    }

    public String sananTunneMerkkijonona(String sana) {
        return "";
    }

    public double lauseenTunne(String lause) {
        return 0.0;
    }

    public String lauseenTunneMerkkijonona(String lause) {
        return "";
    }

}
