class mydaddy{
    void display(){
        System.out.println("my daddy is a farmer.");
    }
}
class mysister extends mydaddy{
    void show(){
        System.out.println("my sister is a webdeveloper.");
        
    }
}
class me extends mydaddy{
    void show(){
        System.out.println("Im a student.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        me deva=new me();
        deva.display();
        mysister sis=new mysister();
        deva.show();
        deva.display();
    
}
}
