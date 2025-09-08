public class Program {
    public static void main(String[] args) {

        try {
            Book book1 = new Book("Robinson Crusoe", "Daniel Defoe", 56);
            printBook(book1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            GoldEditionBook goldEditionBook1 = new GoldEditionBook("Frankenstein", "Mary Shelley", 38.30);
            printBook(goldEditionBook1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            GoldEditionBook goldEditionBook2 = new GoldEditionBook("Alice’s Adventures in Wonderland", "Lewis", 21.88);
            printBook(goldEditionBook2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Book book2 = new Book("Dracula", "Bram Stoker", 15.99);
            printBook(book2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 0);
            printBook(book3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printBook(Book book) {
        String line = String.format("Title: %s - Author: %s - Price: %.2f",
                book.getTitle(), book.getAuthor(), book.getPrice());
        System.out.println(line.replace('.', ','));
    }
}