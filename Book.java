class Book {
    String title;
    String author;
    boolean isAvailable;


public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
}

public void show() {
    System.out.println(title + " by " + author + (isAvailable ? " (Available)" : " (Not Available)"));
}
}