package fileWriterPractice;

import java.io.FileWriter;
import java.io.IOException;
//FileWriter - straight fwd, direct interaction with files, less performance
public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		
		String location ="UsingFileWriter.txt";
		String content = "File Writer";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		
		fileWriter.close();

	}

}
