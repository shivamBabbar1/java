
  import java.util.ArrayList;

public  class Books {
    private  String title, author, ISBN;
    private static ArrayList<Books> booksCollection = new ArrayList<Books>();
    
    public  Books(String title, String author, String ISBN) {

        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void getTitle() {
        System.out.println(title);
    }

    void getAuthor() {
        System.out.println(author);
    }

    void getISBN() {
        System.out.println(ISBN);
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public void SetISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void add_book(Books book) {

        booksCollection.add(book);
    }

    public static void remove_book(Books book) {

        booksCollection.remove(book);
    }

    public static void getBook(){

         for(Books book : booksCollection){
             System.out.println(" Title : "+book.title+", Author : "+book.author+", ISBN : "+book.ISBN);
         }
    }
public static void main(String[] args){
        Books  book1 = new Books("programing","manish","vishal");
        Books  book2 = new Books("English","Gitika","Sohil");
         
        Books.add_book(book1);
        Books.add_book(book2);
        Books.getBook();
        book1.SetAuthor("goku");

        Books.remove_book(book2);
        Books.getBook();
           
    }
}

