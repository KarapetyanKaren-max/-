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


    public String toString() {
        return "Book{" + "booktitle='" +booktitle + '\'' + ", nameOfAuthor=" + nameAuthor + ",publicationYeae =" + publicationYeae + '}';


    }
}
