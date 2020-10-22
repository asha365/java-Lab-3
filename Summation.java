import java.util.Scanner;
public class Summation{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = s.nextInt();
		
		System.out.println("Enter another number");	
		int num2 = s.nextInt();
		
		System.out.println("The summation is:"+ (num1+num2));
		
	}
}