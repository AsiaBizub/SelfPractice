package Practice_Tasks;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo (String name, char gender, LocalDate DOfB, String ID, double gpa){
        // setinfo method to getInfo method to print object of the student
        this.name = name; // instance is variable is the one on the left
        this.gender = gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;

    }

    public String toString() {
        return "Practice_StudentClass{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", DOfB=" + DOfB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }

}
