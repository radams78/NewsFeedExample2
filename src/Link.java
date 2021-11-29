import java.util.Date;

public class Link {
    private String title;
    private Date date;
    private String url;

    public Link(String title, Date date, String url) {
        this.title = title;
        this.date = date;
        this.url = url;
    }

    public void printOut() {
        System.out.println(title);
        System.out.println(date);
        System.out.println("============================================");
        System.out.println("Click here: " + url);
    }
}
