package Kata_Lessom;

import java.util.Scanner;

    /*
    делит строку по флагу  split -> "\\+", "-", "/", "\\*"

    определяет что за знак  contains  "+", "-", "/", "*"

    заменяет знак либо символ  replace

    */
public class TEST {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "1 + 2";
        str = str.replace("\\s+", " ");
        String[] arr = null;
        String action = null;

//        for (String as: arr) {
//            System.out.println(as);
//        }
        if (str.contains("+")) {
            arr = str.split("\\+ ");
            action = "+";
        } else if (str.contains("-")) {
            arr = str.split("-");
            action = "-";
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        if (action.equals("+")) {
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        } else if (action.equals("-")) {
            System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
        }

    }
}
