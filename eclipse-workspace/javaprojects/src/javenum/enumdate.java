package javenum;

// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)
import java.util.Scanner;

// An Enum class
enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class enumdate {
	Day day;

	// Constructor
	public enumdate(Day day) {
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case FRIDAY:
			System.out.println("Today is Friday");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Today is Holiday");
			break;
		default:
			System.out.println("Today is Working day");
			break;
		}
	}

	// Driver method
	public static void main(String[] args) {
		String str = "SUNDAY";
		enumdate t1 = new enumdate(Day.valueOf(str));
		t1.dayIsLike();
	}
}
