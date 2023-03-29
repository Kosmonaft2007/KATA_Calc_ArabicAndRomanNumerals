package calculatorRoman;

import Calc_AR.ConverterCalc;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        // Ввод текста с терминала
        EnterText enterText = new EnterText();
        String str = enterText.inText();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};



        int pos = Console.arithmeticSign(str, actions);
        String action = str.replaceAll("[^(+*/\\-)]", "");
        String[] parts = str.split(regexActions[pos]);

        for (int i = 0; i < parts.length; i++) {
            if (i>1) {
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }

//        System.out.println(str.matches("([\\d]{1})[+*/\\-]{1}([\\d]{1})"));
        if (!str.matches("(([123456789]{1})+[+*/\\-]{1}([\\d]{1})+)") && (!str.matches("([IXV]+[+*/\\-]{1}[IXV]+)"))) {
            throw new RuntimeException("строка не является математической операцией");
        }


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

//        if (isRoman)
//        {
//            converter.intToRoman(result) <= 0;
//            throw new RuntimeException("в римской системе нет отрицательных чисел");
//        }


        System.out.println(isRoman ? converter.intToRoman(result) : result);
    }
}
