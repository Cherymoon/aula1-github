package entities;

public class Aluno {

	public String nome;
	public float n1;
	public float n2;
	public float n3;
	
	public float notaFinal()
	{
		return n1+n2+n3;
	}
	public float quantoFaltou()
	{
		return 60-(n1+n2+n3);
	}
	public String aprovado()
	{
		String resultado ="";
		if(n1+n2+n3 >=60)
		{
			resultado = "Aprovado";
		}
		else
		{
			resultado = "Reprovado";
		}
		return resultado;
	}
	
	
}
