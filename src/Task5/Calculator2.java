package Task5;

import javax.swing.*;
import java.awt.*;

public class Calculator2 {
    public static void main(String[] args) {
// Создаём панель
        JPanel windowContent = new JPanel();
// Задаём менеджер отображения для этой панели
        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);
// Создаём компоненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
// Добавляем компоненты на панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
// Создаём фрейм и задаём для него панель
        JFrame frame = new JFrame("Мой калькулятор");
        frame.setContentPane(windowContent);
// задаём и размер и делаем фрейм видимым
        frame.setSize(400,500);
        frame.setVisible(true);
    }
}
