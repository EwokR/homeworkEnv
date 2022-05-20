public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambitious;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int cunning, int determination, int ambitious, int resourcefulness, int lustForPower) {
        super(name, surname, faculty,magicPower, transgretionDistance);
        this.cunning = cunning;
        this.determination =determination;
        this.ambitious =ambitious;
        this.resourcefulness =resourcefulness;
        this.lustForPower =lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }@Override
    public String toString() {
        return super.toString() + " Cunning = " +this.cunning+" Determination = "+this.determination+" Resourcefulness = "+this.resourcefulness+ " Ambitious = "+this.ambitious+" Lust for power = "+this.lustForPower;
    }
}
