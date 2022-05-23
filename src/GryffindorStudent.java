public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int brave;

    public GryffindorStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int nobility, int honor, int brave) {
        super(name, surname, faculty, magicPower, transgretionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    @Override
    public String toString() {
        return super.toString() + " Nobility " + this.nobility + " Honor " + this.honor + " Brave " + this.brave;
    }

    @Override
    public int strongestWizard() {
        return nobility + honor + brave;
    }

    public void compareGryffindor(GryffindorStudent student) {
        int strongestWizard1 = strongestWizard();
        int strongestWizard2 = student.strongestWizard();
        if (strongestWizard1 > strongestWizard2) {
            System.out.println(getName() + " " + getSurname() + " is stronger than " +  student.getName() + " " + student.getSurname() + " on Gryffindor faculty!");
        } else if (strongestWizard2 > strongestWizard1) {
            System.out.println(student.getName() + " " + student.getSurname() + " is stronger than " +  getName() + " " + getSurname() + " on Gryffindor faculty!");
        } else {
            System.out.println("Equals");
        }
    }
}
