package BookPractice;

import org.junit.jupiter.api.*;
import org.mockito.InOrder;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {


    @Test
    @DisplayName("Тест 1 (Pozitive) ")
    void checkFindBookByIdVirtual() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);

        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));

        // проверяем работу метода.

        bookService.findBookByIdVirtual("1");
        bookService.findBookByIdVirtual("2");
        bookService.findBookByIdVirtual("2");

        // Проверяем принадлежность findByBookId -> virtualBookRepository;
        verify(virtualBookRepository).findByBookId("1");

        // Проверяем что метод  findByBookId был вызван только один раз.
        verify(virtualBookRepository, times(1)).findByBookId("1");

        // Проверяем что метод  findByBookId был вызван дважды.
        verify(virtualBookRepository, times(2)).findByBookId("2");

        //  Проверяем что метод  findByBookId не был вызван по ID c arg "3";
        verify(virtualBookRepository, never()).findByBookId("3");


    }

    @Test
    @DisplayName("Тест 2 (Pozitive)")
    void checkFindAllBooksVirtual() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));
        virtualBooks.put("3", new Book("3", "Book3", "Author3"));
        virtualBooks.put("4", new Book("4", "Book4", "Author4"));
        virtualBooks.put("5", new Book("5", "Book5", "Author5"));
        virtualBooks.put("6", new Book("6", "Book6", "Author6"));
        virtualBooks.put("7", new Book("7", "Book7", "Author7"));
        virtualBooks.put("8", new Book("8", "Book8", "Author8"));
        virtualBooks.put("9", new Book("9", "Book9", "Author9"));
        virtualBooks.put("10", new Book("10", "Book10", "Author10"));

        // проверяем работу метода.
        bookService.findAllBooksVirtual();//1
        bookService.findAllBooksVirtual();//2
        bookService.findAllBooksVirtual();//3
        bookService.findAllBooksVirtual();//4
        bookService.findAllBooksVirtual();//5
        bookService.findAllBooksVirtual();//6
        bookService.findAllBooksVirtual();//7
        bookService.findAllBooksVirtual();//8
        bookService.findAllBooksVirtual();//9
        bookService.findAllBooksVirtual();//10

        // Проверяем что метод  findByBookId был вызван только один раз.
        verify(virtualBookRepository, times(10)).findAllBooks();

        // Тест на проверку размера
        assertEquals(10, virtualBooks.size());

    }

    @Test
    @Disabled
    @DisplayName("Тест 1 (Negative) ")
    void checkFindBookByIdVirtualNegative1() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);

        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));

        // проверяем работу метода.
        bookService.findBookByIdVirtual("1");
        bookService.findBookByIdVirtual("2");

        // Проверяем что метод  findByBookId был вызван только один раз - ожидаем негативный результат!
        verify(virtualBookRepository, times(5)).findByBookId("1");


    }

    @Test
    @Disabled
    @DisplayName("Тест 2 (Negative) ")
    void checkFindBookByIdVirtualNegative2() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);

        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("e1", new Book("10", "Book10", "Author10"));
        virtualBooks.put("e2", new Book("20", "Book20", "Author20"));

        // проверяем работу метода.

        bookService.findBookByIdVirtual("1");
        bookService.findBookByIdVirtual("2");
        bookService.findBookByIdVirtual("3");
        // - ожидаем негативный результат!

        assertEquals(5, virtualBooks.size());

    }


    @Test
    @Disabled
    @DisplayName("Тест 3 (Negative)")
    void checkFindAllBooksVirtualNegative3() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));
        virtualBooks.put("3", new Book("3", "Book3", "Author3"));
        virtualBooks.put("4", new Book("4", "Book4", "Author4"));
        virtualBooks.put("5", new Book("5", "Book5", "Author5"));
        virtualBooks.put("6", new Book("6", "Book6", "Author6"));
        virtualBooks.put("7", new Book("7", "Book7", "Author7"));
        virtualBooks.put("8", new Book("8", "Book8", "Author8"));
        virtualBooks.put("9", new Book("9", "Book9", "Author9"));
        virtualBooks.put("10", new Book("10", "Book10", "Author10"));

        // проверяем работу метода.
        bookService.findAllBooksVirtual();//1
        bookService.findAllBooksVirtual();//2
        bookService.findAllBooksVirtual();//3
        bookService.findAllBooksVirtual();//4
        bookService.findAllBooksVirtual();//5
        bookService.findAllBooksVirtual();//6
        bookService.findAllBooksVirtual();//7
        bookService.findAllBooksVirtual();//8
        bookService.findAllBooksVirtual();//9
        bookService.findAllBooksVirtual();//10

        // Проверяем что метод  findByBookId был вызван только один раз - ожидаем негативный результат!
        verify(virtualBookRepository, times(15)).findAllBooks();


    }

    @Test
    @DisplayName("Тест 3 (Pozitive)")
    void checkDifferenceBooksIdPositive() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);

        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));

        // проверяем работу метода.

        bookService.findBookByIdVirtual("1");
        bookService.findBookByIdVirtual("2");

        // проверка порядка выполнения findBookByIdVirtual

        InOrder inOrder = inOrder(virtualBookRepository);
        inOrder.verify(virtualBookRepository).findByBookId("1");
        inOrder.verify(virtualBookRepository).findByBookId("2");
    }

    @Test
    @Disabled
    @DisplayName("Тест 4 (Negative)")
    void checkDifferenceBooksIdNegative4() {
        VirtualBookRepository virtualBookRepository = mock(VirtualBookRepository.class);
        BookService bookService = new BookService(virtualBookRepository);

        // создаем виртуальное хранилище книг
        final Map<String, Book> virtualBooks = new HashMap<>();
        virtualBooks.put("1", new Book("1", "Book1", "Author1"));
        virtualBooks.put("2", new Book("2", "Book2", "Author2"));

        // проверяем работу метода.

        bookService.findBookByIdVirtual("1");
        bookService.findBookByIdVirtual("2");

        // проверка порядка выполнения findBookByIdVirtual - ожидаем негативный результат!

        InOrder inOrder = inOrder(virtualBookRepository);
        inOrder.verify(virtualBookRepository).findByBookId("2");
        inOrder.verify(virtualBookRepository).findByBookId("1");
    }


}
