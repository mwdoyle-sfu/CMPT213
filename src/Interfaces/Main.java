package Interfaces;

public class Main {

    public static void main(String args[]) {
        LetterGrader lg = new EasyLetterGrader();
        System.out.println(lg.getGrade(90));
    }
}
