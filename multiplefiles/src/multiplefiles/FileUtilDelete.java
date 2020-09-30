package multiplefiles;

//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilDelete {
	
public static void deleteFile()
{

	String fname, str;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter file name to be deleted: ");
	fname = scan.nextLine();
	
	boolean Success = (new File("root" + "//" +fname).delete());
	if(Success) {
		System.out.println("The File "+fname+" Has Been Deleted");
	}
	else {
		System.out.println("File Not found");
	}
	
	


}
}



