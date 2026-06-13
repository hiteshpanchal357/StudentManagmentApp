
package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    // create

    public void addStudent(Student student) {

        students.add(student);
    }

    // read

    public void displayStudent() {

        for (Student s : students) {

            System.out.println(s);
        }
    }

    // update

    public void updateStudent(int id, double marks) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setMarks(marks);
                System.out.println("Student data updated");

                return;
            }

        }

        System.out.println("Student not found");

    }

    //delete

    public void deleteStudent(int id){
        for(Student s : students){

            if(s.getId() == id){
                students.remove(s);
                System.out.println("Student deleted");  
                return;
            }
        }

        System.out.println("Student data is not present");
    }
}
