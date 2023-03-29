package calculatorRoman;

public class Checking {

    static int a, b;

    public String sp(String exp, int pos, String[] regexActions) {
        String[] datas = exp.split(regexActions[pos]);

        for (int i = 0; i <= datas.length; i++) {
            String one = datas[0];
            String two = datas[1];
        }

//        for (String data : datas) {
//            String one = datas[0];
//            String two = datas[1];
//        }


        return null;
    }
}
