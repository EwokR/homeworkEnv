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
    public static void findStrongestWizardInHogwarts(HogwartsStudent student, HogwartsStudent student2) {
        int sum1 =0;
        int sum2 =0;
        sum1=student.getMagicPower()+student.getTransgretionDistance();
        sum2=student2.getMagicPower()+student2.getTransgretionDistance();
        if (sum1 > sum2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student2.getName()+" "+student2.getSurname()+" in Hogwarts walls!");
        } else if (sum1<sum2) {
            System.out.println(student2.getName()+" "+student2.getSurname()+" is stronger than "+student.getName()+ " " + student.getSurname()+" in Hogwarts walls!");
        }
    }
}
