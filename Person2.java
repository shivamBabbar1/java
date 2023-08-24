public class Person2{
    private String name,gender,id;
    private int age;

    public Person2(String name,String gender,String id,int age){
                this.name = name;
                this.gender =gender;
                this.id = id;
                this.age = age;
    }

    @Override
    public String toString(){
        return "name : "+name+", gender : "+gender+", id : "+id+", age :"+age;
    }
    public static void main(String []args){
                Person2 p1 = new Person2("sss","male","a441",14);
                System.out.println(p1);
    }
}