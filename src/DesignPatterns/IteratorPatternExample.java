package DesignPatterns;


import Iterator.Coffee;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPatternExample {

    public static void main(String args[]) {
        // Create an ArrayList of some SBCoffee content
        ArrayList<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Brewed Coffee - Dark Roast - Tall", 193, 4));
        coffeeList.add(new Coffee("Iced Coffee - Tall", 120, 60));
        coffeeList.add(new Coffee("Coffee Frap - Tall", 70, 160));

        // Iterator design Pattern
        int duplicateCount = 0;
        Iterator<Coffee> coffeeItr1 = coffeeList.iterator();
        while (coffeeItr1.hasNext()) {
            Coffee sbCoffee1 = coffeeItr1.next();
            Iterator<Coffee> coffeeItr2 = coffeeList.iterator();
            while(coffeeItr2.hasNext()) {
                Coffee sbCoffee2 = coffeeItr2.next();
                if (sbCoffee1.getName().equals(sbCoffee2.getName())) {
                    duplicateCount++;
                }
            }
        }

        duplicateCount = (duplicateCount - coffeeList.size()) / 2;

    }



}
