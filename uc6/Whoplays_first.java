
     //uc6 As a User would like to to do a toss to check who plays first.

package workshop.examples;

public class Whoplays_first {
	public static void main(String[] args) {
		char comp,user;
		double Check = Math.random()*10 % 2;
		if(Check==1) {
			user='P';
			System.out.println("The user chooses to play first");
		}
		else {
			comp='P';
			System.out.println("The computer chooses to play first");
		}
	}
}
