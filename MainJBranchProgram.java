// Book.java
class Book {
    String bookName;
    String author;
    String publisher;
    double price;
    int yearPublished;

    // Constructor
    Book(String bookName, String author, String publisher, double price, int yearPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    // Display method
    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year Published: " + yearPublished);
    }
}

// BookSales.java
class BookSales {
    int salesManId;
    String salesManName;
    int numberOfSales;

    // Constructor
    BookSales(int salesManId, String salesManName, int numberOfSales) {
        this.salesManId = salesManId;
        this.salesManName = salesManName;
        this.numberOfSales = numberOfSales;
    }

    // Display method
    void display() {
        System.out.println("Salesman ID: " + salesManId);
        System.out.println("Salesman Name: " + salesManName);
        System.out.println("Number of Sales: " + numberOfSales);
    }
}

// MainJBranchProgram.java
public class MainJBranchProgram{
    public static void main(String[] args) {
        System.out.println("=== Book Details ===");
        Book book = new Book("Java Fundamentals", "John Doe", "TechPub", 39.99, 2022);
        book.display();

        System.out.println("\n=== Book Sales Details ===");
        BookSales sales = new BookSales(101, "Alice", 150);
        sales.display();
    }
}