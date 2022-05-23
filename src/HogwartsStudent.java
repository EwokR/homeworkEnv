public abstract class HogwartsStudent {
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

    public int strongestWizard() {
        return magicPower + transgretionDistance;
    }

    public void compareHogwarts(HogwartsStudent student) {
        int strongestWizard1 = strongestWizard();
        int strongestWizard2 = student.strongestWizard();
        if (strongestWizard1 > strongestWizard2) {
            System.out.println(getName()+ " " + getSurname() + " is stronger than " + student.getName()+" "+student.getSurname()+" in Hogwarts faculty!");
        } else if (strongestWizard2 > strongestWizard1) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + getName()+" "+getSurname()+" in Hogwarts faculty!");
        } else {
            System.out.println("Equals");
        }
    }

}
