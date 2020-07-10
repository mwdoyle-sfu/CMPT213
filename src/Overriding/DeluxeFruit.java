package Overriding;

public class DeluxeFruit extends Fruit {

    // shadow variable, don't do this (see Fruit class)
//    private String type;

    public DeluxeFruit(String type) {
        super(type);
    }

    @Override
    public String getType() {
        return "Deluxe " + super.getType();
    }
}
