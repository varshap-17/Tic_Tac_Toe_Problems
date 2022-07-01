     //uc12 As a Player would play till the game is over

package workshop.examples;

import java.util.Random;
import java.util.Scanner;

public class Game_over {
	 static int playerScore = 0;
	    static int computerScore = 0;
	    static Scanner input = new Scanner(System.in);
	    public static void main(String [] args){

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
	          input.nextLine();
	          String result = input.nextLine();

	          switch (result){
	              case "Y":
	              case "y":
	                  playAgain = true;
	                  System.out.println("Dope! Let's play again");
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


	    public static void printBoard(char [][] gameBoard){

	        for(char[] row : gameBoard){
	            for( char c : row){
	                System.out.print(c);
	            }
	            System.out.println();
	        }
	    }
	    public static void updateBoard( int position, int player, char [][] gameBoard){

            char character;

            if(player==1){
                character = 'X';
            }else{
                character = 'O';
            }

            switch (position){

                case 1:
                    gameBoard[0][0] = character;
                    printBoard(gameBoard);
                    break;
                case 2:
                    gameBoard[0][2] = character;
                    printBoard(gameBoard);
                    break;
                case 3:
                    gameBoard[0][4] = character;
                    printBoard(gameBoard);
                    break;
                case 4:
                    gameBoard[1][0] = character;
                    printBoard(gameBoard);
                    break;
                case 5:
                    gameBoard[1][2] = character;
                    printBoard(gameBoard);
                    break;
                case 6:
                    gameBoard[1][4] = character;
                    printBoard(gameBoard);
                    break;
                case 7:
                    gameBoard[2][0] = character;
                    printBoard(gameBoard);
                    break;
                case 8:
                    gameBoard[2][2] = character;
                    printBoard(gameBoard);
                    break;
                case 9:
                    gameBoard[2][4] = character;
                    printBoard(gameBoard);
                    break;
                default:
                    break;

            }

    }


	    public static void playerMove(char[][] gameBoard){

	        System.out.println("Please make a move. (1-9)");


	        int move = input.nextInt();

	        boolean result = isValidMove(move,gameBoard);

	        while(!result){
	            System.out.println("Sorry! Invalid Move. Try again");
	            move = input.nextInt();
	            result = isValidMove(move,gameBoard);
	        }

	        System.out.println("Player moved at position " + move);
	        updateBoard(move,1,gameBoard);


	    }
	    public static boolean isValidMove(int move, char[][] gameboard){

	        switch (move){
	            case 1:
	                if(gameboard[0][0] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 2:
	                if(gameboard[0][2] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 3:
	                if(gameboard[0][4] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }

	            case 4:
	                if(gameboard[1][0] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 5:
	                if(gameboard[1][2] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 6:
	                if(gameboard[1][4] == '_'){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 7:
	                if(gameboard[2][0] == ' '){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 8:
	                if(gameboard[2][2] == ' '){
	                    return true;
	                } else{
	                    return false;
	                }
	            case 9:
	                if(gameboard[2][4] == ' '){
	                    return true;
	                } else{
	                    return false;
	                }

	            default:
	                return false;
	        }

	    }

	    public static void computerMove(char [][] gameBoard){

	        Random rand = new Random();
	        int move = rand.nextInt(9)+1;

	        boolean result = isValidMove(move,gameBoard);

	        while(!result){
	            move = rand.nextInt(9)+1;
	            result = isValidMove(move, gameBoard);
	        }

	        System.out.println("Computer moved at position "+ move);
	        updateBoard(move,2,gameBoard);
	    }

	    public static boolean isGameOver(char [][] gameboard){

	        //Horizontal Win
	        if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ){
	            System.out.println("Player Wins");
	            playerScore++;
	            return true;
	        }
	        if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ){
	            System.out.println("Computer Wins");
	            computerScore++;
	            return true;
	        }
	        if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ){
	            System.out.println("Player Wins");
	            playerScore++;
	            return true;
	        }
	        if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ){
	            System.out.println("Computer Wins");
	            computerScore++;
	            return true;
	        }
	        if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ){
	            System.out.println("Player Wins");
	            playerScore++;
	            return true;
	        }
	        if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
	            System.out.println("Computer Wins");
	            computerScore++;
	            return true;
	        }

	        //Vertical Wins

	            if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
	                System.out.println("Player Wins");
	                playerScore++;
	                return true;
	            }
	            if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
	                System.out.println("Computer Wins");
	                computerScore++;
	                return true;
	            }

	            if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
	                System.out.println("Player Wins");
	                playerScore++;
	                return true;
	            }
	            if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
	                System.out.println("Computer Wins");
	                computerScore++;
	                return true;
	            }

	            if(gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ){
	                System.out.println("Player Wins");
	                playerScore++;
	                return true;
	            }
	            if(gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ){
	                System.out.println("Computer Wins");
	                computerScore++;
	                return true;
	            }

	            //Diagonal Wins
	            if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ){
	                System.out.println("Player Wins");
	                playerScore++;
	                return true;
	            }
	            if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ){
	                System.out.println("Computer Wins");
	                computerScore++;
	                return true;
	            }

	            if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ){
	                System.out.println("Player Wins");
	                playerScore++;
	                return true;
	            }
	            if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ){
	                System.out.println("Computer Wins");
	                computerScore++;
	                return true;
	            }

	            if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] !='_'&&
	                gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' ')
	            {
	                System.out.println("Its a tie");
	                return true;
	            }

	            return false;
	            }
}
