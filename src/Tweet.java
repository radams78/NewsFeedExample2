import java.util.Date;

public class Tweet {
    public String authorName;
    public String authorEmail;
    public Date date;
    public String url;
    public String content;

    public Tweet(String authorName, String authorEmail, Date date, String url, String content) {
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.date = date;
        this.url = url;
        this.content = content;
    }

    public void printOut() {
        System.out.println(content);
        System.out.printf("by %s, <%s>\n", authorName, authorEmail);
        System.out.println(date);
        System.out.println("===================================================");
        System.out.println("Click here: " + url);
    }

}
