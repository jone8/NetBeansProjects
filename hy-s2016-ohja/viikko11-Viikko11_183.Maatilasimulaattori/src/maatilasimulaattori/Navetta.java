/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.Collection;

/**
 *
 * @author Kari
 */
public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
        this.lypsyrobotti = null;
    }

    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        lypsyrobotti.setMaitosailio(this.maitosailio);
    }

    public void hoida(Lehma lehma) {
       poikkeusLypsyRobottiaEiAsennettu();

        this.lypsyrobotti.lypsa(lehma);
    }

    public void hoida(Collection<Lehma> lehmat) {
    poikkeusLypsyRobottiaEiAsennettu();

        for (Lehma tama : lehmat) {
            this.lypsyrobotti.lypsa(tama);
        }
    }


    @Override
    public String toString(){
    return this.maitosailio.toString();
    } 

  public void poikkeusLypsyRobottiaEiAsennettu(){
      if (this.lypsyrobotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        }
  }          
            }
