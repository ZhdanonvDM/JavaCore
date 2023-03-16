package pro.sky.javacore.inheritance;

public class StudentHufflepuff extends StudentHogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public StudentHufflepuff(String name, int powerMagic, int distanceTransgress, int hardworking, int loyal, int honest) {
        super(name, powerMagic, distanceTransgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        return  "name='" + super.getName() + '\'' +
                ", faculty='" + "Hufflepuff" + '\'' +
                ", powerMagic=" + super.getPowerMagic() +
                ", distanceTransgress=" + super.getDistanceTransgress() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }
    public int totalScore () {
        int total = this.hardworking + this.honest + this.loyal;
        return total;
    }
    public static void studentComparison (StudentHufflepuff sh1, StudentHufflepuff sh2) {
        if (sh1.totalScore() > sh2.totalScore()) {
            System.out.println(sh1.getName() + " лучший Пуффендуец, чем " + sh2.getName());
        } else {System.out.println(sh2.getName() + " лучший Пуффендуец, чем " + sh1.getName());}
    }
}
