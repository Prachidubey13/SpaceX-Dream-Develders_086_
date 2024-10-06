//Question 1: Library Class with Book Collection
//Task: Design a class Library that contains a collection of books. Each book should have properties like title, author, and ISBN. Implement methods to add a book, remove a book, and display all books in the library.
//Requirements:
//Create a class Book with properties for title, author, and ISBN.
//Create a class Library that maintains a collection of Book objects.
//Implement the following methods in the Library class:
//addBook(Book book): Adds a book to the library.
//removeBook(String isbn): Removes a book from the library using its ISBN.
//displayBooks(): Displays all books in the library.
//Write a program that demonstrates the functionality of the Library class.
//Sample Output:
//
//Books in the library:
//Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 9780743273565
//Title: 1984, Author: George Orwell, ISBN: 9780451524935
//
//Removing book with ISBN: 9780451524935
//Book removed successfully.
//
//Books in the library:
//Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 9780743273565




// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Step 1: Create Book class with properties and constructor
// The Book class contains title, author, and ISBN as properties for each book
class Book {
    String title;
    String author;
    String isbn;

    // Constructor to initialize a new book's details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

// Step 2: Create Library class to manage a collection of books
// The Library class handles adding, removing, and displaying books using ArrayList
class Library {
    // ArrayList to store the collection of Book objects
    ArrayList<Book> books = new ArrayList<>();

    // Method to add a book to the library
    // It takes a Book object as a parameter and adds it to the books list
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.title);
    }

    // Method to remove a book by its ISBN
    // Iterates through the list, finds the book by ISBN, and removes it
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed successfully: " + book.title);
                return;
            }
        }
        System.out.println("Book with ISBN: " + isbn + " not found.");
    }

    // Method to display all books in the library
    // Loops through the ArrayList and prints out each book's details
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
        }
    }
}

// Step 3: Demonstrate the functionality of the Library class
// The main class demonstrates adding, removing, and displaying books
public class LibraryDemo {
    public static void main(String[] args) {
        // Create library object to manage books
        Library library = new Library();

        // Add books to the library with sample details
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        library.addBook(book1);
        library.addBook(book2);

        // Display books currently in the library
        library.displayBooks();

        // Remove a book by its ISBN and display the updated list
        System.out.println("\nRemoving book with ISBN: 9780451524935");
        library.removeBook("9780451524935");

        // Display books after removal to show the updated collection
        library.displayBooks();
    }
}
