import java.util.Scanner;

public class HomeWork{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nu1 = 10;
		int nu2 = 20;
		int nu3 = 30;
		int nu4 = 40;
		int nu5 = 50;
		int nu6 = 60;
		int nu7 = 70;
		int nu8 = 80;
		int nu9= 90;
		int nu10 = 100;
		
		int sum1 = nu1 + nu5 + nu10;
		int sum2 = nu3 + nu8 + nu2;
		int product = sum1 * sum2;
		int sum3 = nu4 + nu7 + nu6 + nu9;
		
		int Result = sum3 - product;
		
		
		System.out.println("");
		System.out.println("=============================");
			
		
		if (Result >= 100) {
			System.out.println("hurray I did it");
		} else {
			System.out.println("I still need to learn more in Java");
			
			}
		
		
	}
}