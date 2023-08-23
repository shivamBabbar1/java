// package java_p;
public class Perrson{

        private String name;
        private int age;

        public Perrson(String name , int age){
                this.name = name;
                this.age = age;
        }

        void setName(String name){
                this.name = name ;
        }
        void setAge(int age){
                this.age = age ;
        }

        void getName(){
            System.out.println(name);
        }

        void getAge(){
            System.out.println(age);
        }
public static void main(String[] args){
    
       

//calling of methods.....

Perrson s1 = new Perrson("johan",20);
Perrson s2 = new Perrson("kira",22);
s1.getAge();
s1.getName();
s2.getAge();
s2.getName();
    }
}