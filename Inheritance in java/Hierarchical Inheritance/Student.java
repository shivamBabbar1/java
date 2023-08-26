
public class Student extends Person2{
   
    private String classs;
    
    public Student(String classs ,String name,String gender){
               super( name, gender);
                this.classs = classs;                         
    }

    @Override
    public String toString(){
        return "classs : "+ classs +" ," +super.toString() ;
    }
    
public static void main(String[] args){
                Student s1 = new Student("12th","kalu","male");
                System.out.println(s1);
    }
}