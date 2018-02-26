package lesson11;

public class MyProgram {
    public static void main(String[] args) {
        User user1 = new User("Иван", 1);
        User user2 = new User("Иван", 1);

        boolean result1 = user1 == user2;
        boolean result2 = user1.equals(user2);

        System.out.println(result2);
    }
}
