import java.util.Scanner;
class Product{
     String name;
     double price;
     long id;
     String location;
     String type;

    Product(long id,String name, double price, String location, String type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.type = type;
    }
    
    
}

class Obj5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        Product s[] = new Product[x];
        for(int i=0; i<s.length; i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            String location = sc.nextLine();
            String type = sc.nextLine();
            s[i] = new Product(id, name, price, location, type);
        }
        for(Product y:s){
            System.out.println(y.id +" " + y.name +" " + y.price+ " " + y.location+ " " + y.type);
        }
    }
}