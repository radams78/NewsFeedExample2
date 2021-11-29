import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BlogPost bp = new BlogPost("My Opinions Are Objectively Correct",
                "Robin Adams",
                "robinad@chalmers.se",
                new Date(2021, 11, 28),
                "Today I realised that my opinion on any given subject is an objective fact.");
        Link l = new Link("Pictures of cats",
                new Date(2021, 11, 29),
                "https://cheezburger.com");
        Tweet t = new Tweet("Robin Adams",
                "robinad@chalmers.se",
                new Date(2021, 11, 29),
                "https://www.twitter.com/234253",
                "I am right about everything and you are wrong");
        AbbreviatedBlogPost bp2 = new AbbreviatedBlogPost(
                "No Wait I Am Wrong About A Few Things",
                "Robin Adams",
                "robinad@chalmers.se",
                new Date(2021,11,30),
                "Nvm. Turns out reindeer do exist. I always thought they were made up by the author of Rudolph the...",
                "https://www.blogger.com/oops.html");

        bp.printOut();
        System.out.println();
        l.printOut();
        System.out.println();
        t.printOut();
        System.out.println();
        bp2.printOut();
    }
}
