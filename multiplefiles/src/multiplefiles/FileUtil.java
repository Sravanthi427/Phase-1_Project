package multiplefiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;  
import java.util.Scanner;  
public class  FileUtil
{  
public static void addFile()
{  
try  
{  
Scanner sc=new Scanner(System.in);         //object of Scanner class  
System.out.print("Enter the file name: ");  
String name=sc.nextLine();              //variable name to store the file name  
FileOutputStream fos=new FileOutputStream("root"+"//"+name, true);  // true for append mode   
System.out.println("file saved.");  
}  
catch(FileNotFoundException e)  
{  
e.getMessage(); 
System.out.println("Please enter file to be added");
}  
}  
}  
