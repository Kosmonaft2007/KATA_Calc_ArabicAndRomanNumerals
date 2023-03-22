package Calc_AR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два арабских числа от 0 до 10: [2+2] или два римских числа от I до X:[V+V] + Enter ");
        String scn1 = scn.nextLine();
//        System.out.println(calc());
        Calc_A_or_R.calc(scn1);
    }
}
