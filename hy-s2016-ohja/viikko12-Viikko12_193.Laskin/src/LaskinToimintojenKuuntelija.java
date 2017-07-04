
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class LaskinToimintojenKuuntelija implements ActionListener {
    
    Laskin laskin;
    private JTextField tulos;
    private JTextField syote;
    private JButton plussa;
    private JButton miinus;
    private JButton zet;
    
    public LaskinToimintojenKuuntelija(Laskin laskin, JTextField tulos,
            JTextField syote, JButton plussa, JButton miinus, JButton zet) {
        this.laskin = laskin;
        this.tulos = new JTextField();
        this.syote = new JTextField();
        this.plussa = new JButton();
        this.miinus = new JButton();
        this.zet = new JButton();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plussa) {
            
            this.tulos.setText(this.syote.getText());

// käsittele plus-painike
        } else if (e.getSource() == miinus) {
            int uusiArvo = 0;
            uusiArvo = laskin.getArvo() + laskin.miinusta(10);
            this.tulos.setText(uusiArvo + "");

// käsittele miinus-painike
        } else {
            this.tulos.setText(this.laskin.getArvo() + "");
        }
        
    }
    
}
