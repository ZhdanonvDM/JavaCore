package pro.sky.javacore.inheritance;

public class StudentSlytherin extends StudentHogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;

    public StudentSlytherin(String name, int powerMagic, int distanceTransgress, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(name, powerMagic, distanceTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }
    public String studentDescription() {
        return "name='" + super.getName() + '\'' +
                ", faculty='" + "Slytherin" + '\'' +
                ", powerMagic=" + super.getPowerMagic() +
                ", distanceTransgress=" + super.getDistanceTransgress() +
                ", cunning=" + cunning +
                ", determination" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower;
    }

    public static int totalScore (StudentSlytherin sr) {
        int total = sr.ambition + sr.lustPower + sr.resourcefulness + sr.cunning + sr.determination;
        return total;
    }

    public static void studentComparison (StudentSlytherin sr1, StudentSlytherin sr2) {
        if (totalScore(sr1) > totalScore(sr2)) {
            System.out.println(sr1.getName() + " лучший Слизеринец, чем " + sr2.getName());
        } else {System.out.println(sr2.getName() + " лучший Слизеринец, чем " + sr1.getName());}
    }
}
