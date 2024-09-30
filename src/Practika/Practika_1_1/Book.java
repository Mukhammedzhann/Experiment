package Practika.Practika_1_1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getIsbn() {
        return isbn;
    }
    public int getCopies() {
        return copies;
    }

    public boolean borrowCopy() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    public void returnCopy() {
        copies++;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") - Copies: " + copies;
    }
}
