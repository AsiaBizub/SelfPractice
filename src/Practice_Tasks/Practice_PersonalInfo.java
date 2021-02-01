package Practice_Tasks;

public class Practice_PersonalInfo {
    public static void main(String[] args) {
        /*
        task: PersonalInfo
	variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN

	output:
			full name is: YourFullName
			age is: YourAge years old
			gender is: YourGender
			Phone Number is: YourPhoneNumber
			SSN is: YourSSN

			please use concatenation, do not use more than 5 print statements
         */
        String firstname = "Asia";
        String lastName = "Bizub";
        String fullName = firstname+' '+lastName;
        char gender = 'F';
        int age = 36;
        long phoneNumber = 1234567890l;
        long SSN = 123456789l;

        System.out.println("Full Name is: "+fullName);
        System.out.println("Gender is: "+gender);
        System.out.println("Age is: "+age);
        System.out.println("Phone Number is: "+phoneNumber);
        System.out.println("SSN is: "+SSN);




    }
}
