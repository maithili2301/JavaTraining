import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogTest {
  public static void main(String[] args) {
	Log l1=new Log("INFO",LocalDateTime.now(),"Maithili","File uploaded");
	Log l2=new Log("WARN",LocalDateTime.now(),"Arpita","File uploaded");
	Log l3=new Log("ERR",LocalDateTime.now(),"Jack","File not uploaded");
	Log l4=new Log("INFO",LocalDateTime.now(),"Vishal","File uploaded");
	Log l5=new Log("ERR",LocalDateTime.now(),"Mayur","File not uploaded");
//	Log l1=new Log("INFO",LocalDateTime.now(),"Maithili","File uploaded");
	
	
	
	
	List<Log> arrayListObj=new ArrayList();
	arrayListObj.add(l1);
	arrayListObj.add(l2);
	arrayListObj.add(l3);
	arrayListObj.add(l4);
	arrayListObj.add(l5);
	
	
	
	Iterator logIterator=arrayListObj.iterator();
	
	while(logIterator.hasNext()) {
		Log x = (Log) logIterator.next(); //cast it to Log, as it was added as an Object
		System.out.println("Log : "+x);
	}
	
}
}

class Log{
	private String logType;
	private LocalDateTime logDateTime;
	private String logBy;
	private String logMessage;
	public Log(String logType, LocalDateTime logDateTime, String logBy, String logMessage) {
		super();
		this.logType = logType;
		this.logDateTime = logDateTime;
		this.logBy = logBy;
		this.logMessage=logMessage;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDateTime=" + logDateTime + ", logBy=" + logBy + "]";
	}
	
}