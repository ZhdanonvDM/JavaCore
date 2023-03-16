package pro.sky.javacore.oop2;

public interface HasTrailer {
    public default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
