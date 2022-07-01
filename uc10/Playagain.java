    //uc13 Ability for the user to continue playing another Tic Tac Toe Game.

package workshop.examples;

public class Playagain extends TTT{
	public static void main(String[] args) {
		char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
	    printBoard(gameBoard);
	    boolean gameOver = false;
	    boolean playAgain = true;

	  while(playAgain) {
	      while (!gameOver) {
	          System.out.println("Welcome to Tic Tac Toe!!");
	          playerMove(gameBoard);
	          gameOver = isGameOver(gameBoard);
	          if (gameOver) {
	              break;
	          }

	          computerMove(gameBoard);
	          gameOver = isGameOver(gameBoard);
	          if (gameOver) {
	              break;
	          }
	      }
	      System.out.println("Player Score: " +playerScore);
	      System.out.println("Computer Score: "+ computerScore);
	      System.out.println("Would you like to play again? Y/N");
	      input.nextLine();
	      String result = input.nextLine();

	      switch (result){
	          case "Y":
	          case "y":
	              playAgain = true;
	              System.out.println("Dope! Let's play again");
	              resetBoard(gameBoard);
	              gameOver = false;
	              printBoard(gameBoard);
	              break;

	          case "N":
	          case "n":
	              playAgain = false;
	              System.out.println("Thanks for playing");
	              break;
	          default:
	              break;
	      }
			}
	}
}	
	

