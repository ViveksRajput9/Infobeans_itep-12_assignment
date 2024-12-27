package vivekCode.other;
// remove pakage line for run this code using terminal if not remove this line you get class not found error 
public class CommandLineArgument {
    public static void main(String ar[]){
        int x = Integer.parseInt(ar[0]);
        int y = Integer.parseInt(ar[1]);
        System.out.println(x+y);
        System.out.println(x*y);
    }
}
