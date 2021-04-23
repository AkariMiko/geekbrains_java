package geekbrains.lession_1;

public class Kitty {
    private boolean isFed;
    public void eat(Bowl bowl) {
        isFed = bowl.decrease(6);
    }

    @Override
    public String toString() {
        return "Cat:" + "isFed=" + isFed;
    }
}
