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
}
