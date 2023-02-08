public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");
        Author Tolstoy2 = new Author("Лев", "Толстой");

        System.out.println(Tolstoy.equals(Tolstoy2));



        Book prorok = new Book("Пророк", 1828, Pushkin);
        Book warANDPeace = new Book("Война и мир", 1873, Tolstoy);

        System.out.println(prorok);
        System.out.println(warANDPeace);

        prorok.setPublishingYear(1828);
        System.out.println(prorok);

        System.out.println(prorok.hashCode());
        System.out.println(warANDPeace.hashCode());





    }
}