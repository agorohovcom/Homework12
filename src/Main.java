public class Main {
    public static void main(String[] args) {
        Author gerbertShildt = new Author("Герберт", "Шилдт");
        Author bruceEkkel = new Author("Брюс", "Эккель");
        Book JavaABeginnersGuide = new Book("Java. Руководство для начинающих", gerbertShildt, 2023);
        Book javaPhilosophy = new Book("Философия Java", bruceEkkel, 1998);
        javaPhilosophy.setPublicationYear(2024);
    }
}