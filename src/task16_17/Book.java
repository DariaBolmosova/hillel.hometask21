package task16_17;

public class Book {
    public int maxPage;
    public Author author;
    public String title;

    public String getTitle() {
        return title;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String nameAuthor, int maxPage, String title) {
        this.author = new Author(nameAuthor);
        this.maxPage = maxPage;
        this.title = title;
    }
}
