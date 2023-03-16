package pro.sky.javacore.inheritance;

public class StudentGryffindor extends StudentHogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public StudentGryffindor(String name, int powerMagic, int distanceTransgress, int nobility, int honor, int courage) {
        super(name, powerMagic, distanceTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public String toString() {
        return  "name='" + super.getName() + '\'' +
                ", faculty='" + "Hufflepuff" + '\'' +
                ", powerMagic=" + super.getPowerMagic() +
                ", distanceTransgress=" + super.getDistanceTransgress() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }
    public int totalScore () {
        int total = this.getNobility() + this.getHonor() + this.getCourage();
        return total;
    }
}
