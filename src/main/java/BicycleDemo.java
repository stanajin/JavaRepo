public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(20);
        bike1.changegear(10);
        bike1.printStates();

        bike2.changeCadence(5);
        bike2.speedUp(200);
        bike2.changegear(16);
        bike2.printStates();
    }
}
