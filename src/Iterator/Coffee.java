package Iterator;

// JUnit5
// alt + enter > create test
public class Coffee {
    private String name;
    private int caffeineContent;
    private int calories;

    public Coffee(String name, int caffeineContent, int calories) {
        this.name = name;
        this.caffeineContent = caffeineContent;
        this. calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(int caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
