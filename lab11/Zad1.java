package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad1 extends JFrame {
    private JTextField celsiusTextField;
    private JLabel fahrenheitLabel;

    public Zad1() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Celsius to Fahrenheit Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel celsiusLabel = new JLabel("Celsius: ");
        celsiusTextField = new JTextField(10);

        JButton convertButton = new JButton("Convert");

        fahrenheitLabel = new JLabel("Fahrenheit: ");

        add(celsiusLabel);
        add(celsiusTextField);
        add(convertButton);
        add(fahrenheitLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String celsiusText = celsiusTextField.getText();
                try {
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    fahrenheitLabel.setText(String.valueOf(fahrenheit));
                } catch (NumberFormatException ex) {
                    fahrenheitLabel.setText("Invalid input");
                }
            }
        });

        pack();
        setLocationRelativeTo(null);  // Center the JFrame on the screen
        setVisible(true); // Set the JFrame visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Zad1();
            }
        });
    }
}



