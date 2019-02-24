package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] mat = new int[a][b];
		for(int i =0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int chosen = sc.nextInt();
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]==chosen)
				{
					if(i==0 && j!=0 && j!=mat[i].length-1)
					{
						System.out.println(mat[i][j-1]+"["+chosen+"]"+mat[i][j+1]);
						System.out.println(mat[i+1][j-1]+" "+mat[i+1][j]+" "+mat[i+1][j+1]);
					}
					else if(i==0 && j==0)
					{
						System.out.println("["+chosen+"] "+mat[i][j+1]);
						System.out.println(mat[i+1][j]+" "+mat[i+1][j+1]);
					}
					else if(i==0 && j==mat[i].length-1)
					{
						System.out.println(mat[i][j-1]+"["+chosen+"]");
						System.out.println(mat[i+1][j-1]+" "+mat[i+1][j]);
					}
					else if(i==mat.length-1 && j == 0)
					{
						System.out.println(mat[i-1][j]+" "+mat[i-1][j+1]);
						System.out.println("["+chosen+"] "+mat[i][j+1]);
					}
					else if(i==mat.length-1 && j == mat[i].length-1)
					{
						System.out.println(mat[i-1][j-1]+" "+mat[i-1][j]);
						System.out.println(mat[i][j-1]+" ["+chosen+"]");
					}
					else if(i==mat.length-1)
					{
						System.out.println(mat[i-1][j-1]+" "+mat[i-1][j]+" "+mat[i-1][j+1]);
						System.out.println(mat[i][j-1]+"["+chosen+"]"+mat[i][j+1]);
					}
					else if(j==0)
					{
						System.out.println(mat[i-1][j]+" "+mat[i-1][j+1]);
						System.out.println("["+chosen+"]"+mat[i][j+1]);
						System.out.println(mat[i+1][j]+" "+mat[i+1][j+1]);
					}
					else if(j==mat[i].length-1)
					{
						System.out.println(mat[i-1][j-1]+" "+mat[i-1][j]);
						System.out.println(mat[i][j-1]+"["+chosen+"]");
						System.out.println(mat[i+1][j-1]+" "+mat[i+1][j]);
					}
					else
					{
						System.out.println(mat[i-1][j-1]+" "+mat[i-1][j]+" "+mat[i-1][j+1]);
						System.out.println(mat[i][j-1]+"["+chosen+"]"+mat[i][j+1]);
						System.out.println(mat[i+1][j-1]+" "+mat[i+1][j]+" "+mat[i+1][j+1]);
					}
					System.out.println("==============");
				}
				
			}
		}
		
	}
}