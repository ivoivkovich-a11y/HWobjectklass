public class Book {
    String name;
    int year;
    Author Author;

    public Book (String name, int year,Author Author){
        this.name = name;
        this.year = year;
        this.Author = Author;

    }

    public String getName(){return this.name;}

    public int getYear(){return this.year;}
}
