package lockedme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		

		System.out.println("Welcome to Company Lockers Project");
		System.out.println("--------------------------------");
		System.out.println("Developed by Sravanthi Nedunoori");
		System.out.println("                                 ");
		
		do{
			System.out.println("Options displayed on LockedMe.com Menu");
			System.out.println("---------------------------------");
			System.out.println("1)List Files in Ascending order");
			System.out.println("2)Add File, Delete File and Search File");
			System.out.println("3)Exiting Application");
			System.out.println("Please enter your appropriate choice(1-3)");
			
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			
			//Code to perform file operations
			
			switch (ch) {
			case 1:
				System.out.println("This option lists all the files in root directory.....");
				System.out.println("                        ");
				ListFiles lf = new ListFiles();
				lf.listFilesAsc();
			 break;
			case 2:
				System.out.println("Select from the following File Operations:");
				System.out.println("                         ");
				SubMain sm = new SubMain();
				sm.fileOperations();
				break;
				
				//Code to exit the application
				
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
	





	

	
	



