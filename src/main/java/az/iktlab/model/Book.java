package az.iktlab.model;

public class Book {
    private Long id;
    private User user;
    private Flight flight;
    public String username;
    public String password;

    public Book(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
