package FinalPractice.Q4;

public class ArtStudent extends Student {

    // create constructor

    // make Brush a private field

    // create getters

    // create setters

    public void doHomework() {
        for (int hours = 0; hours < DELAY; hours++) {   // call super.getDelay()
            share("Procrastinating...");
        }

        share("Gonna work now");
//            Brush brush = new Brush("Thick");
//            brush.setColour("Blue");
//            brush.drawPicture("pic.jpg");
        share("I'm glad that's over!");
        share("Homework takes " + "way too much time!");
    }

    // @Override toString
    // @Override Equals
    // @Override hashCode


}