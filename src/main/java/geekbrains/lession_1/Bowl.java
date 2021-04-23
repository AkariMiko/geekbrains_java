package geekbrains.lession_1;

public class Bowl {
    private final int capacity = 15;
    private int size = capacity;
    public boolean decrease(int request) {
        if (request <= size) {
            size -= request;
            return true;
        }
        return false;
    }

    public void add() {
        size = capacity;
    }

    public void add(int income) {
        int tempSize = income + size;
        size = Math.min(tempSize, capacity);
    }

    @Override
    public String toString() {
        return "Bowl:" + "capacity=" + capacity + ", size=" + size;
    }
}
