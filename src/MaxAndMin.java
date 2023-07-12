import java.util.Scanner;

public class MaxAndMin {
    public static int max_min(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return maximum+minimum;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(max_min(arr));
    }
}
