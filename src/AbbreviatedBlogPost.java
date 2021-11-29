import java.util.Date;

public class AbbreviatedBlogPost {
    private String title;
    private String authorName;
    private String authorEmail;
    private Date date;
    private String teaser;
    private String url;

    public AbbreviatedBlogPost(String title, String authorName, String authorEmail, Date date, String teaser, String url) {
        this.title = title;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.date = date;
        this.teaser = teaser;
        this.url = url;
    }

    public void printOut() {
        System.out.println(title);
        System.out.println();
        System.out.printf("by %s, <%s>\n", authorName, authorEmail);
        System.out.println(date);
        System.out.println(teaser);
        System.out.println("===================================================");
        System.out.println("Click here for more: " + url);
    }
}
