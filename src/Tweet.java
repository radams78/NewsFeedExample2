import java.util.Date;

public class Tweet implements NewsFeedItem {
    private Author author;
    public Date date;
    public String url;
    public String content;

    public Tweet(String authorName, String authorEmail, Date date, String url, String content) {
        this.author = new Author(authorName, authorEmail);
        this.date = date;
        this.url = url;
        this.content = content;
    }

    public void printOut() {
        System.out.println(content);
        author.printOut();
        System.out.println(date);
        System.out.println("===================================================");
        System.out.println("Click here: " + url);
    }

}
