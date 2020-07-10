package Overriding;

public class Main {
    public static void main(String args[]) {
        Fruit apple = new Fruit("Apple");
        System.out.println(apple.getType());

        Fruit deluxe = new DeluxeFruit("Apple");
        System.out.println(deluxe.getType());
    }
}
