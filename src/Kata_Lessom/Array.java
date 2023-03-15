package Kata_Lessom;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        String[] arr = new String[10];
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter login: ");
            String login = sc.nextLine();
            boolean dublicat = false; // если логин был уникальным

            for (int i = 0; i < arr.length; i++) {
                // arr[i] != null - проверяем а существует ли строчка
                // по умолчанию массив пустой и == null и что бы не было ошибки -- NullPointerException
                if (arr[i] != null && arr[i].equals(login)) {
                    System.out.println("Такой логин есть ");
                    dublicat = true; // если логин повторяется
                    break;
                }
            }
            // если логин был уникальным
            if (dublicat == false) {
                // arr[index] -- сохраняем логин под номером
                arr[index] = login;
                index++;
            }
        }
    }
}
