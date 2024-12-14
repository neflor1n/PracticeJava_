package practice;



class Animal {
    public void AnimalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void AnimalSound() {
        System.out.println("The pig makes a sound: Wee Wee");
    }
}
class Dog extends Animal {
    public void AnimalSound() {
        System.out.println("The dog makes a sound: bow wow");
    }
}


public class classesAndMore {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.AnimalSound();
        myPig.AnimalSound();
        myDog.AnimalSound();


    }

}
