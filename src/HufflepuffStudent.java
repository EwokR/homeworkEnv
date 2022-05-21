public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, faculty, magicPower, transgretionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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

    @Override
    public int strongestWizard() {
        return hardworking + honest + loyal;
    }
    public void compareHufflepuff(HufflepuffStudent student) {
        int strongestWizard1 = strongestWizard();
        int strongestWizard2 = student.strongestWizard();
        if (strongestWizard1 > strongestWizard2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student.getName()+" "+student.getSurname()+" on Hufflepuff faculty!");
        } else if (strongestWizard2 > strongestWizard1) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student.getName()+" "+student.getSurname()+" on Hufflepuff faculty!");
        } else {
            System.out.println("Equals");
        }
    }
}
