package books;
public class book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public book(String title, String author, int yearPublished, double price) {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }
    public String toString(){   
            return "\nTitle : "+title+"\nAuthor : "+author+"\nYear Published : "+yearPublished+"\nPrice : P"+price;   
    }
    public static void main(String[] args) {
        book b1 = new book("BIBOY World of CockFighthing","Biboy D. Enrequiz",1999,850.00);
        book b2 = new book("The Hitchhiker's Guide to Galaxy","Douglas Adams",1979,500.00);
        book b3 = new book("The Lord of the Rings","J.R.R. Tolkien",1954-1955,1000.00);

        System.out.println("\nBook 1"+b1+"\n\nBook 2"+b2+"\n\nBook 3"+b3);
    }
}
