package com.crosby.personsim;

public class TestDrive {

	public static void main(String[] args) {
		
		//Person matt = new Person("Matt", "Crosby", 7, 9, 21);
		//matt.walk();
		
		String[] subjects = new String[]{"Maths", "German", "Computing"};
		Student matt = new Student("Matt", "Crosby", 7, 9, 21, subjects);
		matt.revise("English");
		matt.breathe();
		
		String[] team = new String[]{"England", "Germany", "Spain"};
		String[] position = new String[]{"Attacker", "Defender"};
		FootballPlayer john = new FootballPlayer("John", "Smith", 7, 9, 21, team, position);
		john.play("England", "Attacker");
		john.breathe();
		
		int payrollNumber = 23626266;
		String niNumber = "PI532309375";
		String[] department = new String[]{"Human Resources", "Developers", "Testers"};
		Employee phill = new Employee("Phill", "Smith", 6, 8, 20, payrollNumber, niNumber, department);
		phill.performJob("Developers");
		phill.breathe();
		
		int reservedParkingSpaceID = 23;
		OfficeManager bob = new OfficeManager("Bob", "Smith", 6, 8, 22, payrollNumber, niNumber, department, reservedParkingSpaceID);
		bob.conductAppraisal();
		bob.chairMeeting();
		bob.produceDataReport();
		
		OfficeClerk steve = new OfficeClerk("Steve", "Johnson", 7, 8, 25, payrollNumber, niNumber, department);
		steve.clockIn();
		steve.clockOut();
		steve.claimOverTime();
	}

}
