package Practika.Practika_1_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Добавить книгу");
            System.out.println("2 - Удалить книгу");
            System.out.println("3 - Зарегистрировать читателя");
            System.out.println("4 - Удалить читателя");
            System.out.println("5 - Выдать книгу читателю");
            System.out.println("6 - Вернуть книгу");
            System.out.println("7 - Показать все книги");
            System.out.println("8 - Показать всех читателей");
            System.out.println("0 - Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Завершение программы...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите автора:");
                    String author = scanner.nextLine();
                    System.out.println("Введите ISBN:");
                    String isbn = scanner.nextLine();
                    System.out.println("Введите количество экземпляров:");
                    int copies = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, copies));
                    break;

                case 2:
                    System.out.println("Введите ISBN книги для удаления:");
                    isbn = scanner.nextLine();
                    if (!library.removeBook(isbn)) {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case 3:
                    System.out.println("Введите имя читателя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите идентификатор читателя:");
                    String readerId = scanner.nextLine();
                    library.registerReader(new Reader(name, readerId));
                    break;

                case 4:
                    System.out.println("Введите идентификатор читателя для удаления:");
                    readerId = scanner.nextLine();
                    if (!library.unregisterReader(readerId)) {
                        System.out.println("Читатель не найден.");
                    }
                    break;

                case 5:
                    System.out.println("Введите ISBN книги для выдачи:");
                    isbn = scanner.nextLine();
                    System.out.println("Введите идентификатор читателя:");
                    readerId = scanner.nextLine();
                    library.borrowBook(isbn, readerId);
                    break;

                case 6:
                    System.out.println("Введите ISBN книги для возврата:");
                    isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;

                case 7:
                    library.listBooks();
                    break;

                case 8:
                    library.listReaders();
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
        scanner.close();
    }
}
