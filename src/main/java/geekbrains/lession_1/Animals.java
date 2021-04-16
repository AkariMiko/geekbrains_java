package geekbrains.lession_1;

public abstract class Animals {
    private final int maxToRunDistance;
    private final int maxToSailDistance;

    public Animals(int maxToRunDistance, int maxToSailDistance) {
        this.maxToRunDistance = maxToRunDistance;
        this.maxToSailDistance = maxToSailDistance;
    }

    public int getMaxToRunDistance() {
        return maxToRunDistance;
    }

    public int getMaxToSailDistance() {
        return maxToSailDistance;
    }

    public abstract void to_run(int distance);
    public abstract void to_sail(int distance);

}
