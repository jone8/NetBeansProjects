/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastot;

/**
 *
 * @author Kari
 */
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria historia;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus,
            double alkuSaldo) {
        super(tuotenimi, tilavuus);
        lisaaVarastoon(alkuSaldo);
        this.historia = new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
    }

    public String historia() {
        return this.historia + "";
    }

    @Override
    public void lisaaVarastoon(double maara) {

        super.lisaaVarastoon(maara);

//      this.historia.lisaa(this.getSaldo()+maara);
    }

    @Override
    public double otaVarastosta(double maara) {
        super.otaVarastosta(maara);
        this.historia.lisaa(this.getSaldo() - maara);
        return maara;
    }

    public void tulostaAnalyysi() {
        System.out.println(super.toString() + "\nHistoria:" + historia() + "\n");
    }

}
