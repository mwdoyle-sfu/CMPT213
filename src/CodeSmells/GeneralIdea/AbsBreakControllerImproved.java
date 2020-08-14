package CodeSmells.GeneralIdea;

public class AbsBreakControllerImproved {

    private static final double EXTRA_BRAKING = 20;
    private static final double MAX = 100;  // extracted values
    private static final double MIN = 0;    // extracted values
    private double brakePercentage;

    public AbsBreakControllerImproved(double brakePercentage) {
        if (isBreakPercentageOk(brakePercentage)) { // extracted method
            throw new IllegalArgumentException();
        }
        this.brakePercentage = brakePercentage;
    }

    public void brakeHarder() {
        if (isBreakPercentageOk(brakePercentage)) {
            throw new IllegalStateException();
        }
        brakePercentage += EXTRA_BRAKING;
        if (brakePercentage > MAX) {
            brakePercentage = MAX;
        }
    }

    private boolean isBreakPercentageOk(double brakePercentage) {
        return brakePercentage < MIN || brakePercentage > MAX;
    }
}
