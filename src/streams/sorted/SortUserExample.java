package streams.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User{
    private String name;
    private int age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SortUserExample {

    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("Vlad", 29));
        users.add(new User("Nadiia", 23));
        users.add(new User("Oleh", 18));
        users.add(new User("Vlad", 35));
        users.add(new User("Nadiia", 10));


        List<User>sortedByAge=users.stream().sorted(Comparator.comparing(User::getAge)).toList();
        List<User>sortedByNameReversed=users.stream().sorted(Comparator.comparing(User::getName).reversed()).toList();
        System.out.println(sortedByAge);
        System.out.println(sortedByNameReversed);

        //NewWay
        Comparator<User> comparatorByNameAsc = Comparator.comparing(User::getName);
        List<User>sortedByNameAsc=users.stream().sorted(comparatorByNameAsc).toList();
        //OldWay
        Comparator<User>comparatorByNameDesc=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
        List<User>sortedByNameDesc=users.stream().sorted(comparatorByNameDesc).toList();


        List<User>compareByNameAscAndAgeDesc=users.stream().
                sorted(Comparator.comparing(User::getName).
                        thenComparing(Comparator.comparing(User::getAge).reversed())).toList();
    }
}
