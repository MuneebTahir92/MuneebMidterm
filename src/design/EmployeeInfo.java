package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract {

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private static String companyName;
	private static String companyAddress;
	private int numberOfEmployees;
	private String name;
	private int idNumber;
	private String nameOfDepartment;
	private int salary;
	private int performanceCode;
	private int vacationDays;


	public EmployeeInfo() {
	}
	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int idNumber){
		this.idNumber = idNumber;
	}

	public EmployeeInfo(String name) {
		this.name = name;
	}

    public EmployeeInfo(String name, int idNumber){
		this.name = name;
		this.idNumber = idNumber;
	}

	public EmployeeInfo(String companyName, String companyAddress, int numberOfEmployees) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.numberOfEmployees = numberOfEmployees;
	}

	public EmployeeInfo(String name, int idNumber, String nameOfDepartment, int salary) {
		this.name = name;
		this.idNumber = idNumber;
		this.nameOfDepartment = nameOfDepartment;
		this.salary = salary;
	}

	@Override
	public void vacationDaysLeft() {

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(int salary, int performanceCode){
		double bonus=0;

		if(performanceCode > 0 && performanceCode <= 3){
			bonus = 0;
		}else if(performanceCode >= 4 && performanceCode <= 6){
			bonus = salary * 0.02;
		}else if(performanceCode >= 7 && performanceCode <= 8){
			bonus = salary * 0.05;
		}else if(performanceCode == 9){
			bonus = salary * 0.08;
		}else if(performanceCode == 10){
			bonus = salary * 0.10;
		}
		return bonus;
	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
//	public static int calculateEmployeePension(int salary){
//		int total=0;
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Please enter start date in format (example: May,2015): ");
//		String joiningDate = sc.nextLine();
//		System.out.println("Please enter today's date in format (example: August,2017): ");
//		String todaysDate = sc.nextLine();
//        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
//        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
//
//        //implement numbers of year from above two dates
//		//Calculate pension
//
//		int numberOfYears = convertedTodaysDate - convertedJoiningDate;
//
//		if(numberOfYears > 0 && numberOfYears <= 1){
//			total = 5 * salary;
//		}else if(numberOfYears == 2){
//			total = 10 * salary;
//		}else if(numberOfYears == 3){
//			total = 15 * salary;
//		}else if(numberOfYears > 3){
//			total = 20 * salary;
//		}else{
//			total = 0;
//		}
//
//		return total;
//	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}


