package multiplefiles;

//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProjectMain {
	
public static void fileOperations()
{
	int ch1 = 0;
	Scanner sc = new Scanner(System.in);

	
	do{//inner switch
		
		System.out.println("1)Add File");
		System.out.println("2)Delete File");
		System.out.println("3)Search File");
		System.out.println("4)Return to Main Menu");
		System.out.println("Please enter your appropriate choice(1-4)");
		ch1 = sc.nextInt();
		
	switch(ch1) {
	case 1 :
		System.out.println("This option add files in root directory.....");
		FileUtil f = new FileUtil();
		f.addFile();
		break;
	case 2: System.out.println("This option delete files in root directory.....");
		FileUtilDelete fd = new FileUtilDelete();
		fd.deleteFile();
		break;
	case 3:
		System.out.println("This option search files in root directory......");
		SearchFile sf = new SearchFile();
		sf.searchFileList();
		break;
	case 4: 
		System.out.println("Return to main menu");
		return;
	default:
		System.out.println("Entered invalid choice");
	
}

	}while(ch1!=4);
}
}

