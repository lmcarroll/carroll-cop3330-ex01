import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
