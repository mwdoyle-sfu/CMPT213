package ChainingConstructors;

public class Base {
    int count = 0;

    public Base() {
        this(5);
    }

    public Base(int count) {
        this.count = count;
    }
}
