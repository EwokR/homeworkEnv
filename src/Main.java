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
        System.out.println(student3);
        GryffindorStudent.findStrongestWizardOnFacultyGryffindor(student1,student3);
        HufflepuffStudent.findStrongestWizardOnFacultyHufflepuff(student4,student6);
        RavenclawStudent.findStrongestWizardOnFacultyRavenclaw(student7,student9);
        SlytherinStudent.findStrongestWizardOnFacultySlytherin(student10,student12);
        HogwartsStudent.findStrongestWizardInHogwarts(student5,student2);
    }
}