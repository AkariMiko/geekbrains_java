package geekbrains.lession_1;

public class lesson_7 {
    public static void main(String[] args) {
        Kitty[] cats = {
                new Kitty(), new Kitty(), new Kitty()
        };
        Bowl bowl = new Bowl();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
            System.out.println(cats[i]);
            System.out.println(bowl);
        }
    }
}
