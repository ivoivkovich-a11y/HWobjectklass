//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main(String[] args) {

    Author alphabetAutor = new Author("David", "Diringer");
    Book alphabet = new Book("alphabet", 1948, alphabetAutor);

    System.out.println("alphabet.getName() = " + alphabet.getName());
    System.out.println("alphabet.getYear() = " + alphabet.getYear());
    System.out.println("alphabet.Author.getName() = " + alphabet.Author.getName());
    System.out.println("alphabet.Author.getSurname() = " + alphabet.Author.getSurname());

    Author whiteBimBlackEarAutor = new Author("Гавриил", "Троепольский");
    Book whiteBimBlackEar = new Book ("Белый Бим Чёрное ухо", 1971,whiteBimBlackEarAutor);

    System.out.println("whiteBimBlackEar.getName() = " + whiteBimBlackEar.getName());
    System.out.println("whiteBimBlackEar.getYear() = " + whiteBimBlackEar.getYear());
    System.out.println("whiteBimBlackEar.Author.getName() = " + whiteBimBlackEar.Author.getName());
    System.out.println("whiteBimBlackEar.Author.getSurname() = " + whiteBimBlackEar.Author.getSurname());
}
