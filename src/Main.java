public class Main {
    public static void main(String[] args) {
        Author author = new Author("Joanne", "Rowling");
        Author author1 = new Author("John", "Tolkien");

        Book book = new Book ( "Harry Potter and the Goblet of Fire.", 2000, author );
        Book book1 = new Book("The Lord of the Rings.", 1954 , author1);

        book1.setYear(1997);
        System.out.println();

        System.out.println("Книга 1: " + book.getTitle() + " Автор " + book.getAuthor().getFirstName() + "" + book.getAuthor().getLastName() +
                "." + "Год издания " + book.getYear());
        System.out.println();

        System.out.println("Книга 2: " + book1.getTitle() + " Автор " + book1.getAuthor().getFirstName() + "" + book1.getAuthor().getLastName() +
                "." + "Год издания " + book1.getYear());
        System.out.println();






    }
}