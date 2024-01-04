package BishworajPoudel101;

public class CTorWork {
    public static void main(String[] args) {
        Book b = new Book("Rich Dad Poor Dad", "Robot T Kiyosaki",160);
        Book b2 = new Book("Learn Java","Bishworaj Poudel",10);
        b.display();
        b2.display();
    }
}

class Book{
    // Properties
    String name;
    String author;

    double price;

    // Create Constructor


    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Book name is "+this.name);
        System.out.println("Book Author is "+this.author);
        System.out.println("Book price is "+this.price);
        System.out.println("--------------");
    }
}
