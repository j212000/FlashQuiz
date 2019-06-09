package test.jay;

import java.util.Scanner;

public class Quiz2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		char answer ='y';		
		System.out.println("Do you like to save people? Enter Y or N ");
		answer = getAnswer();
		if (answer == 'Y' || answer == 'y'){
			System.out.println("Do you always take the blame? Enter Y or N");
			answer = getAnswer();
			if(answer == 'Y' || answer == 'y'){
				System.out.println("Would you do anything for your family? Enter Y or N");
				answer = getAnswer();
				if(answer == 'Y' || answer == 'y'){
					System.out.println("You are The Flash");

				} else {
					System.out.println("You are The Reverse Flash");

				}

			} else{
				System.out.println("Do you like to cause pain to others? Enter Y or N");
				answer = getAnswer();
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Do you break peoples trust? Enter Y or N");
					answer = getAnswer();

				} else {
					System.out.println("Do you like spreading hope? Enter Y or N");
					answer = getAnswer();

				}


			}

		} else {
			System.out.println("Do you put your needs before others? Enter Y or N");
			answer = getAnswer();
			if(answer == 'Y' || answer == 'y'){
				System.out.println("Do you want to become the best by cheating? Enter Y or N");
				answer = getAnswer();
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Do you have a pet? Enter Y or N");
					answer = getAnswer();

				} else {
					System.out.println("Are you good at solving crime? Enter Y or N");
					answer = getAnswer();

				}

			} else {
				System.out.println("Do you are to make up for your mistakes? Enter Y or N");
				answer = getAnswer();
				if(answer == 'Y' || answer == 'y'){
					System.out.println("Did you ever hurt anyone on purpose? Enter Y or N");
					answer = getAnswer();

				} else {
					System.out.println("Did you parents die a tragic death? Enter Y or N");
					answer = getAnswer();

				}

			}

		}

	}


	public static char getAnswer(){
		char answer;
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter a valid char(Y,y,N,n)");
			
			answer = scan.next().charAt(0);

			if(answer == 'y' || answer == 'Y' || answer == 'n' || answer == 'N'){
				return answer;

			} else {
				System.out.println("Enter a valid Input. Try Again");
			}

		}

	}

}
