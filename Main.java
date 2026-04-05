import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        

    while (true) {
        System.out.println("\n1. Add the Book");
        System.out.println("2. Show all the Books");
        System.out.println("3. Borrow the Book");
        System.out.println("4. Return the Book");
        System.out.println("5. Exit");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                library.addBook(title, author);
                break;
            case 2:
                library.showBooks();
                break;
            case 3:
                System.out.print("Enter book title to borrow: ");
                String borrowTitle = scanner.nextLine();
                library.borrrowBook(borrowTitle);
                break;
            case 4:
                System.out.print("Enter book title to return: ");
                String returnTitle = scanner.nextLine();
                library.returnBook(returnTitle);
                break;
            case 5:
                System.out.println("Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
 }
}
