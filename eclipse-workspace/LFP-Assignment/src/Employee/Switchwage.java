package Employee;

public class Switchwage {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {

		int empHrs = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		switch ((int)empcheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("empWage:" + empWage);
	}

}
