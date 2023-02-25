package answerToQuestion1;

public class Personel {
	
	private String name;
	private String surname;
	private double salary;
	private double workHours;
	private int hireYear;
	

	
	public Personel(String name, String surname, double salary, double workHours, int hireYear) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	
	

}
