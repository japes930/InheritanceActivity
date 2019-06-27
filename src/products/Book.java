package products;
final public class Book extends Product {

    private String author;
    private int pages;


    public Book(){ //!Resolved my "actual or formal argument lists differ in length" error but not sure why

    }
    public Book(String code, String description, String author, int pages, double price){
        super(code, description, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return
                "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n" +
                "Author:             " + this.author + "\n" +
                "Pages:              " + this.pages + "\n";

    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }
}