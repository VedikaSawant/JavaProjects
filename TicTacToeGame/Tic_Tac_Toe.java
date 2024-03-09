package FFEProjects;
import java.util.*;

public class Tic_Tac_Toe {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to TIC-TAC-TOE");
        
        System.out.println("Player 1 enter your name : ");
        String name1 = sc.nextLine();
        
        char symbol = '#';
        while (symbol != 'X' && symbol !='O') {
        	System.out.println("Enter your symbol(X or O only) : ");
            symbol = sc.next().charAt(0);
        }
        sc.nextLine();
        Player p1 = new Player();
        p1.setPlayerNameAndSymbol(name1,symbol);
        p1.getPlayerNameAndSymbol();
        
        Player p2 = new Player();
        System.out.println("Player 2 enter your name : ");
        String name2 = sc.nextLine();
        char symbol2 = (symbol=='X')? 'O' : 'X';
        p2.setPlayerNameAndSymbol(name2,symbol2);
        p2.getPlayerNameAndSymbol();
        
    	char ans = 'y';
    	while(ans=='y') {
            Board b = new Board();    
            
            Game game = new Game(new Player[] {p1,p2}, b);
            game.play();
    		
    		System.out.println("Play Again(y/n) : ");
    		ans = sc.next().charAt(0);
    		// first turn is changed
    		Player p = p1;
    		p1 = p2;
    		p2 = p;
    	}
    	System.out.println("Thank You!");
    }
}
