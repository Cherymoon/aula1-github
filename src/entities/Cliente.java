package entities;

public class Cliente {

	private int id;
	private String nome;
	private float balance;
	
	public Cliente(String nome, int id, float deposit)
	{
		this.nome = nome;
		this.id = id;
		balance = deposit;
	}
	public Cliente(String nome, int id)
	{
		this.nome = nome;
		this.id = id;
	}
	public void setName(String newname)
	{
		this.nome = newname;
	}
	public String getName()
	{
		return this.nome;
	}
	public void addValue(float newvalue)
	{
		balance+= newvalue;
	}
	public void removeValue(float newvalue)
	{
		balance = balance - newvalue + -5;
	}
	public float getBalance()
	{
		return balance;
	}
	public int getId()
	{
		return id;
	}
	public String accStatus()
	{
		String stats = "Client name: "
					+this.nome
					+",ID: "
					+this.id
					+", Balance: "
					+this.balance;
		return stats;
	}
	
	
}
