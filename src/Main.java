import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        Author author3 = new Author("Лев", "Толстой");
        Book book3 = new Book("Война и мир", author3, 1869);

        System.out.println("book1 equals book3: " + book1.equals(book3)); // true
        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());

        book1.setPublicationYear(1873);
        System.out.println("Обновленная информация о книге 1: " + book1.toString());
    }
}