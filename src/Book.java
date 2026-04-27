public class Book {
    private String name;
    private int year;
    Author Author;

    public Book (String name, int year,Author Author){
        this.name = name;
        this.year = year;
        this.Author = Author;

    }

    public String getName(){return this.name;}

    public int getYear(){return this.year;}
    public void setYear(int year) {this.year = year;}
}
