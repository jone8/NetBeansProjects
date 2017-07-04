/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Sanatulostin {

    private String sana;

    public Sanatulostin(String sanaAlussa) {
        this.sana = sanaAlussa;
    }

    public void sanaporras(int luku) {
        int vikarivi = 1;
        int kirjain = 0;
        while (vikarivi <= luku) {
            int rivi = 0;

            while (rivi < vikarivi) {
                System.out.print(this.sana.charAt(kirjain));
                kirjain++;
                rivi++;
                if (kirjain == this.sana.length()) {
                    kirjain = 0;
                }
            }
            System.out.println("");
            vikarivi++;
        }
    }

    public void laskevaSanaporras(int luku) {
        int kirjain = 0;
        int rivi=0;
        int vikarivi=luku;
        int apu=0;
        while (rivi < luku) {
       vikarivi=luku;
            
            while (vikarivi > apu) {
                System.out.print(this.sana.charAt(kirjain));
                kirjain++;
                
                if (kirjain == this.sana.length()) {
                    kirjain = 0;
                }
                
               vikarivi--;
            }
            
            System.out.println("");
            rivi++;
        apu++;
        }
        

    }

}

//        int luku = 1;
//        int porras = 1;
//        while (porras <= porrastenLukumaara) {
//            for (int i = 0; i < porras; i++) {
//                System.out.print(luku + " ");
//                luku++;
//            }
// 
//            porras++;
//            System.out.println("");
//        }
