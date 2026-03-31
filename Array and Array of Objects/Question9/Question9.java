import java.util.Scanner;
class Book{
  String title;
  String author;
  double price;
  
  Book(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
  }

  void display(){
    System.out.println(title+" "+author+" "+price);
  }
}

class Ass3_pr9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Book[] book = new Book[5];

    for(int i=0; i<5; i++){
    System.out.println("enter the data of book"+(i+1));
    book[i] = new Book(sc.next(), sc.next(),sc.nextDouble());
    }
    
      System.out.println("details of book");
      for(int i=0; i<5; i++){
        book[i].display();

      }
  }
}
