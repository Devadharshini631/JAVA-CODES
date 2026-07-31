import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter stack size:");
        int size=sc.nextInt();
        int[] stack=new int[size];
        int top=-1;
        int choice;
        
        do {
            System.out.print("/n1.push");
            System.out.print("n2.push");
            System.out.print("n3.push");
            System.out.print("n4.push");
            System.out.print("n5.push");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            
            switch(choice){
                
                case 1:
                if(top==size-1){
                    System.out.print("stack overflow");
                }else{
                    System.out.print("enter value:");
                    int value=sc.nextInt();
                    top++;
                    stack[top]=value;
                    System.out.print(value+"inserted");
                    
                }
                break;
                
                case 2:
                if(top==-1){
                    System.out.println("stack uderflow");
                }else{
                    System.out.println(stack[top]+"removed");
                    top--;
                    
                }
                break;
                
                case 3:
                 if(top==-1){
                     System.out.println("stack is empty");
                 }else{
                     System.out.println("top element="+stack[top]);
                 }
                 break;
                 case 4: 
                   if(top==-1){
                       System.out.println("stack is empty");
                   }else{
                       System.out.println("stack element");
                       for(int i=top;i>=0;i--){
                           System.out.println(stack[i]);
                       }
                   }
                   break;
                   
                   case 5:
                       System.out.println("program ended");
                       break;
                   default:
                   System.out.println("invalid choice");
                 }                    
                }
                while(choice !=5);
                sc.close();
                }
                }
