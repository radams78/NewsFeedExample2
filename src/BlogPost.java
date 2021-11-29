import java.util.Date;

public class BlogPost {
    private String title;
    private String authorName;
    private String authorEmail;
    private Date date;
    private String content;

    public BlogPost(String title, String authorName, String authorEmail, Date date, String content) {
        this.title = title;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.date = date;
        this.content = content;
    }

    public void printOut() {
        System.out.println(title);
        System.out.println();
        System.out.printf("by %s, <%s>\n", authorName, authorEmail);
        System.out.println(date);
        System.out.println("===================================================");
        System.out.println(content);
    }
}
