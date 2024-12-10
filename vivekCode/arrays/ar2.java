package arrays;
import java.util.Scanner;

public class ar2 {
    public static void inputArray(int arr[]){
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("put the value in index "+i+":-");
            arr[i] = scan.nextInt();
        }
    }
    public static void printArray(int arr[]){
        for (int i=0 ;i<arr.length; i++) {
            // System.out.print("a["+i+"] = "+ arr[i]+" ");
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeArray(int[] arr,int[] arr2,int[] arr3) {
        int len = arr3.length;
        
        for(int i=0;i<arr.length;i++){
            if(i<len){
                arr[i]=arr2[i];
            }
            else{
                arr[i]=arr3[i-len];
            }
        }
    }
    public static void reverseArray(int[] arr) {
        for(int i = 0;i<arr.length/2;i++){
            
           int temp = arr[i];
           arr[i] = arr[arr.length-1];
           arr[arr.length-1] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {60,70,80,90,100};

        // int a[] = new int[5];
        // inputArray(a);

        // int b[] = new int[5];
        // inputArray(b);

        reverseArray(b);
        int c[] = new int[10];

        mergeArray(c, a, b);
        printArray(c);

    }
}
