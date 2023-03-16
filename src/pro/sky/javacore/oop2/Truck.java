package pro.sky.javacore.oop2;

public class Truck extends Vehicle implements HasEngine, HasTrailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
