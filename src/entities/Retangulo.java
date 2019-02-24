package entities;

public class Retangulo {
	
	public float width;
	public float height;
	
	public float area(float a, float b)
	{
		return a*b;
	}
	public float perimeter(float a,float b)
	{
		return 2*(a+b);
	}
	public float diagonal(float a, float b)
	{
		return (float) Math.sqrt((a*a)+(b*b));
	}
	
}
