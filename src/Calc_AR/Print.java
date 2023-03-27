package Calc_AR;

public class Print {
    public void Print(int result, boolean isRoman) {

        ConverterCalc converter = new ConverterCalc();

        //15->XV
        if (isRoman) {
            //если числа были римские, возвращаем результат в римском числе
            System.out.println("---Результат для римских цифр----");
            System.out.println(converter.intToRoman(result));

        } else {
            //если числа были арабские, возвращаем результат в арабском числе
            System.out.println("--Результат для арабских цифр----");
            System.out.println(result);
//        } else {
//            System.out.println("Числа должны быть в одном формате");
        }
    }
}
