package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Souvik",2,24));
        students.add(new Student("Jayanta",23,54));
        students.add(new Student("Sharmistha",43,52));
        students.add(new Student("Adrika",1,17));

        Collections.sort(students);
        System.out.println(students);
    }
}
