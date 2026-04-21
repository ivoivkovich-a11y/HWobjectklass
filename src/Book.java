public class Book {
    private String name;
    private int year;
    String author;


    public Book (){
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public static Book createBook (String name, int year, String author){
        Book book = new Book();
        book.name = name;
        book.year = year;
        book.author = author;
        return book;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String getAutor(){
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
