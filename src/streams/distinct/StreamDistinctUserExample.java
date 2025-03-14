package streams.distinct;

import java.util.Arrays;
import java.util.List;

class User{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof User user)) return false;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
public class StreamDistinctUserExample {
    public static void main(String[] args) {
        List<User>users= Arrays.asList(
                new User(1,"Vlad","Bulahov","vlad@gmail.com"),
                new User(2,"Vlados","Bulahovos","vlados@gmail.com"),
                new User(1,"Oal","Aova","ola@gmail.com")
        );
        users.stream().distinct().forEach(System.out::println);
    }
}
