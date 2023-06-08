package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class zad2 extends JFrame {
    private int liczba;
    private int licznikProb;
    private JLabel infoLabel;
    private JTextField propozycjaField;

    public zad2() {
        setTitle("Gra w zgadywanie liczby");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        Random random = new Random();
        liczba = random.nextInt(100) + 1;
        licznikProb = 0;

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        infoLabel = new JLabel("Komputer wylosował liczbę z przedziału 1-100. Spróbuj ją zgadnąć!");
        infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(infoLabel);

        JPanel inputPanel = new JPanel();
        inputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel propozycjaLabel = new JLabel("Twoja propozycja:");
        inputPanel.add(propozycjaLabel);

        propozycjaField = new JTextField(10);
        inputPanel.add(propozycjaField);

        JButton sprawdzButton = new JButton("Sprawdź");
        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sprawdzPropozycje();
            }
        });
        inputPanel.add(sprawdzButton);

        panel.add(inputPanel);

        add(panel);
        pack();
        setVisible(true);
    }

    private void sprawdzPropozycje() {
        try {
            int propozycja = Integer.parseInt(propozycjaField.getText());
            licznikProb++;

            if (propozycja < liczba) {
                infoLabel.setText("Spróbuj wyżej!");
            } else if (propozycja > liczba) {
                infoLabel.setText("Spróbuj niżej!");
            } else {
                infoLabel.setText("Zgadłeś! Gratulacje!\nLiczba prób: " + licznikProb);
                propozycjaField.setEnabled(false);
            }
        }catch(NumberFormatException e){
            infoLabel.setText("Błędne Dane!!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new zad2();
            }
        });
    }
}

