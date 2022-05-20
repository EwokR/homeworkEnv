public class HogwartsStudent {
    private String name;
    private String surname;
    private String faculty;
    private int magicPower;
    private int transgretionDistance;

    public HogwartsStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgretionDistance = transgretionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgretionDistance() {
        return transgretionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgretionDistance(int transgretionDistance) {
        this.transgretionDistance = transgretionDistance;
    }

    @Override
    public String toString() {
        return "Name " + getName() + " Surname " + getSurname() + " Faculty " + getFaculty() + " Magic Power = " + getMagicPower() + " Trangretion Distance = " + getTransgretionDistance();
    }
}
