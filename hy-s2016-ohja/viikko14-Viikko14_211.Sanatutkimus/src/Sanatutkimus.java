
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
import java.util.*;

public class Sanatutkimus {

    private String tiedosto;
    private List<String> rivit;

    public Sanatutkimus(String tiedosto) {

        this.tiedosto = tiedosto;
        this.rivit = new ArrayList<>();

        Scanner lukija = null;
        try {
            lukija = new Scanner(new File(tiedosto), "UTF-8");
        } catch (Exception e) {
            System.out.println("Tiedoston lukemisessa tapahtui virhe" + e.getMessage());
            return;
        }
        while (lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }

        lukija.close();
    }

    public int sanojenMaara() {
        int maara = 0;
        for (String rivi : rivit) {
            maara++;
        }
        return maara;
    }

    public ArrayList<String> haePalindromit() {
        ArrayList<String> palindromiLista = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.equals(kaanna(rivi))) {
                palindromiLista.add(rivi);
            }
        }
        return palindromiLista;
    }

    public static String kaanna(String merkkijono) {
        int apu = merkkijono.length() - 1;
        String jono = "";
        char merkki = ' ';
        while (apu > -1) {
            merkki = merkkijono.charAt(apu);
            jono = jono + merkki;
            apu--;
        }
        return jono;
    }

    public void tulostaRivit() {

        for (String rivi : rivit) {

            {
                System.out.println(rivi);
            }
        }
    }

    public boolean onkoSanaa(String sana) {
        for (String rivi : rivit) {
            if (rivi.contains(sana)) {
                return true;
            }
        }
        return false;
    }

    public int laskeSanat(int pituus) {
        int maara = 0;
        for (String rivi : rivit) {
            if (rivi.length() == pituus) {
                maara++;
            }
        }
        return maara;
    }

    public void pituustilasto() {
        HashMap<Integer, Integer> pituudet = new HashMap<>();
        int pituus = 0;
        int maara = 0;
        for (String rivi : rivit) {
            pituus = rivi.length();

            if (!pituudet.containsKey(pituus)) {
                pituudet.put(pituus, 1);
            } else {
                maara = pituudet.get(pituus);
                pituudet.put(pituus, maara + 1);
            }
        }
        for (int luku : pituudet.keySet()) {
            System.out.println(luku + " " + pituudet.get(luku));
        }

    }

    public int laskeKirjaimet(char kirjain) {
        int maara = 0;
        for (String rivi : rivit) {
            for (int i = rivi.length() - 1; i > -1; i--) {
                if (rivi.charAt(i) == kirjain) {
                    maara++;
                }
            }
        }
        return maara;
    }

    public void kirjaintilasto() {
        HashMap<Character, Integer> kirjaimet = new HashMap<>();
        Character kirjain = 'a';

        char[] alphabet = "abcdefghijklmnopqrstuvwxyzåäö".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            kirjaimet.put(alphabet[i], 0);

        }

        for (String rivi : rivit) {
            for (int i = 0; i < rivi.length(); i++) {

                kirjain = rivi.charAt(i);
                int maara = kirjaimet.get(kirjain);
                kirjaimet.put(kirjain, kirjaimet.get(kirjain) + 1);

            }

        }

        for (Character tamaKirjain : kirjaimet.keySet()) {
            System.out.println(tamaKirjain + " " + kirjaimet.get(tamaKirjain));
        }
    }

    public ArrayList<String> haePituudella(int pituus) {
        ArrayList<String> sanat = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.length() == pituus) {
                sanat.add(rivi);
            }
        }
        return sanat;
    }

    public ArrayList<String> haeOsalla(String osa) {
        ArrayList<String> sanat = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.contains(osa)) {
                sanat.add(rivi);
            }
        }
        return sanat;
    }

    public ArrayList<String> haeRistikkoon(String pohja) {
        ArrayList<String> uusiSanalista = new ArrayList<>();

        for (String rivi : rivit) {
            int lisataanko = 0;
            for (int i = 0; i < pohja.length(); i++) {

                if (pohja.length() != rivi.length()) {
                    lisataanko--;
                    continue;
                }
                if (!(pohja.charAt(i) == (rivi.charAt(i))
                        || pohja.charAt(i) == ('?'))) {

                    lisataanko--;
                }
            }
            if (lisataanko == 0) {
                uusiSanalista.add(rivi);

            }
        }
        return uusiSanalista;
    }
}
