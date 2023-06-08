package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class zad3 extends JFrame {
    private int liczba;

    private JLabel infoLabel;
    private JTextField propozycjaField;

    public zad3() {
        setTitle("tskeT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);



        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        infoLabel = new JLabel("Podaj tekst który komputer ma wypisać od tyłu: ");
        infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(infoLabel);

        JPanel inputPanel = new JPanel();
        inputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        propozycjaField = new JTextField(10);
        inputPanel.add(propozycjaField);

        JButton generujButton = new JButton("Generuj");
        generujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String propozycja = propozycjaField.getText();
                    char ch;
                    String nstr ="";
                    for (int i=0; i<propozycja.length(); i++)
                    {
                        ch= propozycja.charAt(i);
                        nstr= ch+nstr;
                    }
                    infoLabel.setText(nstr);
                }catch(IllegalArgumentException e2){
                    infoLabel.setText("Błędne Dane!!");
                }
            }
        });
        inputPanel.add(generujButton);

        panel.add(inputPanel);

        add(panel);
        pack();
        setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new zad3();
            }
        });
    }
}
