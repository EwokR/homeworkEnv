public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int brave;

    public GryffindorStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int nobility, int honor, int brave) {
        super(name, surname, faculty,magicPower, transgretionDistance);
        this.nobility=nobility;
        this.honor=honor;
        this.brave=brave;
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
    public static void findStrongestWizardOnFacultyGryffindor(GryffindorStudent student, GryffindorStudent student3) {
        int sum1 =0;
        int sum2 =0;
        sum1 = student.getNobility() + student.getHonor() +student.getBrave();
        sum2 = student3.getNobility() + student3.getHonor() + student3.getBrave();
        if (sum1 > sum2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student3.getName()+" "+student3.getSurname()+" on Gryffindor faculty!");
        } else if (sum1<sum2) {
            System.out.println(student3.getName()+" "+student3.getSurname()+" is stronger than "+student.getName()+ " " + student.getSurname()+" on Gryffindor faculty!");
        }
    }
}
