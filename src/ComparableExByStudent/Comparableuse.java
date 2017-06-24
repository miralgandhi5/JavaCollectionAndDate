package ComparableExByStudent;

import java.util.*;
/**
 * Created by miral on 6/22/2017.
 */
public class Comparableuse {
    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList();
        StudentList.add(new Student("miral", 23d, 450d));
        StudentList.add(new Student("kunal", 29d, 350d));
        StudentList.add(new Student("pawan", 28d, 250d));
        StudentList.add(new Student("somya", 23d, 450d));


        System.out.println("sorted list :");

        Collections.sort(StudentList);
        Iterator itr2 = StudentList.iterator();
        while (itr2.hasNext()) {
            Student student = (Student) itr2.next();
            System.out.println(student.name + " " + student.age + " " + student.score);
        }

    }


}


class Student implements Comparable {
    String name;
    Double age;
    Double score;

    public Student(String name, Double age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }


    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        if(this.score==student.score)
            return this.name.compareTo(student.name);
        else
            return this.score.compareTo(student.score);

    }
}