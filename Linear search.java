import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks={70,89,70,66,44};
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] == num) {
                System.out.print("Numbers found");
                return;
        }
        }
        System.out.println("Number not found");
    }
}
