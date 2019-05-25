import java.util.Scanner;

public class Quiz2{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		char answer;
		String temp;
		System.out.println("Do you like to save people? Enter Y or N ");
		temp = scan.nextLine();
		answer = temp.charAt(0);
		if (answer == 'Y' || answer == 'y'){
			System.out.println("Do you always take the blame? Enter Y or N");
			temp = scan.nextLine();
			answer = temp.charAt(0);
			if(answer == 'Y' || answer == 'y'){
				System.out.println("Would you do anything for your family? Enter Y or N");
				temp = scan.nextLine();
				answer = temp.charAt(0);
				if(answer == 'Y' || answer == 'y'){
					System.out.println("You are The Flash");

				} else {
					System.out.println("You are The Reverse Flash");

				}

			} else{
				System.out.println("Do you like to cause pain to others? Enter Y or N");
				temp = scan.nextLine();
				answer = temp.charAt(0);
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Do you break peoples trust? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				} else {
					System.out.println("Do you like spreading hope? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				}


			}

		} else {
			System.out.println("Do you put your needs before others? Enter Y or N");
			temp = scan.nextLine();
			answer = temp.charAt(0);
			if(answer == 'Y' || answer == 'y'){
				System.out.println("Do you want to become the best by cheating? Enter Y or N");
				temp = scan.nextLine();
				answer = temp.charAt(0);
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Do you have a pet? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				} else {
					System.out.println("Are you good at solving crime? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				}

			} else {
				System.out.println("Do you are to make up for your mistakes? Enter Y or N");
				temp = scan.nextLine();
				answer = temp.charAt(0);
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Did you ever hurt anyone on purpose? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				} else {
					System.out.println("Did you parents die a tragic death? Enter Y or N");
					temp = scan.nextLine();
					answer = temp.charAt(0);

				}

			}

		}
	}
}
