package pro.sky.javacore.inheritance;

public class StudentRavenclaw extends StudentHogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public StudentRavenclaw(String name, int powerMagic, int distanceTransgress, int smart, int wise, int witty, int creativity) {
        super(name, powerMagic, distanceTransgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String toString() {
        return  "name='" + super.getName() + '\'' +
                ", faculty='" + "Ravenclaw" + '\'' +
                ", powerMagic=" + super.getPowerMagic() +
                ", distanceTransgress=" + super.getDistanceTransgress() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity
                ;
    }
    public int totalScore () {
        int total = this.witty + this.wise + this.creativity + this.smart;
        return total;
    }
}
