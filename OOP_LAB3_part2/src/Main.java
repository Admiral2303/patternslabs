//builder

public class Main {
    public static void main(String[] args) {
        BookSetBuilder juniorClasses = new JuniorClasses();
        Director dir = Director.Instance();
        BooksSet juniorClassesbooks_set = dir.GenereteBooksSet(juniorClasses);
        juniorClassesbooks_set.get_info();
    }
}
