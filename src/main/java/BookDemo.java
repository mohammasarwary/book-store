import java.util.List;

public interface BookDemo {
    void addBooK(Book book);
    void updatedBook(Book book);
    void deletBook(Book book);
    Book getBookById(int booid);
    List<Book>getALLBooks();
}
