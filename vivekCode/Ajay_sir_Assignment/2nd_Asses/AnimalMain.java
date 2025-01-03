class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog bark");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
