/* AIM:
Define a custom exception class BookNotAvailableException that extends Exception.
● Create a class Library with:
● An instance variable availableBooks (integer).
● A method issueBook(int count) that:
    o If count <= availableBooks, reduce the number of books and display "Book issued successfully".
    o Otherwise, throw BookNotAvailableException with the message "Requested books not available".
In the main() method:
● Initialize the library with 3 available books.
● Try issuing 2 books (valid).
● Then try issuing 2 more books (should throw the custom exception).
*/


class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    private int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
          
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}


public class PR22_CodingExercise {
    public static void main(String[] args) {
        // Initialize the library with 3 available books
        Library myLibrary = new Library(3);

        try {
          
            System.out.println("First Attempt: Issuing 2 books...");
            myLibrary.issueBook(2);

        
            System.out.println("Second Attempt: Issuing 2 books...");
            myLibrary.issueBook(2);

        } catch (BookNotAvailableException e) {
            // Display the exception message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
OUTPUT:
First Attempt: Issuing 2 books...
Book issued successfully
Second Attempt: Issuing 2 books...
Error: Requested books not available
*/