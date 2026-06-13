
package model;

public class Student{


    private int stuId;
    private String name;
    private double marks;

    public Student(int stuId,String name ,double marks){

        this.stuId = stuId;
        this.name = name;
        this.marks = marks;

    }

    public int getId(){
        
        return stuId;
    }

    public String getName(){
        
        return name;
    }
     
     public double getMarks(){
        
        
        return marks;
     }

     public void setName(String name){
         this.name = name;
     }

    public void setMarks(double marks){
        this.marks = marks;
    }

   @Override

   public String toString(){
    return stuId+" " + name + " " + marks ;
   }


}