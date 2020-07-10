package ChainingConstructors;

public class ChainingDerived extends Base {
    private static final double DEFAULT = 42.0;
    private double other;

    public ChainingDerived(int count) {
        // calls the method below
        this(count, DEFAULT);
    }

    public ChainingDerived(int count, double other) {
        super(count);
        this.other = other;
    }

}
