package ilmoitin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class Ilmoitin implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentit(Container container) {
        GridLayout gridLayout = new GridLayout(3, 1);
        container.setLayout(gridLayout);

        JTextField tekstia = new JTextField();
        JButton paivita = new JButton("Päivitä");
        JLabel toinenTeksti = new JLabel();

        paivita.addActionListener(new TapahtumanKuuntelija(tekstia, toinenTeksti));

        container.add(tekstia);
        container.add(paivita);
        container.add(toinenTeksti);
    }
}
