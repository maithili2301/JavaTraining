import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest {
   public static void main(String[] args) {
	System.out.println("Trying to read a file....");
	String path="C:\\Users\\MHR18\\Documents\\workspace-spring-tool-suite-4-4.19.0.RELEASE\\FileHandlingProject\\fun.txt";
	try {
		FileReader fileInputStream=new FileReader(path);
		System.out.println("File is open");
		int theChar=fileInputStream.read();
		while(theChar!=-1) { //-1 is End of file...
			System.out.print((char)theChar);
			theChar=fileInputStream.read();
			
			Thread.sleep(50);
		}
		System.out.println();
		fileInputStream.close();
		System.out.println("File closed");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
