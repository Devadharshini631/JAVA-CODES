public class largestelement {
    public static void main(String[] args) {
        int[] arr={10,20,30,50};
        int man=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        if (arr[i]>man) {
            man=arr[i];
        }
        }
                System.out.print("Maximum element "+(man));
        }
}
