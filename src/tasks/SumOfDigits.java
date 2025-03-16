package tasks;

public class SumOfDigits {
    public static void main(String[] args) {
        int input = 12345;
        int sum = String.valueOf(input)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
