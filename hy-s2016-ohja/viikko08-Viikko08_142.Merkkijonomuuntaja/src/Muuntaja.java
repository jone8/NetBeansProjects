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
public class Muuntaja {
private ArrayList<Muunnos> muunnokset;
  
public Muuntaja() {
this.muunnokset=new ArrayList<>();
    }

    public void lisaaMuunnos(Muunnos muunnos) {
     muunnokset.add(muunnos);
    }
public String muunna(String merkkijono){
    String palautus="";
    for(Muunnos eka: muunnokset){
      muunnos.muunna(eka);
        palautus=palautus+" "+ eka  +" ";
    }
return palautus;
}
}
