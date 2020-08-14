package GenericTypes;

import java.util.ArrayList;

public class Box<T> {
    // T stands for "Type
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    // limited bc it can only append objects of the same type
    public static <E> void append(ArrayList<E> a, ArrayList<E> b, int count) {
        for (int i = 0; i < count && i < b.size(); i++)
            a.add(b.get(i));
    }

    // allows appending objects of subtype
    public static <E> void appendSubType(ArrayList<E> a,ArrayList<? extends E> b, int count) {
        for (int i = 0; i < count && i < b.size(); i++)
            a.add(b.get(i));
    }


}
