package FinancialAccounts;
//code picks up a Google doc from downloads folder, checks if a previous version is present
//in the app directory, deletes it if so, and move the latest Google doc file to app folder.
import java.io.*;

public class MoveSourceFiles {
	
	public static void CheckSourceLocation(File sourceFile) {
		try {
			if (sourceFile.exists()) {	
				System.out.println("File exists in source location!");
			}			
			else {
				System.out.println("ERROR: Source file does not exist..");
				//stops execution if no source file.
				System.exit(0);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	public static void CheckTargetLocation(File targetFile) {
		try {
			if (targetFile.exists()) {
				System.out.println("ERROR: File exists in target location.. Deletion attempt..");
				if (targetFile.delete()) {
	    			System.out.println(targetFile.getName() + " has now been deleted!");
	    		}
				else {
					System.out.println("ERROR: File could not be deleted..");
					System.exit(0);
                                    }
                                }
			else {	
				System.out.println("File does not exist in target location!");
                            }
                    }
		catch (Exception e) {
			e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		
		File sourceFile = new File("C://Users/Jbearne/Downloads/CashFlow_GoogleSheets.xlsx");
		File targetFile = new File("C://Users/Jbearne/Documents/02personal/CashFlow_GoogleSheets.xlsx");
		
                CheckSourceLocation(sourceFile);
		CheckTargetLocation(targetFile);
		
		try {
			if (sourceFile.renameTo(new File("C://Users/Jbearne/Documents/02personal/" + sourceFile.getName()))) {
				System.out.println("File is moved successfully! Ready to ingest to Access DB.");
			}		
			else {
				System.out.println("ERROR: File wasn't moved due to unknown error..");
				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}