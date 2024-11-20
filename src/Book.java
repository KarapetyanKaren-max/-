import java.util.Objects;

public class Book {

    private String booktitle;
    private Author nameAuthor;
    private int publicationYeae;

    public Book(String booktitle, Author nameOfAuthor, int publicationYeae) {
        this.booktitle = booktitle;
        this.nameAuthor = nameOfAuthor;
        this.publicationYeae = publicationYeae;
    }

    public String getBooktitle() {
        return this.booktitle;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getPublicationYeae() {
        return this.publicationYeae;
    }

    public void setPublicationYeae(int publicationYeae) {
        this.publicationYeae = publicationYeae;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYeae == book.publicationYeae && Objects.equals(booktitle, book.booktitle) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booktitle, nameAuthor, publicationYeae);
    }
}
