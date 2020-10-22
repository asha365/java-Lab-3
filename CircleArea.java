//circle area

import java.util.Scanner;
public class CircleArea{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter radius:");
		double r = s.nextDouble();
		
		
		double area = Math.PI * (r*r);
		System.out.println("The area of circle:" + area);
	}
}