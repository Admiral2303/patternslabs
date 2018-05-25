public class Book {
    private String subject;
    private String subject_level;



    public Book(String subject, String subject_level) {
        this.subject = subject;
        this.subject_level = subject_level;
    }

    public String getSubject_level() {
        return subject_level;
    }
    public String getSubject() {
        return subject;
    }

}
