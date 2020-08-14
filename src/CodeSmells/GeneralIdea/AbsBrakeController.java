package CodeSmells.GeneralIdea;

// how can we improve this code?
// what could go wrong

// DRY - don't repeat yourself

public class AbsBrakeController {

    private static final double EXTRA_BRAKING = 20;
    private double brakePercentage; // what if we changed this to an int
    // all functions using it would have to be changed

    public AbsBrakeController(double brakePercentage) {
        if (brakePercentage < 0 || brakePercentage > 100) { // duplicate value 100 should be extracted
            throw new IllegalArgumentException();
        }
        this.brakePercentage = brakePercentage;
    }

    public void brakeHarder() {
        if (brakePercentage < 0 || brakePercentage > 100) { // this check is a duplicate of above, extract it
            throw new IllegalStateException();
        }
        brakePercentage += EXTRA_BRAKING;
        if (brakePercentage > 100) {
            brakePercentage = 100;
        }
    }
}