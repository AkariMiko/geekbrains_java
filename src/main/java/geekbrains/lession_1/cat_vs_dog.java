package geekbrains.lession_1;

public class cat_vs_dog {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat(),
                new Dog(),

        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].to_run(150);
            animals[i].to_sail(20);
        }
    }
}
