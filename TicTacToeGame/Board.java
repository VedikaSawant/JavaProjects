package FFEProjects;
import java.util.*;

public class Board {
	int size;
	char matrix[][];
	public Board() {
		this.size = 3;
		matrix = new char[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				matrix[i][j] = '-';
			}
		}
	}
	public void displayBoardConfig() {
		int sz = this.size;
		for(int i=0; i<sz; i++) {
			for(int j=0; j<sz; j++) {
				System.out.print(this.matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
