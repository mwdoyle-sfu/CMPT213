package FinalPractice.Question5;

import java.util.Objects;

public class EMOM extends Workout{
    private int minutesCompleted;

    public EMOM(String name, int caloriesBurn, int minutesCompleted) {
        super(name, caloriesBurn);
        this.minutesCompleted = minutesCompleted;
    }

    public int getMinutesCompleted() {
        return minutesCompleted;
    }

    public void setMinutesCompleted(int minutesCompleted) {
        this.minutesCompleted = minutesCompleted;
    }

    @Override
    public String toString() {
         return super.toString() +
                "EMOM{" +
                "minutesCompleted=" + minutesCompleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EMOM emom = (EMOM) o;
        return minutesCompleted == emom.minutesCompleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minutesCompleted);
    }
}
