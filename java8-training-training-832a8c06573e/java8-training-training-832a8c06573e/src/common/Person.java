package common;


import java.time.LocalDate;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate birthday;
	private String emailAddress;

	public Person() {
	}

	public Person(String firstName, String lastName, String emailAddress,Gender gender, String birthday ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthday = LocalDate.parse(birthday);
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return birthday.until(LocalDate.now()).getYears();
	}

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", emailAddress="
				+ emailAddress + ", age=" + getAge() + "]";
	}

	@Override
	public int compareTo(Person person) {
		
		return this.getBirthday().isBefore(person.getBirthday())?-20:20;
	}

	
	
}
