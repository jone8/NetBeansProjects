/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Kurssisuoritus {
 private String nimi;
 private int arvosana;
 private int opintopistemaara;
 public Kurssisuoritus(String nimi, int arvosana, int opintopistemaara){
     this.nimi=nimi;
     this.arvosana=arvosana;
     this.opintopistemaara=opintopistemaara;
 }
 
public String toString(){
    return this.nimi+", arvosana: "+ this.arvosana;
} 
public String getKurssi(){
    return this.nimi;
}
public int getOpintopisteet(){
    return this.opintopistemaara;
}
public int getArvosana(){
    return this.arvosana;
}
public void setArvosana(int arvosana){
    this.arvosana=arvosana;
}
}
