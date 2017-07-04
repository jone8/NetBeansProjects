package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hirsipuu {

    private Sanalista sanalista;
    private List<Character> tehdytArvaukset;
    private int arvauksiaJaljella;
    private String arvattava;

    public Hirsipuu(Sanalista sanalista, int arvauksiaAlussa) {
        this.sanalista = sanalista;
        this.arvauksiaJaljella = arvauksiaAlussa;
        this.tehdytArvaukset = new ArrayList<>();

        Collections.shuffle(this.sanalista.sanat());
        this.arvattava = this.sanalista.sanat().get(0);
    }

    public List<Character> arvaukset() {
        return this.tehdytArvaukset;
    }

    public int arvauksiaJaljella() {
        return this.arvauksiaJaljella;
    }

    public boolean arvaa(Character kirjain) {
        this.tehdytArvaukset.add(kirjain);
        if (this.arvattava.contains(kirjain + "")) {
            return true;
        } else {
            this.arvauksiaJaljella--;
        }
        return false;
    }

    public String sana() {
//        StringBuilder stringBuilder=new StringBuilder();

        int maara = 0;
        String sana = this.arvattava;
        for (int i = 0; i < eiArvatutKirjaimetStringina().length(); i++) {
            sana = sana.replaceAll(
                    eiArvatutKirjaimetStringina().charAt(i) + "", "-");
            maara++;
        }
        return sana;

    }

    public String oikeaSana() {
        return this.arvattava;
    }

    public boolean onLoppu() {
        if (eiArvatutKirjaimetStringina().length() == 0) {
            return true;
        }
        return false;
    }

    public String eiArvatutKirjaimetStringina() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.arvattava.length(); i++) {
            char kirjain = this.arvattava.charAt(i);
            if (!this.tehdytArvaukset.contains(kirjain)) {
                stringBuilder.append(kirjain);
            }
        }
        return stringBuilder + "";
    }

    public String loppuhuijaus(String edellinen) {
     
            System.out.println(sanalista.sanatJoissaMerkit(edellinen).sanat());
            System.out.println(sanalista.sanatJoissaMerkit(edellinen).sanat().get(0));
            System.out.println(sanalista.sanatJoissaMerkit(edellinen).sanat().get(1));
            this.arvattava = sanalista.sanatJoissaMerkit(edellinen).sanat().get(0);
          while(!this.arvattava.equals(this.oikeaSana())){
            int i=0;
              if(this.arvattava.equals(this.oikeaSana())){
                this.arvattava=sanalista.sanatJoissaMerkit(edellinen).sanat().get(i);
            i++;
              }
               
                }
            System.out.println(edellinen);
        System.out.println("loppuh"+ this.arvattava);
        System.out.println("ede" +edellinen);
        return this.arvattava;
    }

}
