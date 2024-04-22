package SnakeAndLadder;
import java.util.*;

public class Player {
	private String name;
	private String addr;
	private String phno;
	private String emailId;
	private int age;
	
	public void setPlayerDetails(String name,String addr,String phno,String emailId,int age) {
		this.name=name;
		this.addr=addr;
		this.phno=phno;
		this.emailId=emailId;
		this.age=age;
	}
	
	public void setPlayerName(String name) {
		this.name=name;
	}
	
	public String getPlayerName() {
		return this.name;
	}
	public void getPlayerDetails() {
		System.out.println("\nPlayer name : "+this.name);
		System.out.println("Player age : "+this.age);
		System.out.println("Player phone number : "+this.phno);
		System.out.println("Player email id : "+this.emailId);
		System.out.println("Player address : "+this.addr+"\n");
	}
	
	public void inputPlayerDetails(Player p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Details ");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your phone number : ");
		String phno = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your email id : ");
		String emailid = sc.nextLine();
		System.out.println("Enter your address : ");
		String addr = sc.nextLine();
		p.setPlayerDetails(name, addr, phno, emailid, age);
	}
}
