public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getName() {
        return nameAuthor;
    }

    public String getSurname() {
        return surnameAuthor;
    }

    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }
}