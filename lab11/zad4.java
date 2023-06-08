package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zad4 extends JFrame {
    private static final String[] FLAGS = {
            "C:\\Users\\makse\\lab_java\\src\\lab11\\flags\\flaga1.png",
            "C:\\Users\\makse\\lab_java\\src\\lab11\\flags\\flaga2.png",
            "C:\\Users\\makse\\lab_java\\src\\lab11\\flags\\flaga3.png",
            "C:\\Users\\makse\\lab_java\\src\\lab11\\flags\\flaga4.png",
            "C:\\Users\\makse\\lab_java\\src\\lab11\\flags\\flaga5.png"
    };

    private List<Integer> selectedFlags;
    private FlagLabel[] flagLabels;

    public zad4() {
        setTitle("Wyświetlacz flag");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        flagLabels = new FlagLabel[3];
        JPanel flagsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        for (int i = 0; i < 3; i++) {
            flagLabels[i] = new FlagLabel();
            flagsPanel.add(flagLabels[i]);
        }
        add(flagsPanel, BorderLayout.CENTER);

        JButton displayButton = new JButton("Wyświetl flagi");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayRandomFlags();
            }
        });
        add(displayButton, BorderLayout.SOUTH);

        selectedFlags = new ArrayList<>();

        setVisible(true);
    }

    private void displayRandomFlags() {
        Random random = new Random();
        selectedFlags.clear();

        for (int i = 0; i < 3; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(FLAGS.length);
            } while (selectedFlags.contains(randomIndex));
            selectedFlags.add(randomIndex);

            flagLabels[i].setImage(FLAGS[randomIndex]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                zad4 program = new zad4();
                program.setVisible(true);
            }
        });
    }

    private static class FlagLabel extends JLabel {
        private Image image;

        public void setImage(String imagePath) {
            ImageIcon flagIcon = new ImageIcon(imagePath);
            Image scaledImage = flagIcon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
            image = scaledImage;
            setIcon(new ImageIcon(scaledImage));
        }
    }
}

