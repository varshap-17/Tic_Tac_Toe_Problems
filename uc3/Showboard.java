    //uc3 As a Player would like to see the board so I can choose the valid cells to make my move during my turn
package workshop.examples;
public class Showboard {
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
}

