
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraafinenLaskin implements Runnable {

    private JFrame frame;
    private Laskin la;
    private JTextField tulosKentta;
    private JTextField syoteKentta;

    public GraafinenLaskin(Laskin la) {
        this.la = la;
    }

    @Override
    public void run() {
        frame = new JFrame("Laskin");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame);

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout gridLayout = new GridLayout(3, 1);
        container.setLayout(gridLayout);

        tulosKentta = new JTextField("0");
        tulosKentta.setEnabled(false);
        syoteKentta = new JTextField();

        container.add(tulosKentta);
        container.add(syoteKentta);
        container.add(luoValikko());

    }

    public JFrame getFrame() {
        return frame;
    }

    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        panel.add(plus);
        JButton miinus = new JButton("-");
        panel.add(miinus);
        JButton zeta = new JButton("Z");
        panel.add(zeta);

        LaskinToimintojenKuuntelija laskinKuuntelija = new LaskinToimintojenKuuntelija(la,
                tulosKentta, syoteKentta, plus, miinus, zeta);

        plus.addActionListener(laskinKuuntelija);
        miinus.addActionListener(laskinKuuntelija);
        zeta.addActionListener(laskinKuuntelija);

        return panel;
    }

}
