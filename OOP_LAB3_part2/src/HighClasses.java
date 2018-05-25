public class HighClasses extends BookSetBuilder {
    @Override
    public void setMathematicalBook() {
        Book geometric = new Book("Geometric", "high");
        booksSet.mathematical_books.add(geometric);
    }

    @Override
    public void setNaturalBook() {
        Book physics = new Book("Physics", "high");
        booksSet.natural_books.add(physics);
    }

    @Override
    public void setLanguageBook() {
        Book word_literature = new Book("Word literature", "high");
        booksSet.language_books.add(word_literature);
    }
}
