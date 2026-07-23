class mygrandpa{
    void display(){
        System.out.println("my grandfather is a farmer.");
    }
}
class daddy extends mygrandpa{
    void show(){
        System.out.println("my father is a farmer.");
        
    }
}
class me extends daddy{
    void display1(){
        System.out.println("Iam a student.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        me deva=new me();
        deva.display();
        deva.show();
        deva.display1();
    
}
}
