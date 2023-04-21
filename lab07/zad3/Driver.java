package zad3;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) {
        String numberString = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String dividerString = JOptionPane.showInputDialog(null, "Podaj dzielnik");

        try {
            int number = convertToInteger(numberString);
            int divider = convertToInteger(dividerString);
            if (divider == 0) {
                JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
            } else {
                int result = number / divider;
                JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd, wprowadzono nie-liczbę");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
        }
    }

    private static int convertToInteger(String number) {
        return Integer.parseInt(number);
    }
}
