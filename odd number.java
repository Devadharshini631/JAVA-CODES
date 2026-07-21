import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elements in array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
                System.out.println("Enter the "+(i+2)+" element : ");
        arr[i]=sc.nextInt();
        }
        System.out.println("odd element are: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
 
