package multiplefiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile {
	public static void searchFileList()
	{
		File folder = new File("root");
		File [] listOfFiles = folder.listFiles();
		boolean fileExists = false;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to be searched ..");
		
		String name = scan.nextLine();
		

		for(File fil: listOfFiles)
		{
	
		if(name.equalsIgnoreCase(fil.getName()))
		{
			System.out.println("File found in: "+fil);
			 fileExists = true;
			
		}
		
		
	}
		if(!fileExists)
		{
			System.out.println("File not found");

		}

	}
	
}
