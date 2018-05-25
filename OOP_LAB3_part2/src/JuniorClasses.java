public class JuniorClasses extends BookSetBuilder {
    @Override
    public void setMathematicalBook() {
        Book math = new Book("Math", "junior");
        booksSet.mathematical_books.add(math);
    }

    @Override
    public void setNaturalBook() {
        Book natural_science = new Book("Natural science", "junior");
        booksSet.natural_books.add(natural_science);
    }

    @Override
    public void setLanguageBook() {
        Book language = new Book("Ukraine language", "junior");
        booksSet.language_books.add(language);
    }
}
