import java.util.ArrayList;

public class Library {
    String name, author, id;
    static ArrayList<Library> libraryCollection = new ArrayList<Library>();

    Library(String name, String author, String id) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    static void addBook(Library book) {
        libraryCollection.add(book);
    }

    static void removeBook(Library book) {
        libraryCollection.remove(book);
    }

    public static void allBooks() {
        for (Library lb : libraryCollection) {
            System.out.println("book name : " + lb.name + ", author name : " + lb.author + ", book number : " + lb.id);

        }
    }

    public static void main(String[] args) {
        Library book1 = new Library("programming", "jhon", "q234");
        Library book2 = new Library("English", "linda", "p23");

        Library.addBook(book1);
        Library.addBook(book2);
        Library.allBooks();

        Library.removeBook(book2);

        Library.allBooks();
    }
}
