public class Song {
    private String title;
    private String author;
    private StringBuilder text;

    public Song() {
    }

    public Song(String title, String author, StringBuilder text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "-----Song-----" +
                "\ntitle: " + title +
                "\nauthor: " + author +
                "\ntext: " + text;
    }
}
