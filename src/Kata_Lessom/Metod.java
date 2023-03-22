package Kata_Lessom;

public class Metod {
    public static void main(String[] args) {
       Persen persen1 = new Persen();
       persen1.name = "Vasya";
       persen1.age = 20;
       System.out.println(" "+persen1.name + " " + persen1.age);

       Persen persen2 = new Persen();
        persen2.name = "Vadic";
        persen2.age = 38;
        persen2.speak();

    }
}
class Persen {
    String name;
    int age;


    public  void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println(" "+ name + " " + age);
        }


    }

}