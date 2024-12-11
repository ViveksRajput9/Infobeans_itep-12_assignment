package arrays;
import java.util.Scanner;

public class ar2 { 
    public static void linearSearch(int arr[],int value){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println( " "+arr[i]+" value is present at position = "+(i+1));
                break;
            }
        }
    }
    public static void linearSearch1(int arr[],int value){
        int i,flag =0,count=0;
        for(i =0;i<arr.length;i++){
            if(arr[i]==value){
                flag=1;
                count++;
            }
        }
        if(flag==1)
           System.out.println( " "+value+" value is present at positions = "+count);
        else
           System.out.println("Value Not Found");

    }
    public static void linearSearch2(int arr[],int value){
        int flag =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==value){
                flag = 1;
                System.out.println( " "+arr[i]+" value is present at position = "+(i+1));
            }
        }
        if(flag==0){
            System.out.println("Value Not Found");
        }
    }
    public static void inputArray(int arr[]){
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("put the value in index "+i+":-");
            arr[i] = scan.nextInt();
        }
        scan.close();
    }
    public static void printArray(int arr[]){
        for (int i=0 ;i<arr.length; i++) {
            // System.out.print("a["+i+"] = "+ arr[i]+" ");
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeArray(int[] arr,int[] arr2,int[] arr3) {
        
        for(int i=0;i<arr.length;i++){
            if(i==arr3.length+arr2.length-1){
                break;
            }
            if(i<arr2.length){
                arr[i]=arr2[i];
            }
            else{
                arr[i]=arr3[i-arr2.length];
            }
        }
    }
     public static void mergeArrayInEvenOder(int[] arr,int[] arr1,int[] arr2) {
        int p1=0,p2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==1&&p1<arr1.length){
                arr[i]=arr1[p1];
                p1++; 
            }
            else{
                arr[i]=arr2[p2];
                p2++;
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
        int c[] = {10,10,20,30,47,10,58,65,10};
        // int a[] = new int[5];
        // inputArray(a);

        // int b[] = new int[5];
        // inputArray(b);

        // reverseArray(b);
        int d[] = new int[a.length+b.length+c.length];
        // mergeArrayInEvenOder(c,a,b);
        // // mergeArray(c, a, b);
        // printArray(c);
        // System.out.println();
        linearSearch(c, 50);
        System.out.println();
        // mergeArray(d, a, c);
        mergeArrayInEvenOder(d, a, c);
        System.out.println();
        linearSearch1(d, 10);
        System.out.println();
        linearSearch2(d, 10);

    }
}