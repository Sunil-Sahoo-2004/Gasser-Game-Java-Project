package MyProjectPackage;

import java.util.Scanner;

class Gusser {
	int Gussernum;
	
	@SuppressWarnings("resource")
	public int takeNumberGusser() {
		System.out.print("Gusser Guess a number : ");
		Scanner sc = new Scanner(System.in);
		Gussernum = sc.nextInt();
		return Gussernum;
	}	
}

class Player {
	int Playernum;
	
	@SuppressWarnings("resource")
	public int takeNumberPlayer(int playerno) {
		System.out.print("Player" + playerno + " " + "Guess a number : ");
		Scanner sc = new Scanner(System.in);
		Playernum = sc.nextInt();
		return Playernum;
	}
}

class Umpire {
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void CollectFromGusser() {
		Gusser gusser = new Gusser();
		numFromGusser = gusser.takeNumberGusser();
	}
	
	void CollectFromPlayer() {
		Player player1 = new Player();
		numFromPlayer1 = player1.takeNumberPlayer(1);
		
		Player player2 = new Player();
		numFromPlayer2 = player2.takeNumberPlayer(2);
		
		Player player3 = new Player();
		numFromPlayer3 = player3.takeNumberPlayer(3);	
	}
	
	void compare() {
		if (numFromPlayer1 == numFromGusser) {
			
			if (numFromPlayer2 == numFromGusser && numFromPlayer3 == numFromGusser) {
				System.out.println("All Players won the game......");
			} else if (numFromPlayer2 == numFromGusser) {
				System.out.println("Only Player1 and Player2 won the game......");
			} else if (numFromPlayer3 == numFromGusser) {
				System.out.println("Only Player1 and Player3 won the game......");
			} else {
				System.out.println("Only Player1 won the game......");
			}
			
		} else if (numFromPlayer2 == numFromGusser) {
			
			if (numFromPlayer3 == numFromGusser) {
				System.out.println("Only Player2 and Player3 won the game......");
			} else {
				System.out.println("Only Player2 won the game......");
			}
			
		} else if (numFromPlayer3 == numFromGusser) {
			System.out.println("Only Player3 won the game......");
		} else {
			System.out.println("No player won the game Better luck NextTime");
		}
	}
}

public class GasserGameProject {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String playAgain;
	        
	     do {
	    	 Umpire umpire = new Umpire();
	    	 umpire.CollectFromGusser();
	    	 umpire.CollectFromPlayer();
	    	 umpire.compare();
	            
	    	 System.out.print("Do you want to play again? (yes/no): ");
	         playAgain = sc.next();           	
	     } while (playAgain.equalsIgnoreCase("yes"));
	        
	     System.out.println("Thank you for playing!");   
	}

}