/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Mari Modebadze.)
 * @version (08/17/24)
 */
 public class Book 
 
 {
 
 
    // The fields.
    private String author;
    private String title;
    private int pages; // Number of pages
    private String refNumber; // Refrence number
    private int borrowed; // Number of times borrowed 
    private final boolean courseText; // If the book is a course text 

    /**
     * Set the author, title, pages and courseText fields when this object
     * is constructed.
     * @param bookAuthor The aauthor of the book.
     * @param bookTitle The title of the book.
     * @param bookPages The number of pages.
     * @param isCourseTect Wether a book is a course text.
     */

    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = ""; // refNumber to an empty string
        borrowed = 0; // Borrowed count is 0
        courseText = isCourseText; // Set course text field
    }

    /**
     * Accessor method to get the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor()
{

    return author;
}

/**
 * Accessor method to get the title of the book.
 * 
 * @return The title of the book.
 */
    public String getTitle()

{

        return title;
}
/**
 * Method to get number of pages.
 * 
 * @return The number of pages.
 */
public int getPages()

{
return pages;
}

/**
 * Method to get the refrence number.
 * 
 * @return The refrence number.
 */
public String getRefNumber()

{
return reNumber;
}

/**
 * Method to set the refrence number.
 * 
 * @param ref The refrence number to be set.
 */
public void setRefNumber(String ref)
{
if (ref.length() >=3)
{
this.refNumber = ref;
}
else 
    {
    System.out.println("Error: Refrence number must be atleast 3 characters long");
}

}

/**
 * Accessor method to get number of times the book has been borrowed.
 * 
 * @return The number of times te book has been borrowed.
 */
public int getBorrowed()

{
return borrowed;
}

/**
 * Method to increment number of times the book has been borrowed.
 */
public void borrow()

{
this.borrowed++;
}

/**
 * Method to check if the book is used as a course text.
 * 
 * @return True or False .
 */
public boolean isCourseText()

{
return courseText;
}

/**
 * Method to print details of the book: author, title, pages, refrence number, borrowed count and course text statues.
 */
public void printDetails()

{
String refToPrint = refNumber.isempty()? "ZZZ" : refNumber;
System.out.println("Title:" + title 
    +", Author: " + Author
    +", Pages: " + pages 
    +", Ref: " + refToPrint
    +", Borrowed: " + borrowed
    +", Course Text: " + (courseText ? "Yes" : "No"));
}
  
/**
 * Method to print the author of the book.
 */
public void printAuthor()

{
System.out.println("Author:" + author);
}

/**
 * Method to print the title of the book.
 */
public void printTitle()

{
System.out.println("Title:" + title);
}

/**
 * Main method to test the book class.
 * 
 * @param args command line arguments.
 */
public static void main(String[] args)

{
// Create instances of book.
Book book1 = new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 309, true);
Book book2= new Book("Ray Bradbury", "Fahrenheit 451", 156, true);

//Test accessor methods.
System.out.println("Testing the accessor methods:");
System.out.println("Book1 - Author: " + book1.getAuthor());
System.out.println("Book1 - Title: " + book1.getTitle());
System.out.println("Book1 - Pages: " + book1.getPages());
System.out.println("Book1 - Borrowed: " + book1.getBorrowed());
System.out.println("Book1 - Course Text: " + book1.isCourseText());
System.out.println("Book2 - Author: " + book2.getAuthor());
System.out.println("Book2 - Title: " + book2.getTitle());
System.out.println("Book2 - Pages: " + book2.getPages());
System.out.println("Book2 - Borrowed: " + book2.getBorrowed());
System.out.println("Book2 - Course Text: " + book2.isCourseText());

System.out.println("\nTesting mutators and print methods:");
book1.setRefNumber("12345");
book2.setRefNumber(""); //This should print an error message 

book1.borrow();
book1.borrow();
book2.borrow();

book1.printDetails();
book2.printDetails();

System.out.println("\nTesting printAuthor and printTitle methods:");
book1.printAuthor();
book1.printTitle();
book2.printAuthor();
book2.printTitle();
}

}


