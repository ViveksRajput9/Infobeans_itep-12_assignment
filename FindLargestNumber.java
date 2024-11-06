import java.util.Scanner;
class FindLargestNumber{
    public static void main(String ar[]){

        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("Enter 1st no :-");
        int input1 = scan.nextInt();
        System.out.print("Enter 2nd no :-");
        int input2 = scan.nextInt();
        System.out.print("Enter 3rd no :-");
        int input3 = scan.nextInt();

        if(input1 >= input2&&input1>=input3){
                System.out.println(input1+" is a largest no");
        }else if(input2>=input3&&input2>=input1){

            System.out.println(input2+" is a largest no ");
        }else if(input3>=input1&&input3>=input2){

            System.out.println(input3+ " is a larget no ");
        }
            // else { 
        //     System.out.println("every no is equal")
        // }
        System.out.print("Do you want to run again this program type '1' for exit '0' ");
        int repeat = scan.nextInt();
        if(repeat==0){
            break;
        }
    }
        scan.close();
    }
}