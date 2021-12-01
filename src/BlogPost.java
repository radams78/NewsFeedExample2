import java.util.Date;

public class BlogPost implements NewsFeedItem {
    private String title;
    private Author author;
    private Date date;
    private String content;

    public BlogPost(String title, String authorName, String authorEmail, Date date, String content) {
        this.title = title;
        this.author = new Author(authorName, authorEmail);
        this.date = date;
        this.content = content;
    }

    public void printOut() {
        System.out.println(title);
        System.out.println();
        author.printOut();
        System.out.println(date);
        System.out.println("===================================================");
        System.out.println(content);
    }
}
