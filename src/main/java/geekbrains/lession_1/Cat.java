package geekbrains.lession_1;

public class Cat extends Animals {
    public Cat() {
        super(200, -1);
    }

    @Override
    public void to_run(int distance) {
        System.out.printf("Cat run by run %s: %s%n", distance, distance <= getMaxToRunDistance());
    }

    @Override
    public void to_sail(int distance) {
        System.out.println("Cat lost power of aquaman");
    }
}
