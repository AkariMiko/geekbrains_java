package geekbrains.lession_1;
public class HomeWork_1 {
    public static void main(String[] args) { // переименовал работы, чтобы ьупо не повторять discription
        HomeWork_2();
        HomeWork_3();
        HomeWork_4();
        HomeWork_5();
    }

    public static void HomeWork_2() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void HomeWork_3(){
        int a, b, d;
        a = 1;
        b = 3;
        d = a + b;
        if (d >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void HomeWork_4() {
        int value;
        value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
    }

    public static void HomeWork_5(){
        int a, b;
        a = 4;
        b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}


