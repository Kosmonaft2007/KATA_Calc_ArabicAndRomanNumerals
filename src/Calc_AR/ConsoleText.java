package Calc_AR;

import java.util.Scanner;

 class ConsoleText {

    public String Text(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два арабских числа от 1 до 10 или два римских числа от I до X + Enter ");
        String scn1 = scn.nextLine();
        String userInput = scn1.replaceAll("\\s+", "");
        return userInput;
    }
}
