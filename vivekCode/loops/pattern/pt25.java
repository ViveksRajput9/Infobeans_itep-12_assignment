public class pt25 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            for(int j = 1; j<=8;j++){
                if(i==4&&j>=7||i==6&&j>=7){
                    break;
                }else if(i%2!=0&&j%2!=0||i%2==0&&j%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}