package java_latest.time.nonmoment;



import java.time.LocalDate;

public class Initialisation {
	public static void main(String[] args) {

		LocalDate dateOfIndependence = LocalDate.of(1947, 8, 15);

		LocalDate constituitionCameIntoEffect = LocalDate.parse("1950-01-26");

		System.out.println(dateOfIndependence);
		System.out.println(constituitionCameIntoEffect);
	}

}
