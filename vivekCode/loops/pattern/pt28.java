public class pt28 {
    public static void main(String[] args) {
        int i,j,s=7,e=5;
        for(i=1;i<=11;i++){
            for(j=1;j<=11;j++){
                if((i>1&&i<11)&&(j>=s&&j<=e))
                    System.out.print(" ");
                else
                  System.out.print("*");
            }
            s=(i>5)?(s+1):(s-1);
            e=(i>5)?(e-1):(e+1);
            // if(i>5){
            //     s++;
            //     e--;
            // }else{
            //     s--;
            //     e++;
            // }
            System.out.println();
        }
    }
}