package pro.sky.javacore.oop2;

public interface HasEngine {
    public default void checkEngine (){
        System.out.println("Проверяем двигатель");
    }

}
