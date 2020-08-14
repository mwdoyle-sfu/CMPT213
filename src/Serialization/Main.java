package Serialization;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        // serialize
        SerializableSBCoffee[] ssbcArray = new SerializableSBCoffee[2];
        ssbcArray[0] = new SerializableSBCoffee("Brewed Coffee - Dark Roast - Tall", 193, 4);
        ssbcArray[1] = new SerializableSBCoffee("Iced Coffee - Tall", 120, 60);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SBCoffee.ser"))) { // use .ser by convention
            out.writeObject(ssbcArray);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // de-serialize
        SerializableSBCoffee[] ssbcArray_file = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("SBCoffee.ser"))) {
            ssbcArray_file = (SerializableSBCoffee[]) in.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }

    }

}
