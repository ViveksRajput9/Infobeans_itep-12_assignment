public class pascal {
    public static void main(String[] args) {
        for(int i= 0;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print(" ");
            }
            int p=1;
            for(int k =0;k<=i;k++){
                System.out.print(p+" ");
                p=p*(i-k)/(k+1);
                
            }
            System.out.println();
        }
    }
}                  