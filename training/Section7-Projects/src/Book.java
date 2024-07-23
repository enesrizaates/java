public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printBookDetails() {
//        System.out.println("Author: " + author);
//        System.out.println("Title: " + title);
//        System.out.println("Genre: " + genre);
//        System.out.println("Number of pages: " + numPages);
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("has " + numPages +
                " pages, and its genre is " + genre);
        System.out.println();
    }
}
