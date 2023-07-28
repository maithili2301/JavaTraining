import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {
   public static void main(String[] args) {
	System.out.println("Trying to write a file....");
	String path="C:\\Users\\MHR18\\Documents\\workspace-spring-tool-suite-4-4.19.0.RELEASE\\FileHandlingProject\\queen.txt";
	try {
		FileOutputStream fileOutputStream=new FileOutputStream(path,true);
//		System.out.println("File is ready to write...");
		String str="\nHello everyone...";
		byte array[]=str.getBytes();
		fileOutputStream.write(array);
//	    System.out.println("Line is wriiten...");
		
		System.out.println();
		fileOutputStream.close();
//		System.out.println("File closed");
		System.out.println("New lines written in File...");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Trying to read file......");
	try {
		FileInputStream fileInputStream=new FileInputStream(path);
		System.out.println();
		System.out.println("File is open");
		byte theChar=(byte)fileInputStream.read();
		while(theChar!=-1) { //-1 is End of file...
			System.out.print((char)theChar);
			theChar=(byte)fileInputStream.read();
			
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
