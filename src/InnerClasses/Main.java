package InnerClasses;

public class Main {


    public static void main(String args[]) {
    OuterClass oc = new OuterClass();
    oc.printContent();
    OuterClass.InnerClass ic = oc.new InnerClass();
    ic.printContent();
    }
}
