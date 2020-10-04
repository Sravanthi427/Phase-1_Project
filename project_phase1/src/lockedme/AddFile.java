package lockedme;

import java.io.File;


//Code to add file in the root folder

import java.io.IOException;
import java.util.Scanner;  
public class  AddFile
{  
public static void addFile()
{  
try  
{  
Scanner sc=new Scanner(System.in);           
System.out.print("Please enter file to be added ");  
String name=sc.nextLine();              
File fos=new File("root"+"//"+name); 
boolean fvar = fos.createNewFile();
if(fvar) {
	System.out.println("File has been created successfully!");
}
else {
	System.out.println("File is already present");
}
}
catch(IOException e) {
	System.out.println("Exception occured");
	e.printStackTrace();
}
}
}

