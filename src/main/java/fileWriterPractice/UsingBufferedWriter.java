package fileWriterPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingBufferedWriter.txt";
		String content = "Buffered Writer";
		
		FileWriter fw = new FileWriter(location);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		
		bw.close();
		
		

	}

}
