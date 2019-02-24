package entities;

public class Funcionarios {
	
	private int id;
	private String name;
	private float salary;
	
	
	public Funcionarios(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String empData()
	{
		return this.id+", "+this.name+", "+this.salary;
	}
	public float setSalary(float percent)
	{
		return salary = salary*(1+percent/100);
	}
}
