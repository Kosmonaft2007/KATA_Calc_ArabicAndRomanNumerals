package calculatorRoman;

public class Main {
    public static void main(String[] args) {
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};


        // Ввод текста с терминала
        EnterText enterText= new EnterText();
        String userInput = enterText.inText();
// Проверка вводимых параметров
        Checking checking =new Checking();









        //  Вывод результата калькулятора
        PrintText printText=new PrintText();
    }
}
