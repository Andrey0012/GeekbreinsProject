package Task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void Calc(Container container){
        String[] array = new String[3];
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagConstraints constraintsForText = new GridBagConstraints();               //пришлось создать отдельную
        //строку, если использовать одну
        constraints.fill = GridBagConstraints.HORIZONTAL;                               //то при попытке занять несколько
        constraints.weightx = 0.5;                                                      //ячеек текстовым полем, удаляются
        constraints.gridy = 0;                                                          //ячейки второго ряда

        JTextField field = new JTextField();

        JButton buttonReset = new JButton("сброс");
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");

            }
        });
        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0] = field.getText();
                array[2] = "+";
            }
        });
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0] = field.getText();
                array[2] = "-";
            }
        });
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0] = field.getText();
                array[2] = "*";
            }
        });
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0] = field.getText();
                array[2] = "/";
            }
        });
        JButton buttonSquare = new JButton("степень");
        buttonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0] = field.getText();
                array[2] = "^";
            }
        });
        JButton buttonEquals = new JButton("=");
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[1] = field.getText();
                if(array[2] == "+"){
                    double a = Double.parseDouble(array[0]) + Double.parseDouble(array[1]);
                    field.setText(Double.toString(a));
                }
                else if(array[2] == "-"){
                    double a = Double.parseDouble(array[0]) - Double.parseDouble(array[1]);
                    field.setText(Double.toString(a));
                }
                else if(array[2] == "*"){
                    double a = Double.parseDouble(array[0]) * Double.parseDouble(array[1]);
                    field.setText(Double.toString(a));
                }
                else if(array[2] == "/"){
                    double a = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
                    field.setText(Double.toString(a));
                }
                else if(array[2] == "^"){
                    double a = Math.pow(Double.parseDouble(array[0]), Double.parseDouble(array[1]));
                    field.setText(Double.toString(a));
                }
            }
        });

        constraintsForText.fill = GridBagConstraints.HORIZONTAL;
        constraintsForText.gridx = 0;
        constraintsForText.ipady = 8;
        constraintsForText.gridwidth = 5;
        container.add(field, constraintsForText);

        constraintsForText.fill = GridBagConstraints.HORIZONTAL;
        constraintsForText.gridx = 5;
        constraintsForText.gridy = 0;
        container.add(buttonReset, constraintsForText);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 0;
        container.add(buttonPlus, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 1;
        container.add(buttonMinus, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 2;
        container.add(buttonMultiply, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 3;
        container.add(buttonDivide, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 4;
        container.add(buttonSquare, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 5;
        container.add(buttonEquals, constraints);
    }
    public static void main(String[] args){
        new Calculator();
        JFrame frame = new JFrame("калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calc(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
}
