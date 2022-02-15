package com.example.bank;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class updateFile {

	public void fileUpdate(String filepath) {
		//BufferReader reader = new BufferedReader(filepath);
		 FileReader fr;
		try {
			/*
			 * String line =""; FileInputStream fstream = new FileInputStream(filepath);
			 * DataInputStream in = new DataInputStream(fstream); BufferedReader br = new
			 * BufferedReader(new InputStreamReader(in));
			 */
              StringBuffer buffer =new StringBuffer();
            //String strLine;
            Scanner sc = new Scanner(new File(filepath));
            //instantiating the StringBuffer class
           // StringBuffer buffer = new StringBuffer();
            //Reading lines of the file and appending them to StringBuffer
            while (sc.hasNextLine()) {
               buffer.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer.toString();
            System.out.println("Contents of the file: "+fileContents);
            //closing the Scanner object
            sc.close();
            String oldLine = "bat \\\"\\\"\\\"gradlew --no-daemon";
            String newLine = "bat \\\"\\\"\\\"gradlew --no-daemon --continue";
            //Replacing the old line with new line
            fileContents = fileContents.replaceAll(oldLine, newLine);
            //instantiating the FileWriter class
            FileWriter writer = new FileWriter(filepath);
            System.out.println("");
            System.out.println("new data: "+fileContents);
            writer.append(fileContents);
            writer.flush();
            
            
            
			/*
			 * while ((strLine = br.readLine()) != null) { line =strLine; // Print the
			 * content on the console
			 * 
			 * System.out.println(line); if(line.contains("bat \"\"\"gradlew --no-daemon"))
			 * { // line.concat("--continue"); buffer.append(strLine); line =
			 * buffer.append("--continue").toString(); line =
			 * line.replace("(.*?)","bat \"\"\"gradlew --no-daemon --continue"); // line
			 * =buffer.toString(); System.out.println("ho hum, i found it on line "+line );
			 * }
			 * 
			 * } FileWriter fileOut = new FileWriter(filepath); fileOut.append(line);
			 * fileOut.close();
			 * 
			 * fstream.close();
			 */ 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		        
		
	}
}
