import java.util.Scanner;
class Product{
    String productName;
    double price;
    
    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
    
    void displayDetails(){
        System.out.println("---Product Details---");
        System.out.println("Product Name: "+productName+" Price: "+price);
    }
    
}

class Electronics extends Product{
    String brand ;
    int warrantyPeriod;
    Electronics(String productName, double price,String brand, int warrantyPeriod){
    super(productName,price);
    this.brand=brand;
    this.warrantyPeriod=warrantyPeriod;
    }
    @Override
    void displayDetails(){
        System.out.println("---ELectronics Details---");
        System.out.println("Product Name: "+productName+" Price: "+price+" Brand: "+brand+" Warrantty: "+warrantyPeriod);
    }
}

class Clothing extends Product{
    String size,material;
    Clothing(String productName,double price,String size,String material){
        super(productName,price);
        this.size=size;
        this.material=material;
    }
    @Override
    void displayDetails(){
        System.out.println("---Clothing Details---");
        System.out.println("Product Name: "+productName+" Price: "+price+" Size: "+size+" Material: "+material);
    }
}

class Ass5_pr4 {
    public static void main(String[] args){
        Product p = new Product("Speaker",200.4);
        p.displayDetails();
        Electronics e = new Electronics("airbud",1500.0,"Boat",2);
        e.displayDetails();
        Clothing c = new Clothing("T-Shirt",300.3,"XXL","Cotton");
        c.displayDetails();
    }
}
