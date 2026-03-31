import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    void display() {
        System.out.println(name + " " + price + " " + rating);
    }
}

class RatingComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.rating, p1.rating);
    }
}

class pr6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Product> list = new LinkedList<>();

        System.out.println("Enter details of 5 products:");

        for(int i=0;i<5;i++){
            String name = sc.next();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            list.add(new Product(name, price, rating));
        }

        System.out.println("\nAll Products:");
        for(Product p : list){
            p.display();
        }

        Product max = list.get(0);
        for(Product p : list){
            if(p.price > max.price){
                max = p;
            }
        }

        System.out.println("\nProduct with highest price:");
        max.display();

        Collections.sort(list, new RatingComparator());
        System.out.println("\nSorted by rating (descending):");
        for(Product p : list){
            p.display();
        }

        Iterator<Product> it = list.iterator();
        while(it.hasNext()){
            Product p = it.next();
            if(p.rating < 2.5){
                it.remove();
            }
        }

        System.out.println("\nAfter removing rating < 2.5:");
        for(Product p : list){
            p.display();
        }
    }
}
