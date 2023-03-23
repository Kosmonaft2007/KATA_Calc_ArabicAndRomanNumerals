package Kata_Lessom.CalcMag;

public class C_001 {
    public static void main(String[] args) {

    }
}

abstract class Product {
    protected int energy; // колорийность
    protected String name;

    public Product(int energy, String name) {
        this.energy = energy;
        this.name = name;
    }

    public abstract void eat();


    public String kcalOfEnergy() {
        return "Энергитическая ценность "
                + this.name
                + "состовляет "
                + this.energy + "ккал";
    }
}

class Milk extends Product {
    public Milk() {
        super(321, "milk");
    }

    public void eat() {
        System.out.println("Milk Вкусное");
    }
}

class Coffe extends Product {
    public Coffe() {
        super(321, "кофе");
    }

    public void eat() {
        System.out.println("Milk горячий Вкусное");
    }
}

class Cake extends Product {
    public Cake() {
        super(321, "Cake пироженое ");
    }

    public void eat() {
        System.out.println("прироженое сильно коллорийно ");
    }

}

final class ListProduct { // final - запрещаем наследоваться от этого класса
    public static String[] products;

    static { //статический массив
        products = new String[]{
                "Наименование товара ",
                "Наименование товара ",
                "Наименование товара ",
                "Наименование товара ",
                "Наименование товара ",
                "Наименование товара ",

        };
    }
}

class Shop {
    public static Product getProductOf(String name){
        switch (name.toLowerCase()){
            case " молоко":
            case "сливки ":
                return new Milk();

            case " кофе":
            case " лотте":
                return new Coffe();

            case "мультефей  ":
            case " печенье":
                return new Cake();
            default:
                return null;
        }
    }
}