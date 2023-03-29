import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        nextLine
//        double a = 125.4f;
//        double r = a/Math.PI;
//        System.out.printf("R = %.3f \n", a/Math.PI);
        String str = "10 20 13 14";

        Scanner sc = new Scanner(str);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}