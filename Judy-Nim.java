package assignment2;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("sticks you want to start: ");
		int initialSticks = in.nextInt();
		int i = 0; //count times
		
		
		while (initialSticks > 0) {
			//human move 0,2,4
			if (i%2 ==0) {
				//enter number to move
				System.out.print("How many sticks you want to move: ");
				double humanMove = in.nextDouble();
				
				//if it's double
				boolean ifDouble = humanMove == (int) humanMove;
				if (!ifDouble) {
					System.out.println("Please enter an integer, you can only enter 1 or 2!");
				} else if (humanMove > 2) {//over than 2 or less than 1
					System.out.println("You moved too many, you can only choose to move 1 or 2 sticks!");
					//System.out.print("How many sticks you want to move: ");
					//int humanMove1 = in.nextInt();
				} else if (humanMove <= 0) {
					System.out.println("You should move atleast 1, you can only choose to move 1 or 2 sticks!");
					//System.out.print("How many sticks you want to move: ");
					//int humanMove1 = in.nextInt();
				} else {//normal move
					initialSticks = (int) (initialSticks - humanMove);
					
					System.out.println("Round " + i + ": start human takes " + (int) humanMove + ", so " + initialSticks + " remain");
					
					if (initialSticks == 0) {
						System.out.println("The human wins / computer lose!");
					}
					i++;
				}
			}
			//computer move
			if (i%2 != 0 && initialSticks != 0) {
				int computerMove;
				//normal move
				if (initialSticks > 1) {
					computerMove = (int) (Math.random() * 2 + 1);
					initialSticks = initialSticks - computerMove;
					System.out.println("Round " + i + ": start computer takes " + computerMove + ", so " + initialSticks + " remain");
				} else if (initialSticks == 1) {//final move, only have 1 stick
					computerMove = 1;
					initialSticks = initialSticks - computerMove;
					System.out.println("Round " + i + ": start computer takes " + computerMove + ", so " + initialSticks + " remain");
					
				}
				//end game
				if (initialSticks == 0) {
					System.out.println("The computer wins / you lose!");
				}
				i++;
			}
			//i++;
		}

	}

}
