public class Book {
    private String name;
    private int year;


    public Book (){
        this.name = name;
        this.year = year;

    }

    public static Book createBook (String name, int year){
        Book book = new Book();
        book.name = name;
        book.year = year;
        return book;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
