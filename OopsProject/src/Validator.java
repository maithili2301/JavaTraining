
public class Validator {
   static boolean checkNumber(int num,int minVal,int maxVal) {
	   
	return (num>=minVal || num<=maxVal)? true : false;
	   
   }
   static boolean checkNumberFloat(float num,float minVal,float maxVal) {
	   
		return (num>=minVal || num<=maxVal)? true : false;
		   
	   }
   
static boolean checkString(String string) {
	return (string.matches("^[a-zA-Z]*$"))? true: false;
		
}

static boolean checkStringWithSpace(String string) {
	return (string.matches("^[a-zA-Z,' ']*$"))? true: false;
		
}
static boolean checkId(String id) {
	return (id.matches("^[a-zA-Z,0-9]*$"))? true: false;
		
}
}
