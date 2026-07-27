abstract class payment {
    abstract void pay();
        void receipt(){
            System.out.println("receipt generated");
        }
    }
    
    class UPI extends payment{
        void pay(){                                                      
            System.out.println("paid using UPI");
        }
    }
    
    class card extends payment{
        void pay(){
            System.out.println("paid using card");
        }
    }
    public class Main {
        public static void main(String[] args){
            card c=new card();
            c.receipt();
            c.pay();
        }
    }
