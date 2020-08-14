package FinalPractice.Question5;

import java.util.Objects;

public class AMRAP extends Workout{
    private int timeCap;
    private int roundsCompleted;

    public AMRAP(String name, int caloriesBurn, int timeCap, int roundsCompleted ) {
        super(name, caloriesBurn);
        this.timeCap = timeCap;
        this.roundsCompleted = roundsCompleted;
    }

    public int getTimeCap() {
        return timeCap;
    }

    public void setTimeCap(int timeCap) {
        this.timeCap = timeCap;
    }

    public int getRoundsCompleted() {
        return roundsCompleted;
    }

    public void setRoundsCompleted(int roundsCompleted) {
        this.roundsCompleted = roundsCompleted;
    }

    @Override
    public String toString() {
         return super.toString() +
                "AMRAP{" +
                "timeCap=" + timeCap +
                ", roundsCompleted=" + roundsCompleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AMRAP amrap = (AMRAP) o;
        return timeCap == amrap.timeCap &&
                roundsCompleted == amrap.roundsCompleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeCap, roundsCompleted);
    }
}
