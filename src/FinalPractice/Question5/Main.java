package FinalPractice.Question5;

public class Main {

    public static void main(String[] args) {
        OlympicLift oly = new OlympicLift("matt", 30, 3, 100);

//        OlympicLift oly2 = new OlympicLift("suk", 30, 30, 300);
        OlympicLift oly2 = new OlympicLift("suk", 320, 30, 300);

        System.out.println(oly.getCaloriesBurn());
        System.out.println(oly2.getCaloriesBurn());

        if (oly.compareTo(oly2) == 1) System.out.println("calories burned:  same");
        if (oly.compareTo(oly2) == 0) System.out.println("calories burned:  not same");

           AMRAP amrap = new AMRAP("ass", 12, 45, 1 );
           System.out.println(amrap);

        }
}
