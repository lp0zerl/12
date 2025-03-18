import java.util.Objects;

class Author {
    private String firstName; // Имя автора
    private String lastName;  // Фамилия автора

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title + " by " + author.toString() + ", published in " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

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