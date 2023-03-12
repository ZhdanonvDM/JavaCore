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
    public String studentDescription() {
        return  "name='" + super.getName() + '\'' +
                ", faculty='" + "Hufflepuff" + '\'' +
                ", powerMagic=" + super.getPowerMagic() +
                ", distanceTransgress=" + super.getDistanceTransgress() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }
    public static int totalScore (StudentGryffindor sg) {
        int total = sg.getNobility() + sg.getHonor() + sg.getCourage();
        return total;
    }

    public static void studentComparison (StudentGryffindor sg1, StudentGryffindor sg2) {
        if (totalScore(sg1) > totalScore(sg2)) {
            System.out.println(sg1.getName() + " лучший Гриффиндорец, чем " + sg2.getName());
        } else {System.out.println(sg2.getName() + " лучший Гриффиндорец, чем " + sg1.getName());}
    }
}
