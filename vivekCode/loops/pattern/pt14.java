public class pt14 {
    public static void main(String[] args) {
        for (int i = 74; i >=65; i-=2) {
            for (int j = 65; j <=i; j+=2) {
                System.out.print((char)(j));
            }
            System.out.println();
        }
    }
}
