//Ability to check for the free space before making the desired move         

package workshop.examples;

import java.util.Scanner;

public class Check_freespace {
	public static void main(String[] args) {
		double Check=Math.random()*10 % 2;
		if(Check==1) {
			System.out.println("freespace is not available ");
		}else
			System.out.println("freespace is available so make a move");
	}
	public static void playerMove(char[][] gameBoard){
        System.out.println("Please make a move. (1-9)");
        Scanner input = new Scanner(System.in);
        
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
 	private static void updateBoard(int move, int i, char[][] gameBoard) {

	}

 	private static boolean isValidMove(int move, char[][] gameBoard) {
	
	return false;
 	}
}
