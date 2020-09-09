package Lambda;

import Iterator.Coffee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda {


    public static void main(String args[]) {

        // Create an ArrayList of some SBCoffee content
        ArrayList<Iterator.Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Iterator.Coffee("Brewed Coffee - Dark Roast - Tall", 193, 4));
        coffeeList.add(new Iterator.Coffee("Iced Coffee - Tall", 120, 60));
        coffeeList.add(new Coffee("Coffee Frap - Tall", 70, 160));

        // Sort the list by caffeine content using a lambda expression
        Collections.sort(coffeeList, (o1, o2) -> o1.getCaffeineContent() - o2.getCaffeineContent());

        // much less code than the original code below
        Collections.sort(coffeeList, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o1.getCaffeineContent() - o2.getCaffeineContent();
            }
        });

        // Print the sorted list
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee.getCaffeineContent());
        }



    }


}
