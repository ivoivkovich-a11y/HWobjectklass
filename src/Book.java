public class Book {
    private String name;
    private int year;
    private String Author;


    public Book (){
        this.name = name;
        this.year = year;
        this.Author = Author;
    }

    public static Book createBook (String name, int year, String Author){
        Book book = new Book();
        book.name = name;
        book.year = year;
        book.Author = Author;
        return book;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String getAutor(){
        return this.Author;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
