package SnakeAndLadder;
import java.util.*;

public class App {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladders!");
        
        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinates(9,5), new Coordinates(6,6)));
        map.put("97", new Jumper(new Coordinates(0,1), new Coordinates(9,9)));
        map.put("21", new Jumper(new Coordinates(7,0), new Coordinates(0,9)));
        map.put("64", new Jumper(new Coordinates(3,3), new Coordinates(7,4)));
        
        System.out.print("\nPlayer 1 ");
        Player p1 = new Player();
        p1.inputPlayerDetails(p1);
        
        System.out.print("\nPlayer 2 ");
        Player p2 = new Player();
        p2.inputPlayerDetails(p2);
        
        System.out.println("\nPlayer 1 name : "+p1.getPlayerName());
        System.out.println("Player 2 name : "+p2.getPlayerName());
        
        Board b = new Board(10, map);
        b.displayBoard();

        Game game = new Game(b, new Player[] {p1,p2}, new Dice());
        game.play();
	}

}
