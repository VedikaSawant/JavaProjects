package TextEditor;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NotePad notepad = new NotePad(100);

        do {
            System.out.println("\nWELCOME TO WORDWEAVER!!!");
            System.out.println("0. Exit");
            System.out.println("1. Display text");
            System.out.println("2. Display text from given lines");
            System.out.println("3. Insert text");
            System.out.println("4. Delete text");
            System.out.println("5. Delete from given lines");
            System.out.println("6. Copy");
            System.out.println("7. Paste");
            System.out.println("8. Undo action");
            System.out.println("9. Redo action");
            System.out.println("Enter your choice:");
            
            int choice = sc.nextInt();
            int lineNumber, startLine, endLine;
            
            switch(choice) {
	            case 0: {
	            	System.out.println("Thank You!!!");
	                System.exit(0);
	                break; 
	            }
	            case 1: {
	                    notepad.display();
	                    break;
	            }
	            case 2: { 
                    System.out.println("Enter the starting line and ending line value: ");
                    startLine = sc.nextInt();
                    endLine = sc.nextInt();
                    notepad.display(startLine, endLine); 
                    break;
	            }
	            case 3:	{
                    System.out.println("Enter text: ");
                    String text = sc.next();
                    System.out.println("Enter the line number: ");
                    lineNumber = sc.nextInt();
                    notepad.insertLine(lineNumber, text);
                    break;
	            }
	            case 4:	{ 
                    System.out.println("Enter the line number: ");
                    lineNumber = sc.nextInt();
                    notepad.delete(lineNumber);
                    break;
	            }
	            case 5: {
                    System.out.println("Enter the starting line and ending line value: ");
                    startLine = sc.nextInt();
                    endLine = sc.nextInt();
                    notepad.delete(startLine, endLine);
                    break;
	            }
	            case 6:	{
                    System.out.println("Enter the starting line and ending line value: ");
                    startLine = sc.nextInt();
                    endLine = sc.nextInt();
                    notepad.copy(startLine, endLine);
                    break;
	            }
	            case 7:	{
                    System.out.println("Enter the line number: ");
                    lineNumber = sc.nextInt();
                    notepad.paste(lineNumber);
                    break;
	            }
	            case 8:	{
                    notepad.undo();
                    break;
	            }
	            case 9:	{
                    notepad.redo();
                    break;
	            }
	            default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}