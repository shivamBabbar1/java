
class Lion{

    void LionSound() {
        System.out.println("Rooaarrr..");
    }

}

class Dog extends Lion {

    void DogSound() {
        System.out.println("bark...");
    }

}

class Cat extends Dog {
    void CatSound() {
        System.out.println("meeooww...");
    }

}

public class AnimalSound {

    public static void main(String[] args) {
        Cat ob = new Cat();
        ob.CatSound();
        ob.DogSound();
        ob.LionSound();
    }
}