package Practice_Tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String str = new String ("Batch 21");
        Student student1 = new Student();
        student1.setInfo("Asia", 'F', LocalDate.of(1984, 5, 28 ), "B01", 4.0);

        System.out.println(list.toString());
        System.out.println(str.toString());


        System.out.println(student1);
        //student1.getInfo();

    }
}
