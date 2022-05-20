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
}
