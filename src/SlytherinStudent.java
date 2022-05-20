public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambitious;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, String surname, String faculty, int magicPower, int transgretionDistance, int cunning, int determination, int ambitious, int resourcefulness, int lustForPower) {
        super(name, surname, faculty,magicPower, transgretionDistance);
        this.cunning = cunning;
        this.determination =determination;
        this.ambitious =ambitious;
        this.resourcefulness =resourcefulness;
        this.lustForPower =lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }@Override
    public String toString() {
        return super.toString() + " Cunning = " +this.cunning+" Determination = "+this.determination+" Resourcefulness = "+this.resourcefulness+ " Ambitious = "+this.ambitious+" Lust for power = "+this.lustForPower;
    }
    public static void findStrongestWizardOnFacultySlytherin(SlytherinStudent student, SlytherinStudent student12) {
        int sum1 =0;
        int sum2 =0;
        sum1=student.getCunning()+ student.getDetermination()+student.getAmbitious()+student.getResourcefulness()+student.getLustForPower();
        sum2=student12.getCunning()+ student12.getDetermination()+student12.getAmbitious()+student12.getResourcefulness()+student12.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(student.getName()+ " " + student.getSurname() + " is stronger than " + student12.getName()+" "+student12.getSurname()+" on Slytherin faculty!");
        } else if (sum1<sum2) {
            System.out.println(student12.getName()+" "+student12.getSurname()+" is stronger than "+student.getName()+ " " + student.getSurname()+" on Slytherin faculty!");
        }
    }
}
