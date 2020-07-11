package InnerClasses;

public class OuterClass {

    int myValue = 1;
    public void printContent() { System.out.println("Outer class: " + "myValue = " + myValue);}

    public class InnerClass {
        int myInnerValue = 2;
        public void printContent() {
            OuterClass.this.printContent();
            System.out.println("Inner class: " + "myInner Value = " + myInnerValue);
        }
    }
}
