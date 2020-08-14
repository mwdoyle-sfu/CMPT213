package CodeSmells.PullUpMethod;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
// some code
}

// instead of below change it to above

//public class Rectangle {
//    private int x, y;
//    private int width, height;
//    public Rectangle(int x, int y, int width, int height) {
//        this.x = x;
//        this.y = y;
//// some code…
//    }
//// rest of the code…
//}
//
//public class Circle {
//    private int x, y;
//    private int radius;
//
//    public Circle(int x, int y, int radius) {
//        this.x = x;
//        this.y = y;
//// some code…
//    }
//// rest of the code…
//}