/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

/**
 *
 * @author Kari
 */
public class Lypsyrobotti {

    private Maitosailio sailio;

    public Lypsyrobotti() {
        this.sailio = null;
    }

    public Maitosailio getMaitosailio() {
        return this.sailio;
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.sailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        if (this.sailio == null) {
            throw new IllegalStateException("Maitosäiliötä ei ole asennettu");
        }
        this.sailio.lisaaSailioon(lypsava.getMaara());
        lypsava.lypsa();
    }
}
