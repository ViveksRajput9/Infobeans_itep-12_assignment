// factorial of a number
class Ar9{
    public static void main(String args[]){
        int n = 4, fact=1;
        for(int i=n; i>1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}