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
    public static int findStrongestWizardOnFacultyGryffindor2 (GryffindorStudent student) {
        int sum =0;
        sum = student.getNobility() + student.getHonor() +student.getBrave();
        return sum;
    }
}
