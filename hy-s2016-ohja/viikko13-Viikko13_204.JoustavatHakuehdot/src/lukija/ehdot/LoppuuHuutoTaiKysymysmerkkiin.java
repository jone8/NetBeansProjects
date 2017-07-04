/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lukija.ehdot;

/**
 *
 * @author Kari
 */
public class LoppuuHuutoTaiKysymysmerkkiin implements Ehto {

    @Override
    public boolean toteutuu(String rivi) {
        if (rivi.isEmpty()) {
            return false;
        }
        if (rivi.charAt(rivi.length() - 1) == '!' || rivi.charAt(rivi.length() - 1) == '?') {
            return true;
        }

        return false;
    }

}
