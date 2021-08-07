package Task5;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class CalculatorThree {
    JPanel windowContent = new JPanel(); // создаем панель
    JTextField displayField = new JTextField(20); //создаем и отображаем поле
    // Создаём кнопки, используя конструктор класса JButton, который принимает текст кнопки в качестве параметра
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivision = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDegree = new JButton("степень");

    // В конструкторе создаются все компоненты и добавляются на фрейм с помощью комбинации
// Borderlayout и Gridlayout
    CalculatorThree() {
// Задаём схему для этой панели
        BorderLayout bl = new BorderLayout(); // Установить менеджер расположения для панели
        windowContent.setLayout(bl);
        displayField.setHorizontalAlignment(JTextField.RIGHT); // Выравниваем по правому краю
        windowContent.add("North", displayField);// Добавляем поле его в Северную область окна
// Создаём панель с GridLayout которая содержит 12 кнопок - 10 кнопок с числами и кнопки с точкой и знаком равно
        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);
// Добавляем кнопки на панель p1
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
// Помещаем панель p1 в центральную область окна
        windowContent.add("Center", p1);
// создаем вторую панель с GridLayout
        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(5, 1);
        p2.setLayout(gl2);
// Добавляем кнопки на панель p2
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivision);
        p2.add(buttonMultiply);
        p2.add(buttonDegree);
// Помещаем панель p2 в западную область окна
        windowContent.add("West", p2);
//Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// делаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();
// Наконец, отображаем окно
        frame.setVisible(true);
// Прикрепляем класс CalculatorEngine к кнопкам
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivision.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonDegree.addActionListener(calcEngine);
    }

    public static void main(String[] args) {
        CalculatorThree calc = new CalculatorThree();
    }
}
