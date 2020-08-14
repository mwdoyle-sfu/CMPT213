package Reflection;

import Objects.Rectangle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        // The Class object gives access to a number of information about the class
        Class rectangleClass = Rectangle.class;
        Package rectanglePackage = rectangleClass.getPackage();
        Field[] rectanlgeFields = rectangleClass.getDeclaredFields();
        System.out.println(rectangleClass.getName());
        System.out.println(rectangleClass.getSuperclass().getName());
        System.out.println(rectanglePackage.getName());
        for(Field field : rectanlgeFields) {
            if (Modifier.isPrivate(field.getModifiers())) {//look for private fields
                System.out.println("Private field " + field.getName());
            }
        }

        // Use getMethod/getDeclaredMethod to get the Method object, then call its invoke method
        // usually used in testing code. Create an array of methods
        // can even get private methods! look it up
        // can use getMethods() as well
        Rectangle rectangle = new Rectangle(1, 1, 20, 10);
        System.out.println("Height was: " + rectangle.getHeight());
        try {
            Method m = Rectangle.class.getDeclaredMethod("setHeight", int.class);
            m.invoke(rectangle, 100);
        } catch (NoSuchMethodException nsme) {
            nsme.printStackTrace();
        } catch (ReflectiveOperationException roe) {
            roe.printStackTrace();
        }
        System.out.println("Height is: " + rectangle.getHeight());



    }
}
