public class Dog{


        private String name;
        private String breed;

        Dog(String name, String breed){
            this.name = name ;
            this.breed = breed ;
        }

        void setName(String name){
                this.name=name;
        }

        void setBreed(String breed){
            this.breed=breed;
        }
        
        
        String getName(){
            return name;
        }

        String getBreed(){
            return breed;
        }
   public static void main(String[] args){

            Dog d1 = new Dog( "scooby" , "LABRADOR" );    
            Dog d2 = new Dog( "Drago" , "PUG" );


           d1.setName("shakaal");
           d1.setBreed("kanger");
           System.out.println("THE NAME IS : "+d1.getName()+", AND BREED IS : "+d1.getBreed());
           
           d2.setName("kalu");
           d2.setBreed("gali da kutta"); 
           System.out.println("THE NAME IS : "+d2.getName()+", AND BREED IS : "+d2.getBreed());
            
            
    }
}