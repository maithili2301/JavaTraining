
public class SingleLevelTest1 {
	public static void main(String[] args) {
//		Person personObj1 = new Person('f',"Maithili",122);
//		personObj1.showPerson();

//		Person personObj2=new Person(23);
//		personObj2.showPerson();

//		Student studentObj1 = new Student('M', "Jack", 23, "GE CA", "Information T", 24, 90);
//		studentObj1.showStudent();
		
		Employee employeeObj1 = new Employee('M', "Jack", 23, "GE CA", "Information T", 24, 90,"DS1001","Dassault systemes","Developer",200000);
		employeeObj1.showEmployee();
//		System.out.println("----------------------");
//		Student studentObj = new Student();
//		System.out.println("-----------------------");
//		Employee empObj = new Employee();
//		System.out.println("----------");
	}
}

class Person {
	private char gender;
	private String name;
	private int age;

//	Person() {
//		System.out.println("Person() ctor....");
//	}
	Person(int age) {
		this('F', "NONAME", age);

	}

	Person(char gender) {
		this(gender, "NONAME", 100);
	}

	Person(String name) {
		this('F', name, 100);
	}

	Person(char gender, String name, int age) {
		System.out.println("Person() ctor....");
		if (gender == 'M' || gender == 'F' || gender == 'T' || gender == 'f' || gender == 'm' || gender == 't') {
			this.gender = gender;
		} else {
//			System.out.println("invalid gender");
//			throw new RuntimeException("Invalid gender");
			RuntimeException runtimeGenderEx = new RuntimeException("Invalid gender " + gender);
			throw runtimeGenderEx;
		}
		if (name.matches("^[a-zA-Z]*$")) {
			this.name = name;
		} else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid name " + name);
			throw runtimeNameEx;
		}

		if (age >= 21 && age <= 100) {
			this.age = age;
		} else {
			RuntimeException runtimeAgeEx = new RuntimeException("Invalid age " + age);
			throw runtimeAgeEx;
		}

		this.name = name;
	}

	public void showPerson() {
		System.out.println("---------PERSONAL--------");
		System.out.println("GENDER: " + gender);
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
	}
}

class Student extends Person {
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;

	Student(char gender, String name, int age, String collegeName, String stream, int rollNumber, float totalMarks) {
//		super.showPerson();
		super(gender, name, age);
		System.out.println("Student() ctor....");
		if (Validator.checkStringWithSpace(collegeName)) {
			this.collegeName = collegeName;
		} else {
			RuntimeException runtimeCollegeNameEx = new RuntimeException("Invalid CollegeName " + collegeName);
			throw runtimeCollegeNameEx;

		}

		if (Validator.checkStringWithSpace(stream)) {
			this.stream = stream;
		} else {
			RuntimeException runtimeStreamEx = new RuntimeException("Invalid Stream " + stream);
			throw runtimeStreamEx;

		}

		if (Validator.checkNumber(rollNumber, 1, 500)) {
			this.rollNumber = rollNumber;
		} else {
			RuntimeException runtimeRollNumberEx = new RuntimeException("Invalid Roll Number " + rollNumber);
			throw runtimeRollNumberEx;
		}

		if (Validator.checkNumberFloat(totalMarks, 75, 100)) {
			this.totalMarks = totalMarks;

		} else {
			RuntimeException runtimeTotalMarksEx = new RuntimeException("Invalid Marks : " + totalMarks);
			throw runtimeTotalMarksEx;
		}

	}

	public void showStudent() {
		super.showPerson();
		System.out.println("--------EDUCATIONAL--------");
		System.out.println("COLLEGE NAME: " + collegeName);
		System.out.println("STREAM: " + stream);
		System.out.println("ROLL NUMBER: " + rollNumber);
		System.out.println("TOTAL MARKS: " + totalMarks);
	}
}

class Employee extends Student {
	String empId;
	String companyName;
	String designation;
	float salary;

	Employee(char gender, String name, int age, String collegeName, String stream, int rollNumber, float totalMarks,
			String empId, String companyName,String designation, float salary) {
		super(gender, name, age, collegeName, stream, rollNumber, totalMarks);
		System.out.println("Employee() ctor....");
		
		if(Validator.checkId(empId)) {
			this.empId=empId;
		}else {
			RuntimeException runtimeEmpIdEx=new RuntimeException("Invalid Employee Id: "+empId);
			throw runtimeEmpIdEx;
			}
		
		if(Validator.checkStringWithSpace(companyName)) {
			this.companyName=companyName;
		}else {
			RuntimeException runtimeCompanyNameEx=new RuntimeException("Company Name Invalid "+companyName);
			throw runtimeCompanyNameEx;
		}
		
		if(Validator.checkStringWithSpace(designation)) {
			this.designation=designation;
		}else {
			RuntimeException runtimeDesignationEx=new RuntimeException("Designation Invalid "+designation);
			throw runtimeDesignationEx;
		}
		
		
		if(Validator.checkNumberFloat(rollNumber, 10000, 999999)) {
			this.salary=salary;
		}else {
			RuntimeException runtimeSalaryEx=new RuntimeException("Salary Invalid "+salary);
			throw runtimeSalaryEx;

		}
		
		
		
	}
	void showEmployee() {
		super.showStudent();
		System.out.println("-------PROFESSIONAL--------");
		System.out.println("EMPLOYEE ID: "+empId);
		System.out.println("COMPANY NAME: "+companyName);
		System.out.println("DESIGNATION: "+designation);
		System.out.println("SALARY: "+salary);
	}
}
