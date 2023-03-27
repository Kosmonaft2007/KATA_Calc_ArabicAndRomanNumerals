package Calc_AR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConsoleText consoleText = new ConsoleText();
        String userInput = consoleText.Text();

        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};

        // Проверка на наличе знака в строке
        int pos = Console.arithmeticSign(userInput, actions);


//        Calc_A_or_R calc_a_or_r = new Calc_A_or_R();
//        System.out.println(calc_a_or_r.arithmeticSign());
//        Calc_A_or_R.A_or_R(userInput, pos, regexActions, actions);


        Calc_A_or_R calc_a_or_r = new Calc_A_or_R();
        String sp = calc_a_or_r.sp(userInput, pos, regexActions);

        ConverterCalc converterCalc = new ConverterCalc();
        boolean isRos = converterCalc.isRoman(sp);

        int res = calc_a_or_r.A_or_R(sp, actions, pos, isRos);


//        Print print = new Print(res, isRos);




        /*
        1) Класс + метод КОНСОЛЬ - ввод с терминала ++
        2) переименовать класс А_ор_Р ++
        3) сделать класс + метод вывнести определение арабские или римские
        4) вычесление
        5) вывод результата
        * */

    }
}
