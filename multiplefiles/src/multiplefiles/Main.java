package multiplefiles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
int ch = 0;
//		int r1=2,c1=3;
//		int r2=3,c2=2;
//		int firstMatrix[][]= {{3,-2,5},{3,0,4}};
//		int secondMatrix[][]= {{2,3},{-9,0},{0,4}};
		//BusinessLogic bl=new BusinessLogicImpl();
		System.out.println("Welcome to Company Lockers example");
		do {
			System.out.println("LockedMe.com Menu");
			System.out.println("------------");
			System.out.println("1)Return Files");
			System.out.println("2)Add File");
			System.out.println("3)Delete File");
			System.out.println("4)Search File");
			System.out.println("5)Return to Main Menu");
			
			System.out.println("Please enter your appropriate choice(1-5)");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:
				ListFiles lf = new ListFiles();
				lf.listFilesAsc();
				System.out.println("This option lists all the files in root directory.....");
				break;
			case 2:
				FileUtil f = new FileUtil();
				f.addFile();
				System.out.println("This option add files in root directory.....");
                break;
			case 3:
				FileUtilDelete fd = new FileUtilDelete();
				fd.deleteFile();
				System.out.println("This option delete files in root directory.....");
		        break;
			case 4:
				SearchFile sf = new SearchFile();
				sf.searchFileList();
				System.out.println("This option search files in root directory......");
				break;
			case 5:
				System.out.println("Return to Main Menu");
				break;
				
			default:System.out.println("Invalid Choice... Choice should and must be between 1-5 only");
				break;
			}
		} while (ch != 5);

	}
	
//	public static void printResultMatrice(int[][]results) {
//		for(int[]row :results) {
//			for(int column:row) {
//				System.out.print(column+" ");
//			}
//			System.out.println();
//		}
//	}

}
