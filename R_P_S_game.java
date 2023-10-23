import java.util.Scanner;
import java.util.Random;

public class R_P_S_game {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for paper and 2 for scissor");
		int userin = sc.nextInt();
		Random rn = new Random();
		int computerin = rn.nextInt(3);

		// YOUR CHOICE :

		if (userin == 0) {
			System.out.println("Your choice : Rock");
		} else if (userin == 1) {
			System.out.println("Your choice : Paper");
		} else if (userin == 2) {
			System.out.println("Your choice : Scissor");
		}

		// COMPUTER CHOICE :

		if (computerin == 0) {
			System.out.println("Computer choice : Rock");
		} else if (computerin == 1) {
			System.out.println("Computer choice : Paper");
		} else if (computerin == 2) {
			System.out.println("Computer choice : Scissor");
		}

		// MAIN CODE:

		if (userin == computerin) {
			System.out.println("Draw");
		} else if (userin == 0 && computerin == 1 || userin == 1 && computerin == 2 || userin == 2 && computerin == 0) {
			System.out.println("You lose");
		} else if (userin == 0 && computerin == 2 || userin == 1 && computerin == 0 || userin == 2 && computerin == 1) {
			System.out.println("You win!!");
		} else {
			System.out.println("Wrong input");
		}

	}
}