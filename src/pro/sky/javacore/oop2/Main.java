package pro.sky.javacore.oop2;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2 );
        Car car = new Car("car1",4 );
        Car car2 = new Car("car2",4 );
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        ServiceStation.check(bicycle);
        ServiceStation.check(bicycle2);
        ServiceStation.check(car);
        ServiceStation.check(car2);
        ServiceStation.check(truck);
        ServiceStation.check(truck2);
    }
}
