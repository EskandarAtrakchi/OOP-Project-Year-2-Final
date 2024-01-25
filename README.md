# OOP-YEAR-2-Final
# Explanation of the Java Code

## BooksGUI.java

This Java class, `BooksGUI`, represents a graphical user interface (GUI) for managing a catalog of books. It utilizes Swing for creating a simple desktop application. Let's break down the main components and functionalities.

### Member Variables

- `ArrayList<Book> bList`: An ArrayList to store instances of the `Book` class.

### Constructor

- `public BooksGUI()`: Initializes the GUI components and calls the `load()` method to load data when the program is launched.

### Methods

- `void load()`: Loads book data from a file named "book.dat" using ObjectInputStream. It catches IOException and ClassNotFoundException for error handling.

- `void exitBTNActionPerformed(ActionEvent evt)`: Displays a farewell message and exits the program.

- `void addBTNActionPerformed(ActionEvent evt)`: Adds a new book to the catalog. Validates that essential fields (author, title, and ISBN) are not empty.

- `void clearBTNActionPerformed(ActionEvent evt)`: Clears the display area and input fields.

- `void displayBTNActionPerformed(ActionEvent evt)`: Displays book details in the text area.

- `void typeTOGGLEActionPerformed(ActionEvent evt)`: Handles the toggle button for selecting the type of book (Book or eBook). Updates the GUI and adds the selected type to the catalog.

## Book.java

This class represents a basic book with attributes such as author, title, and ISBN. It implements the Serializable interface to support object serialization.

### Constructor

- `public Book(String author, String title, String isbn)`: Initializes the book with provided author, title, and ISBN.

### Methods

- `String getDetails()`: Returns a formatted string containing book details.

## Ebooks.java

This class extends the `Book` class and introduces an additional attribute `type` to differentiate between a physical book and an eBook.

### Constructor

- `public Ebooks(String type)`: Initializes the eBook with a given type.

### Methods

- `void setType(String type)`: Sets the type of the eBook.

## BooksApp.java

This class contains the `main` method and serves as the entry point for the application. It creates an instance of `BooksGUI` and sets it to visible.
