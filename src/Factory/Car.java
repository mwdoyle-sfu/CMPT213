package Factory;

public abstract class Car {

    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    private void arrangeParts(){
        // Do one time processing here
    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
