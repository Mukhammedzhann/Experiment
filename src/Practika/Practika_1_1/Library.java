package Practika.Practika_1_1;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга создана: " + book);
    }

    public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Книга удалена: " + book);
                return true;
            }
        }
        return false;
    }


    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Читатель зарегистрирован: " + reader);
    }


    public boolean unregisterReader(String readerId) {
        for (Reader reader : readers) {
            if (reader.getReader().equals(readerId)) {
                readers.remove(reader);
                System.out.println("Читатель удалён: " + reader);
                return true;
            }
        }
        return false;
    }

    public boolean borrowBook(String isbn, String readerId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.borrowCopy()) {
                    System.out.println("Книга выдана читателю с ID: " + readerId);
                    return true;
                } else {
                    System.out.println("Книга недоступна.");
                    return false;
                }
            }
        }
        System.out.println("Книга с таким ISBN не найдена.");
        return false;
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnCopy();
                System.out.println("Книга возвращена: " + book);
                return;
            }
        }
        System.out.println("Книга с таким ISBN не найдена.");
    }

    public void listBooks() {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listReaders() {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }
}
