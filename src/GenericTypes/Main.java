package GenericTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // generic class
        Box<Integer> integerBox = new Box<>();
        integerBox.set(Integer.valueOf(42));
        System.out.println(integerBox.getClass().getName() + " " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("CMPT 213");
        System.out.println(stringBox.getClass().getName() + " " + stringBox.get());
    }

    // generic method
    public static <E> void fill(ArrayList<E> a, E value, int count) {
        for (int i = 0; i < count; i++)
            a.add(value);
    }


}
