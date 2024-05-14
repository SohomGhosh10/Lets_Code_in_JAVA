public class Java_project {
    public static void main(String[] args){
        Library lib = new Library();
        lib.add_book("Engineering Mathematics");
        lib.add_book("Java Oracle");
        lib.add_book("Database Management System");
        //lib.show_No_of_Books();
        lib.issue_book("Engineering Mathematics");
        //lib.show_No_of_Books();
        lib.show_Books();
        lib.return_Book("Python");
        lib.show_Books();
        lib.return_Book("Engineering Mathematics");
        lib.show_Books();
    }
}

class Books{
    public String Name;
    public String Author;
    public String issued_to;
    public String issued_on;
}

class Library{
    String[] books;
    int no_of_books;
    
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void add_book(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!!");
        System.out.println("Total number of books available " + no_of_books);
    }

    void show_No_of_Books(){
        if(no_of_books == 0){
            System.out.println("No books found!!");
            return;
        }
        System.out.println("List of books:");
        for(int i = 0; i < no_of_books; i++){
            System.out.println((i+1) + ". " + books[i]);
        }
    }

    void issue_book(String book){
        for(int i = 0; i < books.length; i++){
            if(books[i].equals(book)){
                System.out.println(books[i] + " book is issued!!");
                books[i] = null;
                return;
            }
            System.out.println("* "+ book);
        }
        System.out.println("Book not found!!");
    }

    void show_Books(){
        System.out.println("Available books are");
        for(String book : books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void return_Book(String book){
        add_book(book);

    }
    
}
