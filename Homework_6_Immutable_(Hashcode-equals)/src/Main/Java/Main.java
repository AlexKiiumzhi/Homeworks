package Main.Java;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine(1499.99);
        engine.setCC(1599.99);
	    ImmutableCar immutableCar = new ImmutableCar(engine, "Blue");
        System.out.printf(immutableCar.toString());
        engine.setCC(1899);
        System.out.printf(immutableCar.toString());

    }
}
