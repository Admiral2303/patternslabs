public abstract class BookSetBuilder {
    public BooksSet booksSet;

    public void CreateBooksSet(){
        booksSet = new BooksSet();
    }
    public abstract void setMathematicalBook();
    public abstract void setNaturalBook();
    public abstract void setLanguageBook();

    public BooksSet get_booksSet(){
        return booksSet;
    }

}
