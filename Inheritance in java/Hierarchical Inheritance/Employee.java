public class Employee extends Person2{
    private String company;
   

    public Employee(String company , String name,String gender){
               super(name, gender);
                this.company = company;            
    }

    @Override
    public String toString(){
        return "Company : "+company +" ," +super.toString();
    }
    public static void main(String []args){
                Employee e1 = new Employee("honda","raju","male");
                System.out.println(e1);
    }
}