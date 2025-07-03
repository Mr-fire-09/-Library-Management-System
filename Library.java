


import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("✅ Book added!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("❌ No books found.");
            return;
        }
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void issueBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("📕 Book issued!");
                } else {
                    System.out.println("❌ Book is already issued.");
                }
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("📗 Book returned!");
                } else {
                    System.out.println("❌ Book was not issued.");
                }
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) System.out.println("❌ No book found with that title.");
    }

    public void totalBooks() {
        System.out.println("📚 Total books in library: " + books.size());
    }
}
