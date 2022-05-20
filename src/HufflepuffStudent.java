public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, faculty,magicPower, transgretionDistance);
        this.hardworking=hardworking;
        this.loyal=loyal;
        this.honest=honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    @Override
    public String toString() {
        return super.toString() + " Hardworking = " + this.hardworking + " Loyal = " + this.loyal + " Honest = " + this.honest;
    }
    public static void findStrongestWizardOnFacultyHufflepuff(HufflepuffStudent student, HufflepuffStudent student6) {
        int sum1 =0;
        int sum2 =0;
        sum1 = student.getHardworking() + student.getLoyal() +student.getHonest();
        sum2=student6.getHardworking()+student.getHonest()+student.getHonest();
        if (sum1 > sum2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student6.getName()+" "+student6.getSurname()+" on Hufflepuff faculty!");
        } else if (sum1<sum2) {
            System.out.println(student6.getName()+" "+student6.getSurname()+" is stronger than "+student.getName()+ " " + student.getSurname()+" on Hufflepuff faculty!");
        }
    }
}
