package streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapCustomObjectExample {
    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        users.add(new User(1,"admin","admin","admin@gmail.com"));
        users.add(new User(2,"vlad","12345","vlad@gmail.com"));
        users.add(new User(3,"user","user","user@gmail.com"));

        List<String>emails=users.stream().map(user->user.getEmail()).toList();
        //System.out.println(emails);

        Function<User,String>userPasswords=user->user.getPassword();
        List<String>passwords=users.stream().map(userPasswords).toList();
        //System.out.println(passwords);

        List<UserDto>usersDtos=users.stream()
                .map(user->new UserDto(user.getId(),user.getUsername(),user.getEmail(),user.getPassword()))
                .toList();
        System.out.println(usersDtos);

        Function<User,UserDto>convertUserToDto=user->new UserDto(user.getId(),user.getUsername(),user.getEmail(),user.getPassword());
        List<UserDto>converted=users.stream().map(convertUserToDto).toList();
        System.out.println(converted);

    }
}
