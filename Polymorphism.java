class college{
    void department(){
        System.out.println("welcome to excel college");
    }
}
class CSE extends college{
    void department(){
        System.out.println("welcome to computer science department");
    }
}
class ECE extends college{
    void department(){
        System.out.println("welcome to ECE department");
}
}
class AIDS extends college{
    void department(){
     System.out.println("welcome to AIDS department");
}
}
public class Main{
    public static void main(String[] args){
        college c=new CSE();
        c.department();
        
        college d=new ECE();
        c.department();
        college e=new AIDS();
        e.department();
        
    }
}
