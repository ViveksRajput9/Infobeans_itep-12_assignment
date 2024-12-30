import java.util.Scanner;
class Employe{
    int id;
    String name;
    Double salary;
    String addresh;
    long mobile;
    boolean status;

    Employe(int id, String name, Double salary, String addresh, long mobile, boolean status){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresh = addresh;
        this.mobile = mobile;
        this.status = status;
    }
}
class Cnst4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give array size");
        int n = Integer.parseInt(sc.nextLine());
        Employe ar[] = new Employe[n];
        System.out.println("give array value");
        for(int i=0; i<ar.length; i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double salary = Double.parseDouble(sc.nextLine());
            String addresh = sc.nextLine();
            long mobile = Long.parseLong(sc.nextLine());
            boolean status = Boolean.parseBoolean(sc.nextLine());
            ar[i] = new Employe(id, name, salary, addresh, mobile, status);
        }
        System.out.println("answer");
        for(Employe y:ar){
            System.out.println(y.id +" " + y.name +" " + y.salary+ " " + y.addresh+ " " + y.mobile + " " + y.status);
        }
    }
}