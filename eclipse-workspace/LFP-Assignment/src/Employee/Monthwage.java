package Employee;

public class Monthwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUM_OF_WORKING_DAYS = 20;
public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
int totalempHrs = 0, totalempWage = 0, totalworkingdays = 0;
while (totalempHrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
	int empHrs = 0;
	totalworkingdays++;
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empcheck) {
		case IS_FULL_TIME:
		empHrs = 8;
		break;
	case IS_PART_TIME:
		empHrs = 4;
		break;
		default:
			empHrs = 0;
		}
	totalempHrs += empHrs;
	int empWage = empHrs * EMP_RATE_PER_HOUR;
	totalempWage += empWage;
	System.out.println("Emp Wage: " + empWage);
}
System.out.println("Total Emp Wage: " + totalempWage);

	}

}
