package fileReaderPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		
		String location = "newFile.txt";
		String content = "To read a file\n" + "Using\n" + "File Reader class";
		
		FileWriter fw = new FileWriter(location);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(content);
		bw.close();
		
//	*****************File Reader*******************
		
//		FileReader fr = new FileReader("123.txt");
		FileReader fr = new FileReader(location);
		BufferedReader br = new BufferedReader(fr);
		
//		String currentLine = br.readLine();
		
		String currentLine;
//		while(currentLine != null)
//		System.out.println(currentLine);
		
		while((currentLine=br.readLine()) != null) {
			System.out.println(currentLine);
		}
		br.close();
		
	}

}
