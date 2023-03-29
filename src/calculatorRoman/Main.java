package calculatorRoman;

import Calc_AR.ConverterCalc;

/*


- Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.

- При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.


Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение


Input:
I - II

Output:
throws Exception //т.к. в римской системе нет отрицательных чисел

Input:
I + 1

Output:
throws Exception //т.к. используются одновременно разные системы счисления

Input:
1

Output:
throws Exception //т.к. строка не является математической операцией

Input:
1 + 2 + 3

Output:
throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)


*/
public class Main {
    public static void main(String[] args) throws RuntimeException {
        // Ввод текста с терминала
        EnterText enterText = new EnterText();
        String str = enterText.inText();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};


//        System.out.println(str.matches("([\\d]{1})[+*/\\-]{1}([\\d]{1})"));
        if (!str.matches("(([123456789]{1})+[+*/\\-]{1}([\\d]{1})+)") && (!str.matches("([IXV]+[+*/\\-]{1}[IXV]+)"))) {
            throw new RuntimeException("строка не является математической операцией");
        }

        System.out.println(str);

        int pos = Console.arithmeticSign(str, actions);
        String action = str.replaceAll("[^(+*/\\-)]", "");

//        System.out.println(action);
        String[] parts = str.split(regexActions[pos]);


        ConverterCalc converter = new ConverterCalc();

        if (converter.isRoman(parts[0]) != converter.isRoman(parts[1])) {
            throw new RuntimeException("Equation parts are not valid");
        }

        boolean isRoman = converter.isRoman(parts[0]);

        int a = isRoman ? converter.romanToInt(parts[0]) : Integer.parseInt(parts[0]);
        int b = isRoman ? converter.romanToInt(parts[1]) : Integer.parseInt(parts[1]);

        int result = switch (action) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> (int) a / b;
            default -> a * b;
        };

        System.out.println(isRoman ? converter.intToRoman(result) : result);
    }
}
