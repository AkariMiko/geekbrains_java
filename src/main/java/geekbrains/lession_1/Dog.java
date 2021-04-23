package geekbrains.lession_1;

public class Dog extends Animals{
    public Dog() {
        super(500, 10);
    }
    @Override
    public void to_run(int distance) {
        System.out.printf("Dog run by run %s: %s%n", distance, distance <= getMaxToRunDistance());
    }

    @Override
    public void to_sail(int distance) {
        System.out.printf("Aquaman's dog %s: %s%n", distance, distance <= getMaxToSailDistance());
    }
}


