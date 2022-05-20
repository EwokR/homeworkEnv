public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public RavenclawStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int smart, int wise, int witty, int creative) {
        super(name, surname, faculty,magicPower, transgretionDistance);
        this.smart=smart;
        this.wise=wise;
        this.witty=witty;
        this.creative=creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }
    @Override
    public String toString() {
        return super.toString() + " Smart = " + this.smart + " Wise = " + this.wise + " Witty = " + this.witty + " Creative = " + this.creative;
    }
    public static void findStrongestWizardOnFacultyRavenclaw(RavenclawStudent student, RavenclawStudent student9) {
        int sum1 =0;
        int sum2 =0;
        sum1=student.getSmart()+student.getWise()+student.getWitty()+student.getCreative();
        sum2=student9.getSmart()+student9.getWise()+student9.getWitty()+student9.getCreative();
        if (sum1 > sum2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student9.getName()+" "+student9.getSurname()+" on Ravenclaw faculty!");
        } else if (sum1<sum2) {
            System.out.println(student9.getName()+" "+student9.getSurname()+" is stronger than "+student.getName()+ " " + student.getSurname()+" on Ravenclaw faculty!");
        }
    }
}
