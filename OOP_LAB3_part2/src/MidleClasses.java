public class MidleClasses extends BookSetBuilder{
    @Override
    public void setMathematicalBook() {
        Book algebra = new Book("Algebra", "midle");
        booksSet.mathematical_books.add(algebra);
    }

    @Override
    public void setNaturalBook() {
        Book chemitry = new Book("Chemitry", "midle");
        booksSet.natural_books.add(chemitry);
    }

    @Override
    public void setLanguageBook() {
        Book literature = new Book("Literature", "midle");
        booksSet.language_books.add(literature);
    }
}
