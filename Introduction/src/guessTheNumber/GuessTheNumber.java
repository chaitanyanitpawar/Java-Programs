package guessTheNumber;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		int secretNumber;
        secretNumber = (int) (Math.random() * 99 + 1);
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempt = 0;
        do {
              System.out.print("Enter a guess (1-100): ");
              guess = sc.nextInt();
              attempt++;
              if (guess == secretNumber)
                    System.out.println("Your guess is correct. Congratulations You guessed in "+attempt+" attempts.");
              else if (guess < secretNumber)
                    System.out.println("Your guess is smaller than the secret number.Please enter bigger number.");
              else if (guess > secretNumber)
                    System.out.println("Your guess is greater than the secret number.Please enter smaller number.");
        } while (guess != secretNumber);
	}
}
