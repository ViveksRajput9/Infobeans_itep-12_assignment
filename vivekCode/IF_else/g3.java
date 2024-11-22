import java.util.Scanner;
public class g3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float totalMark=0;
        float averageMark;
        for(int i = 1; i<=5;i++){
            while (true) {
                System.out.print("Enter your "+i+" subject number :- ");
                int n = scan.nextInt();
                if(n>=0&&n<=100){
                    totalMark += n;
                    break;
                }else{
                    System.out.println("wrong Input try again Enter range between 0 to 100 ");
                }
            }
        }
        averageMark = (totalMark/500)*100;
        System.out.println(averageMark);
        if(averageMark>=90){
            System.out.println("'Congratulation ' you got( Grade A )");
        }else if(averageMark>=80){
            System.out.println("'Congratulation ' you got( Grade B )");
        }else if(averageMark>=70){
            System.out.println("'Congratulation ' you got( Grade C )");
        }else if(averageMark>=60){
            System.out.println("'Congratulation ' you got( Grade D )");
        }else if(averageMark>=50){
            System.out.println("'Congratulation ' you got( Grade E )");
        }else{
            System.out.println("You are Fail Try again");
        }
    }
}
