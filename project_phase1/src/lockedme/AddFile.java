package lockedme;

import java.io.FileNotFoundException;

//Code to add file in the root folder
import java.io.FileOutputStream;  
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
FileOutputStream fos=new FileOutputStream("root"+"//"+name, true); 
System.out.println("           ");
System.out.println("file saved.");  
}  
catch(FileNotFoundException e)  
{  
e.getMessage(); 
System.out.println("Please enter file to be added");
}  
}  
}  
