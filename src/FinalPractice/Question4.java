package FinalPractice;

public class Question4 {


    /*
    Question 4
    Consider the following 3 class that compile and run correctly. What is the issue with the design of the code?
    Briefly explain what you would do to address the issue and rewrite the 3 classes.
    Assume that the JavaCode and Brush classes are defined and support the operations required by the code.
     */
    abstract public class Student {
        public final int DELAY = 10;

        public void doHomework() {
            // ... work on code.
        }

        public void share(String string) {
            // ... post code on social media.
        }
    }

    public class CSStudent extends Student {

        public void doHomework() {
            for (int hours = 0; hours < DELAY; hours++) {
                share("Procrastinating...");
            }

            share("Gonna work now");
//            JavaCode code = new JavaCode();
//            code.generateHelloWorld();
//            code.output("Helloworld.java");
            share("I'm glad that's over!");
            share("Homework takes " + "way too much time!");
        }
    }

    public class ArtStudent extends Student {

        public void doHomework() {
            for (int hours = 0; hours < DELAY; hours++) {
                share("Procrastinating...");
            }

            share("Gonna work now");
//            Brush brush = new Brush("Thick");
//            brush.setColour("Blue");
//            brush.drawPicture("pic.jpg");
            share("I'm glad that's over!");
            share("Homework takes " + "way too much time!");
        }
    }


}
