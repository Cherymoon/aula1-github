package entities;

public class Employee {

	public String name;
	public float grosssalary;
	public float tax;
	
	
	public float netSalary()
	{
		return grosssalary-tax;
	}
	
	public void increaseSalary(float percentage)
	{
		grosssalary*=1+percentage/100;
	}
	
}
