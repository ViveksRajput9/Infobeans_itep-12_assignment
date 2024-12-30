package oops.Super;

// class SA1{
 
// }
// class SB1 extends SA1{
//     SB1(){
//         super();
//         System.out.println("This is SB class default constructor");
//     }
// }             

// public class su4 {
//     public static void main(String[] args) {
//         SB1 s =  new SB1();
//     }
// }

// class SA1{
//     SA1(int x){
//         System.out.println("this is A class single para ");
//     }
// }
// class SB1 extends SA1{
//     SB1(){
//         System.out.println("This is SB class default constructor");
//     }
// }             

// public class su4 {
//     public static void main(String[] args) {
//         SB1 s =  new SB1();
//     }
// }


// class SA1{
//     SA1(int x){
//         System.out.println("this is A class single para ");
//     }
// }
// class SB1 extends SA1{
//     SB1(){
//         super(10);
//         System.out.println("This is SB class default constructor");
//     }
// }             

// public class su4 {
//     public static void main(String[] args) {
//         SB1 s =  new SB1();
//     }
// }

class SA1{
    SA1(){

    }
    SA1(int x){
        System.out.println("this is A class single para ");
    }
    SA1(int x , int y){
        
        System.out.println("this is A class double para ");
    }
}
class SB1 extends SA1{
    SB1(){
        super(10);
        System.out.println("This is SB class default constructor");
    }
    SB1(int x , int y){
        super(x, y);
        System.out.println("This is SB class double constructor");
    }
}             

public class su4 {
    public static void main(String[] args) {
        SB1 s =  new SB1();
        SB1 s1 =  new SB1(100,200);
        

    }
}
