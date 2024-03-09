package FFEProjects;
import java.util.*;

public class Player {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String addr;
	private String phno;
	private String emailId;
	private int age;
	private char symbol;
	
	public void setPlayerDetails(String name,String addr,String phno,String emailId,int age,char symbol) {
		this.name=name;
		this.addr=addr;
		this.phno=phno;
		this.emailId=emailId;
		this.age=age;
		this.symbol=symbol;
	}
	
	public void setPlayerNameAndSymbol(String name, char symbol) {
		this.name=name;
		this.symbol=symbol;
	}
	
	public String getPlayerName() {
		return this.name;
	}
	public void changeSymbol(char symbol) {
		this.symbol=symbol;
	}
	public char getPlayerSymbol() {
		return this.symbol;
	}
	public void getPlayerNameAndSymbol() {
		System.out.println("\nPlayer name : "+this.name);
		System.out.println("Player symbol(X or O) : "+this.symbol+"\n");
	}
	public void getPlayerDetails() {
		System.out.println("Player name : "+this.name);
		System.out.println("Player age : "+this.age);
		System.out.println("Player phone number : "+this.phno);
		System.out.println("Player email id : "+this.emailId);
		System.out.println("Player address : "+this.addr);
		System.out.println("Player symbol(X or O) : "+this.symbol);
	}
}
