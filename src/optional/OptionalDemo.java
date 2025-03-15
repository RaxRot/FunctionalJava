package optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email=null;
        //ofNullable
        Optional<String> emailOptional1=Optional.ofNullable(email);
        emailOptional1.ifPresent(System.out::println);
        if(emailOptional1.isPresent()){
            System.out.println(emailOptional1.get());
        }

        String result=Optional.ofNullable(email).orElse("default");
        System.out.println(result);

        String result2 = Optional.ofNullable(email)
                .orElseThrow(() -> new IllegalArgumentException("Email must not be null"));

    }
}
