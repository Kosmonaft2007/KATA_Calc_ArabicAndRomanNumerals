package Calc_AR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два арабских числа от 1 до 10 или два римских числа от I до X + Enter ");
        String scn1 = scn.nextLine();
        String userInput = scn1.replaceAll("\\s+", "");
//        System.out.println(calc());

//        ConverterCalc converter = new ConverterCalc();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};

// Проверка на наличе знака в строке
        Calc_A_or_R.arithmeticSign(userInput, actions);

        Calc_A_or_R calc_a_or_r = new Calc_A_or_R();
//        System.out.println(calc_a_or_r.arithmeticSign());
        Calc.calc(userInput, actions, regexActions);


    }
}
