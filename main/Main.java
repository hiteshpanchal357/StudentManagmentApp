
package main;

import model.Student;
import service.StudentService;

public class Main {
  
    public static void main(String[] args){

        StudentService service = new StudentService();

        service.addStudent(new Student(101,"hitesh",100));
        service.addStudent(new Student(102,"suresh",90));
        service.addStudent(new Student(103,"lalu",100));

        service.displayStudent();

        service.updateStudent(103,152);
          service.displayStudent();

          service.deleteStudent(101);
            service.displayStudent();
    }
}
