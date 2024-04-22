package SnakeAndLadder;
import java.util.*;

public class Board {
	int size;
	public String board[][];
    public HashMap<String,Jumper> jumpers;
	public Board(int size, HashMap<String,Jumper> jumpers) {
		this.size = size;
        this.jumpers = jumpers;
        board = new String [size][size];
        int count = 1;
        
        for(int row=size-1; row>=0; row--) {
        	if(row%2!=0) {
        		for(int col = 0;col<size;col++) {
                    board[row][col] = count+"";
                    count++;
                }
        	} else {
        		 for(int col = size-1;col>=0;col--) {
                     board[row][col] = count+"";
                     count++;
               }
        	}
        }
	}
	public void displayBoard() {
		int sz = this.size;
		for(int i=0; i<sz; i++) {
			for(int j=0; j<sz; j++) {
				System.out.print(this.board[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public int getBoardSize() {
        return this.size;
    }
}
