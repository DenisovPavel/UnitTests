package BookPractice;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    private VirtualBookRepository virtualBookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookService(VirtualBookRepository virtualBookRepository) {
        this.virtualBookRepository = virtualBookRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookByIdVirtual(String id) {
        return virtualBookRepository.findByBookId(id);
    }

    public List<Book> findAllBooksVirtual() {
        return virtualBookRepository.findAllBooks();
    }


}

