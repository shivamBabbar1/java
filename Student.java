public class Student{
    private String class,subject,rollno;
   

    public Student(String class , String subject , int rollno){
                this.class = class;
                this.subject = subject;
                this.rollno = rollno;//String.valueOf(rollno);             
    }

    @Override
    public String toString(){
        return "class : "+ class +" , Subject : "+ subject +" , Rollno : "+ rollno ;
    }
    
public static void main(String[] args){
                Student s1 = new Student("12th","english","11");
                System.out.println(s1);
    }
}