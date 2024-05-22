package fileWriterPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFOS.txt";
		String content = "File Output Stream";
		
		FileOutputStream fos = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		
		fos.write(writeThis);
		fos.close();

	}

}
