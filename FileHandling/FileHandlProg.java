package LearningJava.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlProg {
	public static void main(String ar[]) {
		try {
			File fl = new File("C:\\Users\\sathe\\Downloads\\KGM\\Java\\FileHandling.txt");
			String flname = fl.getName();
			if(fl.createNewFile()) {
				System.out.println("File created : " + flname);
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		//file write
		try {
			FileWriter flwrite = new FileWriter("C:\\Users\\sathe\\Downloads\\KGM\\Java\\FileHandling.txt");
			flwrite.write("Cristianoo Siiuuuuuuuu");
			flwrite.close();
			System.out.println("Yess");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		// read
		
		//deleteFile
		File fl = new File("C:\\Users\\sathe\\Downloads\\KGM\\Java\\FileHandling.txt");
		if(fl.delete()) {
			System.out.println("Deleted file is " + fl.getName());
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}

	}

