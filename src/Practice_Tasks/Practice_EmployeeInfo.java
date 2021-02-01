package Practice_Tasks;

public class Practice_EmployeeInfo {
public static void main(String[] args) {


                String firstName = "Asia";
                String lastName = "Bizub";
                String fullName = firstName +' '+lastName;
                char gender = 'F';
                int age = 36;
                String companyName = "FiveFieldAvenue";
                String jobTitle = "Owner";
                boolean isFullTime = true;
                boolean isMarried = false;
                double salary = 90000;


                System.out.println("Employee's Full Name is: "+fullName);
                System.out.println(fullName+"'s gender is: "+gender);
                System.out.println(fullName+"'s age is: "+age);
                System.out.println(fullName+"'s works at: "+companyName);
                System.out.println(fullName+"'s job title is: "+jobTitle);
                System.out.println(fullName+"'s salary is: $"+salary);
                System.out.println(fullName+"'s is full time employee: "+isFullTime);
                System.out.println(fullName+"'s is married: "+isMarried);

}
}
