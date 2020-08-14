package Objects;


public class Main {

    public static void main(String[] args) {
//        Shape shape = new Shape(0, 0);
//        // override to string
//        System.out.println(shape);
//        // override hash code
//        System.out.println(shape.hashCode()); //0
//        // override equals
//
//        Rectangle rectangle = new Rectangle(1, 1, 20, 10);
//        System.out.println(rectangle);
//        System.out.println(rectangle.hashCode()); // 16 + 16 = 32


        // both are the same bc we only compare if they are the same or recipricals
        // we do not compare their x y locations
        Rectangle rectangleL = new Rectangle(0, 0, 30, 20);
        Rectangle rectangleR = new Rectangle(10, 10, 20, 30);
        if (rectangleL.equals(rectangleR)) {
            System.out.println("both rectangles are equal.");
        } else {
            System.out.println("the rectangles are not equal.");
        }



    }

}
