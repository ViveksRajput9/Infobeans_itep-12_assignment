class Product {
    String productId;
    String productName;
    int price;

    Product(String productId, String productName, int price ){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    void productDetail(){
        System.out.println("ProductId :- "+productId);
        System.out.println("ProductName :- "+productName);
        System.out.println("Price :- "+price);
    }
}
class Electronics extends Product{
    int warranty;
    String modelName;

    Electronics(String productId, String productName,String modelName,int price ,int warranty){
        super(productId, productName, price);
        this.warranty = warranty;
        this.modelName = modelName;
    }
    void productDetail(){
        super.productDetail();
        System.out.println("Warranty :- "+warranty+" Year");
        System.out.println("ModelName 1");
    }
}
class Clothing extends Product{
    int size;
    Clothing(String productId, String productName, int price ,int size){
        super( productId,  productName,  price );
        this.size = size;
    }
}
class Grocery extends Product{
    String expiryDate;
    Grocery(String productId, String productName, int price ,String expiryDate){
        super(productId, productName, price);
        this.expiryDate  = expiryDate;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Electronics tv = new Electronics("tv101", "Tv", "LG15h",12000, 1);
        tv.productDetail();
    }
    
}
