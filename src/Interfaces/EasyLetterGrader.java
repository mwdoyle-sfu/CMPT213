package Interfaces;

public class EasyLetterGrader implements LetterGrader {

    private static final double BREAK_POINT = 70;

    @Override
    public String getGrade(double percent) {
        if (percent >= BREAK_POINT) {
            return "A+";
        } else {
            return "B";
        }
        // Code seems incomplete :)
    }

    @Override
    public double getMinPercentForGrade(String grade) {
        if (grade.compareToIgnoreCase("A+") == 0) {
            return BREAK_POINT;
        } else {
            return 0;
        }
    }
}
