package calculatorRoman;

public class Console {
    public static int arithmeticSign(String exp, String[] actions) {

        //Определяем арифметическое действие:
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        //(Проверка) Если ввели не корректный символ: % № ; тогда заканчиваем return
        if (actionIndex == -1) {
//            System.out.println("Некорректное выражение");
//            return;
            throw new RuntimeException("Некорректное выражение");
        }
        return actionIndex;
    }
}
