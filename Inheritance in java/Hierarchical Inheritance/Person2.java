public class Person2{
    private String name,gender;


    public Person2(String name,String gender){
                this.name = name;
                this.gender =gender;
    }

    @Override
    public String toString(){
        return "name : "+name+", gender : "+gender;
    }
    public static void main(String []args){
                Person2 p1 = new Person2("vishu","male");
                System.out.println(p1);
    }
}