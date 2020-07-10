package Polymorphism;

class MarkingSystem {
    double[ ] marks = {74, 85, 25, 55, 93, 1};
    void printLetterGrades() {
        // can use exact same code if we change EasyLetterGrader
        // int HardLetterGrader
        LetterGrader grader = new EasyLetterGrader();
        String[] grades = gradeEachStudent(grader);
        for (String grade : grades) {
            System.out.println("Grade: " + grade);
        }
    }
    String[ ] gradeEachStudent(LetterGrader grader) {       // doesnt care what type of letter grader is passed
        String[ ] letterGrades = new String[marks.length];  // as long as it implents the interface
        for (int i = 0; i < marks.length; i++) {
            letterGrades[i] = grader.getGrade(marks[i]);    // determines which to call at runtime
        }
        return letterGrades;
    }
}