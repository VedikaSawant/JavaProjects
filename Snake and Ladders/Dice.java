package SnakeAndLadder;

public class Dice {
	// to get the random moves between 1 to 6 : 
	// random generates decimals between 0 to 1
	// so value of dice = random*(max-min) + min
	// max = 6 & min = 1
	// this will give double so typecast in int
	int max=6;
	int min=1;
	
	public int diceRoll() {
		double d = Math.random()*max + min;
		return (int)d;
	}

}
