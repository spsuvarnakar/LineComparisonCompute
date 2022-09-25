package com.bridhelabz.LineCoparison;

public class LineComparisonCompute {
	public static void main(String[] args)
	{

		System.out.println("Welcome to Line Computation Comprison Program ");
		
		Scanner length = new Scanner (System.in);
		System.out.println ("Enter the 1st co-orinate");
		
		double x1 = length.nextDouble ();
		System.out.println ("Enter the 2nd co-orinate");
		
		double x2 = length.nextDouble ();
		System.out.println ("Enter the 3rd co-orinate");
		
		double y1 = length.nextDouble ();
		System.out.println ("Enter the 4th co-orinate");
		
		double y2 = length.nextDouble ();
		
		double a = (x2 - x1) * (x2 - x1);
		double b = (y2 - y1) * (y2 - y1);
		
		double length_of_line = Math.sqrt (a + b);
		
		System.out.println ("Length Of Line : " +length_of_line);  
		
		System.out.println("THIS IS LINE(LENGTH)COMPARISON PROGRAM !!!! THANK YOU!! ");
	}
}
