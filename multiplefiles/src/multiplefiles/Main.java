package multiplefiles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int ch1 = 0;
		boolean innerswitch = false;
		boolean outerswitch = false;

		System.out.println("Welcome to Company Lockers example");
		if(!outerswitch) {
		do{//outer switch
			System.out.println("LockedMe.com Menu");
			System.out.println("------------");
			System.out.println("1)List Files in ascending order");
			System.out.println("2)Add File, Delete File and Search File");
			System.out.println("3)Return to Main Menu");
			System.out.println("Please enter your appropriate choice(1-3)");
			
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			
			switch (ch) {
			case 1:
				System.out.println("This option lists all the files in root directory.....");
				ListFiles lf = new ListFiles();
				lf.listFilesAsc();
			 break;
			case 2:
				
				System.out.println("file Operations");
				ProjectMain pm = new ProjectMain();
				pm.fileOperations();
				break;
			case 3:
				System.out.println("Exiting the application");
				return;
			
			default:System.out.println("Invalid Choice... Choice should and must be between 1-3 only");
			break;
				
		} 
			
			
		}
		while (ch != 3);
		}
	}
	
}




	

	
	



