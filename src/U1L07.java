import javax.swing.JOptionPane;

import java.util.Scanner;

public class U1L07 {

	public static void main(String[] args) {
		
		String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int dayNum = 0;
		String dayNumber;
		
		do {
			dayNumber = JOptionPane.showInputDialog(null, "Enter a day of the year (1-365)");
			dayNum = Integer.parseInt(dayNumber);
		}while (dayNum < 1);
		
		int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i = 0;
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int [] numberOfDays = {365};
		
		if (dayNum%7 == 0) {
			System.out.println("Monday");
		}
		if (dayNum%7 == 1) {
			System.out.println("Tuesday");
		}
		if (dayNum%7 == 2) {
			System.out.println("Wednesday");
		}
		if (dayNum%7 == 3) {
			System.out.println("Thursday");
		}
		if (dayNum%7 == 4) {
			System.out.println("Friday");
		}
		if (dayNum%7 == 5) {
			System.out.println("Saturday");
		}
		if (dayNum%7 == 6) {
			System.out.println("Sunday");
		}
		
	}

}
