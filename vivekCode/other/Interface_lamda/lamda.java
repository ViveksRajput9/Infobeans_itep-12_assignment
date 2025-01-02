 interface la {
    void drive();
    
}
class A implements la{
    public void drive (){
            System.out.println(" drive....");
        }
}

public class lamda {
    public static void main(String[] args) {
        la a = ()-> System.out.println("driving....");
        a.drive();
        A e = new A();
        e.drive();
    }
}
