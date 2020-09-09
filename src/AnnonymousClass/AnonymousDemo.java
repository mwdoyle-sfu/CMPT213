package AnnonymousClass;

interface Age {
    int x = 21;
    void getAge();
}

class AnonymousDemo {
    public static void main(String[] args) {

//        // Without anonymous class
//        // Myclass is implementation class of Age interface
//        MyClass obj=new MyClass();
//        // calling getage() method implemented at Myclass
//        obj.getAge();

        // with anonymous class
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it is created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                // printing  age
                System.out.print("Age is "+x);
            }
        };

        oj1.getAge();
    }
}

// Without anonymous class
// Inner class: Myclass implement the methods of Age Interface
//class MyClass implements Age {
//    @Override
//    public void getAge() {
//        // printing the age
//        System.out.print("Age is "+x);
//    }
//}