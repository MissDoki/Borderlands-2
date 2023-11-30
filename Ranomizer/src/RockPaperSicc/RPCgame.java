package RockPaperSicc;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPCgame {
public static void main (String []arg) {
	Random R = new Random ();
		
	int userinput = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (userinput < 1 || userinput > 3) {
    System.out.println("Please enter a number between 1-3:");
    String input = "";
    try {
         input = reader.readLine();
    } catch (IOException e) {}

    try {
        int number = 0;
        number = Integer.valueOf(input);
    userinput = number;
    } catch (NumberFormatException e) {}
    }
	
	int int_random = 1+ R.nextInt(3);
	
	int Rock = 1;
	int Paper = 2;
	int Scissors = 3;
	
	String[] options = { "", "Rock", "Paper", "Scissors"};
	System.out.println("User picked " + options[userinput]);
	System.out.println("Computer picked " + options[int_random]);
	
	
	if (userinput == int_random) {
		System.out.println("Draw");
	}

	else if (int_random == Rock && userinput == Scissors) {
		System.out.println("Computer WINS");
	}
	else if (int_random == Paper && userinput == Rock) {
		System.out.println("Computer WINS");
	}
	else if (int_random == Scissors && userinput == Paper) {
		System.out.println("Computer WINS");
	}
	else System.out.println("User WINS");
	
}
}
