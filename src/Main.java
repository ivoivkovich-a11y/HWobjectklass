//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main(String[] args) {
    Book alphabet = Book.createBook("alphabet", 1948, "David Diringe");
    Author authorAlphabet = Author.createAuthor("David", "Diringer");
    Book whiteBimBlackEar = Book.createBook("Белый Бим Чёрное ухо", 1971, "Гавриил Троепольский");
    Author authorwhiteBimBlackEar = Author.createAuthor("Гавриил", "Троепольский");

    System.out.println("alphabet.name = " + alphabet.getName());
    System.out.println("alphabet.year = " + alphabet.getYear());
    System.out.println("authorAlphabet.name = " + authorAlphabet.getName());
    System.out.println("authorAlphabet.surname = " + authorAlphabet.getSurname());
    System.out.println("whiteBimBlackEar.name = " + whiteBimBlackEar.getName());
    alphabet.setYear(1956);
    System.out.println("alphabet.year = " + alphabet.getYear());


}
