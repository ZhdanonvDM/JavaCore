package pro.sky.javacore.oop2;

public class Car extends Vehicle implements HasEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
