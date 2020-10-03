package lockedme;

import java.io.File;
import java.util.Arrays;

//Code to list files in ascending order

public class ListFiles {
	public static void listFilesAsc() {
	File folder = new File("root");
	File [] listOfFiles = folder.listFiles();
	Arrays.sort(listOfFiles);
	{
	for(int i=0; i<listOfFiles.length;i++)
	{
		if(listOfFiles[i].isFile())
		{
			System.out.println("File "+listOfFiles[i].getName());
		}
		else
		{
			System.out.println("file not found!");
		}
	}
	
}
}
}