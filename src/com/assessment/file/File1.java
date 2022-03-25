package com.assessment.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//create a file and write in it

public class File1 {  
	
	public static void main(String[] args)throws IOException{
		
		int i;
		
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CGAssignment 1\\Java Assignment\\src\\com\\assessment\\file\\AgnFile.txt");
		
		boolean val = false;
		
		try {
			val = file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(val) {
			System.out.println("File created successfully ");
		}
		else {
			System.out.println("File creation failed ");
		}
		
		// we need to transfer this string to file
		String st = "This is a string ";
		
		try {
			
			// create a fileoutputstream object
			OutputStream f = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\CGAssignment 1\\Java Assignment\\src\\com\\assessment\\file\\AgnFile.txt",true);
			
			char ch[] = st.toCharArray();
			for (i = 0; i < st.length(); i++) {
			
				// we will write the string by writing each
				// character one by one to file
				f.write(ch[i]);
			}
			System.out.println("The file has been updated. ");
			f.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}


