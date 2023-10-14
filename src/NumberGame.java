import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean isCorrectGuess = false;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es_ left. Choose again");
            int guess = scanner.nextInt();
            if(guess > randomNumber) {
                System.out.println("Your guess number is greater then random number");
            } else if(guess < randomNumber) {
                System.out.println("Your guess number is smaller then random number");
            } else {
                isCorrectGuess = true;
                break;
            }
        }
        if(isCorrectGuess) {
            System.out.println("Correct ... You winn!!!");
        } else {
            System.out.println("You lost!!!");
        }
    }
}
