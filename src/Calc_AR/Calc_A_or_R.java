/*
package Calc_AR;

import java.util.Scanner;

class Calc_A_or_R {
    static int a, b;

    public String[] sp(String exp, int pos, String[] regexActions) {
        String[] datas = exp.split(regexActions[pos]);
        return datas;
//        for (String data : datas) {
////            return data;
//        }
//        return null; // 2 + 3 -> 2 и 3
    }


    public int A_or_R(String[] actions, String[] data, int pos) {
//        Calc_A_or_R.arithmeticSign();
        ConverterCalc converter = new ConverterCalc();
//        "2-4".split("-")-> {"2", "4"}
        // Метод split принимает регулярные выражения поэтому создали массив String[] regexActions = {"\\+", "-", "/", "\\*"};
//        String[] data = exp.split(regexActions[actionIndex]);
//        String[] data = exp.split(regexActions[Calc_A_or_R.arithmeticSign(exp,actions)]);

        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)
        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
//            if (isRos(data[0]) == isRos(data[1])) {


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
            switch (actions[pos]) {
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
            return result;
        } else {
            System.out.println("Числа должны быть в одном формате");

        }

    }
}*/
