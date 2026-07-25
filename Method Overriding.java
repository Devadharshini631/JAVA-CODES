class Animal{
    void sound(){
        System.out.println("Animal is make a sound");
    }
}
class Dog extends Animal{
    
    void sounds(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    
    void sound(){
        System.out.println("Cat meow");
    }
}
public class Main{
    public static void main(String[] args){
        Animal a=new Dog();
        a.sound();
        
        Animal a1=new Cat();
        a1.sound();
    }
}
