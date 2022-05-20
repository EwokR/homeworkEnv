import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent student1 = new GryffindorStudent("Harry", "Potter","Gryffindor",30,27,21,22,34);
        GryffindorStudent student2 = new GryffindorStudent("Hermione", "Granger", "Gryffindor",44,40,18,25,27);
        GryffindorStudent student3 = new GryffindorStudent("Ron", "Weasley","Gryffindor",21,15,42,38,36);
        HufflepuffStudent student4 = new HufflepuffStudent(" Zacharias","Smith","Hufflepuff",34,17,21,29,37);
        HufflepuffStudent student5 = new HufflepuffStudent("Cedric","Diggory","Hufflepuff",36,15,44,38,70);
        HufflepuffStudent student6 =new HufflepuffStudent("Justin", "Finch-Fletchley","Hufflepuff", 47,23,33,41,28);
        RavenclawStudent student7=new RavenclawStudent("Cho", "Chang","Ravenclaw",60,30,64,65,68,48);
        RavenclawStudent student8=new RavenclawStudent("Padma","Patil","Ravenclaw",51,25,12,29,30,54);
        RavenclawStudent student9=new RavenclawStudent("Marcus","Belby","Ravenclaw",8,4,2,1,3,6);
        SlytherinStudent student10=new SlytherinStudent("Draco","Malfoy","Slytherin",29,26,21,22,33,18,35);
        SlytherinStudent student11=new SlytherinStudent("Graham","Montague","Slytherin",17,12,40,12,8,10,39);
        SlytherinStudent student12=new SlytherinStudent("Gregory","Goyle","Slytherin",25,25,25,25,25,25,25);
        System.out.println(Arrays.toString(student8));
        findStrongestWizardOnFacultyGryffindor(student1,student3);
        findStrongestWizardOnFacultyHufflepuff(student4,student6);
        findStrongestWizardOnFacultyRavenclaw(student7,student9);
        findStrongestWizardOnFacultySlytherin(student10,student12);
        findStrongestWizardInHogwarts(student5,student2);
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