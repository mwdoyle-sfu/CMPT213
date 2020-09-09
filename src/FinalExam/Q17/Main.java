package FinalExam.Q17;

interface CoffeeMachine {
    public void showModel();
    public void showGeneralMessage(String msg);
}

class Main {
    public static void main(String[] args) {

        CoffeeMachine highEndMachine = new CoffeeMachine() {
            @Override
            public void showModel() {
                System.out.println("Super123");
            }

            @Override
            public void showGeneralMessage(String msg) {
                System.out.println(msg);
            }
        };
        highEndMachine.showModel();


        CoffeeMachine lowEndMachine = new CoffeeMachine() {
            @Override
            public void showModel() {
                System.out.println("Ok456");
            }

            @Override
            public void showGeneralMessage(String msg) {
                System.out.println(msg);
            }
        };
        lowEndMachine.showModel();

    }
}
