package kysely;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Kysely");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

// Luo sovelluksesi tänne
    }

    public void luoKomponentit(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JLabel oletko = new JLabel("Oletko?");
        container.add(oletko);

        JCheckBox kylla = new JCheckBox("Kyllä");
        JCheckBox en = new JCheckBox("En");
        container.add(kylla);
        container.add(en);

        JLabel miksi = new JLabel("Miksi?");
        container.add(miksi);

        JRadioButton siksi = new JRadioButton("Siksi.");
        JRadioButton kivaa = new JRadioButton("Koska se on kivaa!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(siksi);
        buttonGroup.add(kivaa);

        container.add(siksi);
        container.add(kivaa);

        JButton valmis = new JButton("Valmis");
        container.add(valmis);
    }

    public JFrame getFrame() {
        return frame;
    }
}
