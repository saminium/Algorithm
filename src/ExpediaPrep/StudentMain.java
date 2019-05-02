package ExpediaPrep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by szeru on 4/10/2019
 */
public class StudentMain {

    public static class Student implements Comparable<Student> {
        private String firstName;
        private String lastName;
        private LocalDate dob;


        public Student(String firstName, String lastName, LocalDate dob){
            this.firstName = firstName;
            this.lastName = lastName;
            this.dob = dob;
        }

        @Override
        public int compareTo(Student student) {

            if(this.lastName.compareTo(student.lastName) == 0){
                if(this.dob.isBefore(student.dob)){
                    return 1;
                }else if(this.dob.isEqual(student.dob)){
                    return 0;
                }else{
                    return -1;
                }
            }else{
                return this.lastName.compareTo(student.lastName);
            }

        }

        @Override
        public String toString() {
            return "First Name: " + this.firstName + " " + "Last Name: " + this.lastName + " " + "DOB: " + this.dob ;
        }
    }
    static List<Student>  students = new ArrayList<>();
   static {



        Student std1 = new Student("St1", "St1l", LocalDate.now().minusDays(10));
        Student std2 = new Student("St2f", "St2l", LocalDate.now().minusDays(9));
        Student std3 = new Student("St3", "St21", LocalDate.now().minusDays(10));

        students.addAll(Arrays.asList(std1, std2, std3));


    }

    public static void main(String[] args){
        Collections.sort(students);

        students.forEach(student -> System.out.println(student));
    }
}
