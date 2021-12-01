public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printOut() {
        System.out.printf("by %s ---- email: <%s>\n", name, email);
    }
}
