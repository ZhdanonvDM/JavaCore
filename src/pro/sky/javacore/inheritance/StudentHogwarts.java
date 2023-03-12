package pro.sky.javacore.inheritance;

public class StudentHogwarts {
    private String name;
    private int powerMagic;
    private int distanceTransgress;

    public StudentHogwarts(String name, int powerMagic, int distanceTransgress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.distanceTransgress = distanceTransgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceTransgress() {
        return distanceTransgress;
    }

    public void setDistanceTransgress(int distanceTransgress) {
        this.distanceTransgress = distanceTransgress;
    }

    public static void studentComparison (StudentHogwarts sh1, StudentHogwarts sh2) {
        if (sh1.getPowerMagic() > sh2.getPowerMagic()) {
            System.out.println(sh1.getName() + " обладает большей мощностью магии, чем " + sh2.getName());
        } else {System.out.println(sh2.getName() + " обладает большей мощностью магии, чем " + sh1.getName());}
        if (sh1.getDistanceTransgress() > sh2.getDistanceTransgress()) {
            System.out.println(sh1.getName() + " может трансгрессировать на большее расстояние, чем " + sh2.getName());
        } else {System.out.println(sh2.getName() + " может трансгрессировать на большее расстояние, чем " + sh1.getName());}
    }
}
