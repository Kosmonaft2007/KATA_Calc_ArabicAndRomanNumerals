package Calc_AR;

import java.util.Scanner;

class Calc_A_or_R {
    public static int arithmeticSign(String exp, String[] actions) {
        //2+3
        //V-VII
//        ConverterCalc converter = new ConverterCalc();
//        String[] actions = {"+", "-", "/", "*"};
//        String[] regexActions = {"\\+", "-", "/", "\\*"};

        //Определяем арифметическое действие:
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        //(Проверка) Если ввели не корректный символ: % № ; тогда заканчиваем return
        if (actionIndex == -1) {
//            System.out.println("Некорректное выражение");
//            return;
            throw new RuntimeException("Некорректное выражение");
        }
        return actionIndex;
    }
}

class Calc {
    public static void calc(String exp, String[] actions, String[] regexActions) {

//        Calc_A_or_R.arithmeticSign();
        ConverterCalc converter = new ConverterCalc();
        //"2-4".split("-")-> {"2", "4"}
        // Метод split принимает регулярные выражения поэтому создали массив String[] regexActions = {"\\+", "-", "/", "\\*"};
//        String[] data = exp.split(regexActions[actionIndex]);
        String[] data = exp.split(regexActions[Calc_A_or_R.arithmeticSign(actionIndex)]);
        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)
        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a, b;

            boolean isRoman = converter.isRoman(data[0]);
            if (isRoman) {
                //если римские, то конвертируем их в арабские
                //X+V
                //x-10
                //v - 5
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);

            } else {
                //если арабские, конвертируем их из строки в число
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
            }

            //выполняем с числами арифметическое действие
            int result;
            switch (actions[actionIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                default:
                    result = a / b;
                    // ----------добавить что на 0 делить нельзя ретерн
                    break;
            }
            //15->XV
            if (isRoman) {
                //если числа были римские, возвращаем результат в римском числе
                System.out.println("---Результат для римских цифр----");
                System.out.println(converter.intToRoman(result));

            } else {
                //если числа были арабские, возвращаем результат в арабском числе
                System.out.println("--Результат для арабских цифр----");
                System.out.println(result);
            }
        } else {
            System.out.println("Числа должны быть в одном формате");
        }

    }
}

