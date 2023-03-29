package Calc_AR;

import java.io.Console;

public class PofiC {
    public static void main(String[] args) throws RuntimeException {
        ConsoleText consoleText = new ConsoleText();
        String str = consoleText.Text();

        if (!str.matches("^/d+\\+\\*/-IVXMCL/$")) {
            throw new RuntimeException("Invalid string");
        }

        String action = str.replaceAll("^[+*-/]", "");
        if (action.length() != 1) {
            throw new RuntimeException("Invalid math action");
        }

        String[] parts = str.split("\\+-\\*/");

        ConverterCalc converter = new ConverterCalc();


        //OR
        // 1 1 0 0
        // 1 0 1 0
        // 1 1 1 0

        //XOR исключающий ИЛИ
        // 1 1 0 0
        // 1 0 1 0
        // 0 1 1 0

        // 1 XOR 0 = 1
        // 0 XOR 1 = 1
        // 0 XOR 0 = 0
        // 1 XOR 1 = 0


        if (converter.isRoman(parts[0]) ^ converter.isRoman(parts[1])) {
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

        System.out.println(isRoman ? converter.intToRoman(result) : result);
    }
}
