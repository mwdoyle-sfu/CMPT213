package Inheritance;

public class Dictionary extends Book {

    private int definitions;

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    public double computeRatio() {
        return definitions / super.getPages();
    }

}
