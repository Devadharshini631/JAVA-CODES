interface Animals{
    void sound();
    
}
class Dog implements Animals{
    public void sound(){
        System.out.println("Dog is barking");
    }
}
public class Main{
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
    }
}
