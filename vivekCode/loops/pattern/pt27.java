public class pt27 {
    public static void main(String[] args) {
        int i,j,k;
        for( i = 1;i<=5;i++)
        {
            for( j = 1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for( k =5;k>=i;k--)
            {
                System.out.print("x");
            }
            System.out.println();
        }
        for(i = 1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}