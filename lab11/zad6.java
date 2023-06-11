package lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class zad6 extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    private StringBuilder currentNumber;
    private double result;
    private char operator;
    private boolean calculateFlag;

    public zad6() {
        setTitle("Kalkulator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        for (int i = 0; i < 4; i++) {
            operatorButtons[i].addActionListener(this);
            buttonPanel.add(operatorButtons[i]);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        currentNumber = new StringBuilder();
        result = 0;
        operator = ' ';
        calculateFlag = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (isNumeric(actionCommand)) {
            currentNumber.append(actionCommand);
            displayField.setText(currentNumber.toString());
        } else if (isOperator(actionCommand)) {
            if (currentNumber.length() > 0) {
                double number = Double.parseDouble(currentNumber.toString());

                if (operator == ' ') {
                    result = number;
                } else {
                    result = performOperation(result, number, operator);
                }

                operator = actionCommand.charAt(0);
                currentNumber.setLength(0);
                displayField.setText(Double.toString(result));
            }
        } else if (actionCommand.equals("=")) {
            if (currentNumber.length() > 0 && operator != ' ') {
                double number = Double.parseDouble(currentNumber.toString());
                result = performOperation(result, number, operator);
                displayField.setText(Double.toString(result));

                currentNumber.setLength(0);
                operator = ' ';
            }
        } else if (actionCommand.equals("C")) {
            currentNumber.setLength(0);
            result = 0;
            operator = ' ';
            displayField.setText("");
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private double performOperation(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            zad6 calculator = new zad6();
            calculator.setVisible(true);
        });
    }
}
