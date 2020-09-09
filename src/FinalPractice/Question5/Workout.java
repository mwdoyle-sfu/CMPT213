package FinalPractice.Question5;

import java.util.Objects;

public class Workout implements Comparable{
    private String name;
    private int caloriesBurn;

    public Workout(String name, int caloriesBurn) {
        this.name = name;
        this.caloriesBurn = caloriesBurn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesBurn() {
        return caloriesBurn;
    }

    public void setCaloriesBurn(int caloriesBurn) {
        this.caloriesBurn = caloriesBurn;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", caloriesBurn=" + caloriesBurn +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
//        //self check
//        if(this == obj) return 1;
//        //null check
//        if(obj == null) return 0;
//        //type check...
//        if(getClass() != obj.getClass()) return 0;
//        //...and cast
//        Workout objWorkout = (Workout) obj;
//        //fields comparison (your own definition of "equal")
//        if (this.caloriesBurn == objWorkout.caloriesBurn) {
//            return 1;
//        } else {
//            return 0;
//        }
        Workout objWorkout = (Workout) obj;
        return this.getCaloriesBurn() - objWorkout.getCaloriesBurn();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return caloriesBurn == workout.caloriesBurn &&
                Objects.equals(name, workout.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, caloriesBurn);
    }
}
