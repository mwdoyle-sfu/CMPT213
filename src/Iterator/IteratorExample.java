package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class IteratorExample {


    public static void main(String args[]) {
        ComparableInterface();
//        IteratorInterface();



        







    }

    private static void IteratorInterface() {

//        interface Iterator<E> {
//            boolean hasNext();
//            E next();
//            void remove();
//            //some other stuff
//        }

        ArrayList<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Brewed Coffee - Dark Roast - Tall", 193, 4));
        coffeeList.add(new Coffee("Iced Coffee - Tall", 120, 60));
        coffeeList.add(new Coffee("Coffee Frap - Tall", 70, 160));
        // add iterator
        Iterator<Coffee> coffeeItr = coffeeList.iterator();
        while (coffeeItr.hasNext()) {
            System.out.println(coffeeItr.next().getCaffeineContent());
        }
    }

    private static void ComparableInterface() {
        // Create an ArrayList of some SBCoffee content
        ArrayList<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Brewed Coffee - Dark Roast - Tall", 193, 4));
        coffeeList.add(new Coffee("Iced Coffee - Tall", 120, 60));
        coffeeList.add(new Coffee("Coffee Frap - Tall", 70, 160));

        // Sort the list by caffeine content
        Collections.sort(coffeeList, new Comparator<Coffee>() {
            // returns a -ve number if o1<o2, a +ve numbe if o1>o2, 0 if equal
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o1.getCaffeineContent() - o2.getCaffeineContent();
            }
        });

        // Print the sor ted list
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee.getCaffeineContent());
        }
    }
}
