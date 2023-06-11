package lab11;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import javax.swing.*;

public class zad5 extends JFrame implements ActionListener {
    private JTextField dateField;
    private JButton submitButton;
    private JLabel resultLabel;

    public zad5() {
        setTitle("Sprawdź dzień tygodnia");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        dateField = new JTextField(10);
        add(dateField);

        submitButton = new JButton("Sprawdź");
        submitButton.addActionListener(this);
        add(submitButton);

        resultLabel = new JLabel();
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String dateString = dateField.getText();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateString, formatter);

                DayOfWeek dayOfWeek = date.getDayOfWeek();

                resultLabel.setText("Dzień tygodnia: " + dayOfWeek.toString());
            } catch (DateTimeParseException ex) {
                resultLabel.setText("Błędny format daty!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            zad5 gui = new zad5();
            gui.setVisible(true);
        });
    }
}

