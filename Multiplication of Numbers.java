import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number;");
        int n=sc.nextInt();
        int mul=0;
        for(int i=1;i<=n;i++){
            mul+=i;
        }
        System.out.println("mul="+mul);
        }
    }
