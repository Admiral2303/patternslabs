public class Director {

    private static Director _director;

    protected Director() {
    }

    public static Director Instance() {
        if (_director == null) {
            _director = new Director();
        }
        return  _director;
    }

    public BooksSet GenereteBooksSet(BookSetBuilder bookSetBuilder) {
        bookSetBuilder.CreateBooksSet();
        bookSetBuilder.setLanguageBook();
        bookSetBuilder.setMathematicalBook();
        bookSetBuilder.setNaturalBook();
        return bookSetBuilder.get_booksSet();
    }
}
