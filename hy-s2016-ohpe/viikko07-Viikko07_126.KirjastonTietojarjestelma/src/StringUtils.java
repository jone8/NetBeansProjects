
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class StringUtils {

    public static boolean sisaltaa(String sana, String haettava) {
        String uusiSana = (sana.toUpperCase()).trim();
        String uusiHaettava = (haettava.toUpperCase()).trim();
        if (uusiSana.contains(uusiHaettava)) {
            return true;
        }

        return false;
    }

}
