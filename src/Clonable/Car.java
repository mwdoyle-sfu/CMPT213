package Clonable;

import java.sql.Date;

public class Car implements Cloneable {
    private String make;
    private Date year;
    private double weight;

    // defining a "sufficient" deep copy
    @Override
    public Car clone() {
        try {
            // for shallow copy
            Car cloned = (Car) super.clone();
            // for deep copy
            cloned.year = (Date) year.clone();
            return cloned;
        } catch (CloneNotSupportedException e){
            // Impossible: we support cloneable!
            e.printStackTrace();
            return null;
        }
    }
}

