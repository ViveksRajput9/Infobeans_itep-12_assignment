public class pt30 {
        public static void main(String[] args) {
            int i,j;
            for(i=1;i<=11;i++){
                for(j=1;j<=11;j++){
                    if(i+j<=7||i-j>=5||j-i>=5||i+j>=17)
                        System.out.print("*");
                    else
                      System.out.print(" ");
                }
        
                System.out.println();
            }
        }
}
