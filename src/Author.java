public class Author {
     private String name;
     private String surname;

    public Author () {
        this.name = name;
        this.surname = surname;

    }

    public static Author createAuthor (String name, String surname) {
        Author author = new Author();
        author.name = name;
        author.surname = surname;
        return author;
    }


    public String getName(){
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}
