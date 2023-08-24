public class Employee{
    private String branch,id;
   

    public Employee(String branch,String id){
                this.branch = branch;
                this.id = id;
                
    }

    @Override
    public String toString(){
        return "Branch : "+branch+" , ID : "+id;
    }
    public static void main(String []args){
                Employee e1 = new Employee("programing","ab12");
                System.out.println(e1);
    }
}