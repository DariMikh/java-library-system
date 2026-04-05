import java.util.ArrayList;

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added!");
    }

    public void showBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            book.show();
        }
    }

    public void borrrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("You borrowed: " + title);
                } else {
                    System.out.println("Sorry, " + title + " is not available.");
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    } 
    

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.isAvailable) {
                    book.isAvailable = true;
                    System.out.println("You returned: " + title);
                } else {
                    System.out.println(title + " was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}