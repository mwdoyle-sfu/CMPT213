package Serialization;

import java.io.Serializable;

public class SerializableSBCoffee implements Serializable {
    private String name;
    private int caffeineContent;
    private int calories;

    public SerializableSBCoffee(String name, int caffineContent, int calories) {
        this.name = name;
        this.caffeineContent = caffineContent;
        this.calories = calories;
    }
// some other code

}
