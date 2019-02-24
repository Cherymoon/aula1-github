package entities;

public class Rent1 {

	private String name;
	private String email;
	private int room;
	
	
	
	public Rent1(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}



	public void rentRooms()
	{
		String ab="";
		if(this.name != "null")
		{
			ab = "\n"+this.room+": "+this.name+", "+this.email;
			System.out.println(ab);
		}
		else
		{
			System.out.print("Oi");
		}


	}



	public int getRoom() {
		return room;
	}
	public String toString()
	{
		return this.name;
	}
	
	
}
