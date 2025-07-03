

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n📘===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Show Total Books");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(id, title, author);
                    break;
                case 2:
                    lib.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    lib.issueBook(issueId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 5:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    lib.searchByTitle(searchTitle);
                    break;
                case 6:
                    lib.totalBooks();
                    break;
                case 7:
                    System.out.println("👋 Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("❗ Invalid choice.");
            }
        }
    }
}
