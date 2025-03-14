package streams.count;

import java.util.Arrays;
import java.util.List;

class User{
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class StreamCountFilterExample {
    public static void main(String[] args) {
        List<User>users= Arrays.asList(
                new User("vlad",29),
                new User("nadiia",23),
                new User("oleh",19)
        );

        long usersOlderThan20=users.stream().filter(u->u.getAge()>20).count();
        System.out.println(usersOlderThan20);
    }
}
