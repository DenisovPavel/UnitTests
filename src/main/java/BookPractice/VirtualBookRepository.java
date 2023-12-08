package BookPractice;

import java.util.List;

public interface VirtualBookRepository {
    Book findByBookId(String id);

    List<Book> findAllBooks();
}
