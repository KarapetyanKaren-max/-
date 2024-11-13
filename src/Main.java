public class Main {
    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Александр", "Пушкин");
        System.out.println(alexanderPushkin.getName());
        System.out.println(alexanderPushkin.getSurname());

        Author nikolaiGogol = new Author("Николай", "Гоголь");
        System.out.println(nikolaiGogol.getName());
        System.out.println(nikolaiGogol.getSurname());

        Book caucasianprisoner = new Book("Кавказский пленник", alexanderPushkin, 1820);
        System.out.println(caucasianprisoner.getBooktitle());
        System.out.println(caucasianprisoner.getNameAuthor());
        System.out.println(caucasianprisoner.getPublicationYeae());

        caucasianprisoner.setPublicationYeae(1828);
        System.out.println(caucasianprisoner.getPublicationYeae());

        Book auditor = new Book("Ревизор", nikolaiGogol, 1836);
        System.out.println(auditor.getBooktitle());
        System.out.println(auditor.getNameAuthor());
        System.out.println(auditor.getPublicationYeae());
    }
}