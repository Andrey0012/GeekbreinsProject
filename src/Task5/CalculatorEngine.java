package Task5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    CalculatorThree parent; // ссылка на CalculatorThree
    // создаем переменные для сохранея данных о нажатии кнопок
    char selectedAction = ' '; // +, -, /, *, степень
    double currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора в переменной класса “parent”
    CalculatorEngine(CalculatorThree parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
// Получаем источник события то есть говрим JVM какая кнопка нажата пользователем
        JButton clickedButton = (JButton) e.getSource();
// Получить текущий текст из поля вывода (“дисплея”) калькулятора
        String dispFieldText = parent.displayField.getText();
        double displayValue = 0;
// Получить число из дисплея калькулятора, если он не пустой
        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();
// Для каждой кнопки арифметического действия запомнить его: +, -, /, или *, степень, сохранить текущее число
// в переменной currentResult, и очистить дисплей для ввода нового числа
        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDivision) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDegree) {
            selectedAction = '^';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {
// Совершить арифметическое действие, в зависимости от selectedAction, обновить переменную currentResult
// и показать результат на дисплее
            if (selectedAction == '+') {
                currentResult += displayValue;
// Сконвертировать результат в строку, добавляя его к пустой строке и показать его
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '^') {
                currentResult = Math.pow(currentResult, displayValue);
                parent.displayField.setText("" + currentResult);
            }
        } else {
// Для всех цифровых кнопок присоединить надпись на кнопке к надписи в дисплее
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(dispFieldText +
                    clickedButtonLabel);
        }
    }
}
