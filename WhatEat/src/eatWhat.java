import java.util.Scanner;

public class eatWhat {

	public static void main(String[] args) {
		System.out.println("Hello, Lets figure out what to make for your party!");
		int partySize;
		String eventType;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("How many people are attending?");
		partySize = input.nextInt();
		input.nextLine(); // next int consumes the integer, leaving the \n. This is to allow us skip the
							// \n and get the next user input
		result = "The preparation suggestion is ";

		if (partySize >= 1 && partySize < 2) {
			result += "in the microwave";
		} else if (partySize >= 2 && partySize <= 12) {
			result += "in your kitchen";
		} else if (partySize >= 13) {
			result += "by a caterer";
		} else {
			System.out.println("That's an invalid party size");
			return;
		}

		result += " and the meal suggestion is ";
		System.out.println("Great! Is this going to be casual, semi-formal or formal?");
		eventType = input.nextLine();
		if (eventType.equals("casual")) {
			result += "sandwiches";
		} else if (eventType.equals("semi-formal")) {
			result += "fried chicken";
		} else if (eventType.equals("formal")) {
			result += "chicken parmesan";
		} else {
			System.out.println("That's an invalid event type. Please try again");
			return;
		}

		System.out.println(result + ".");
	}

}
