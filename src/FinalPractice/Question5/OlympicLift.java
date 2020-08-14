package FinalPractice.Question5;

import java.util.Objects;

public class OlympicLift extends Workout {
    private int repitions;
    private int maxWeight;

    public OlympicLift(String name, int caloriesBurn, int repitions, int maxWeight) {
        super(name, caloriesBurn);
        this.repitions = repitions;
        this.maxWeight = maxWeight;
    }


    public int getRepitions() {
        return repitions;
    }

    public void setRepitions(int repitions) {
        this.repitions = repitions;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "OlympicLift{" +
                "repitions=" + repitions +
                ", maxWeight=" + maxWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OlympicLift that = (OlympicLift) o;
        return repitions == that.repitions &&
                maxWeight == that.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), repitions, maxWeight);
    }
}
