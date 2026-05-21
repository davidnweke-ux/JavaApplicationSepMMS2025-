import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();
		System.out.print("Enter fourth  interger: ");
		int num4 = input.nextInt();
		System.out.print("Enter fifth interger: ");
		int num5 = input.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        int average = sum / 5;
        int product =  num1 * num2 * num3 * num4 * num5;
		
		System.out.println();
        System.out.println("=================");

        

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        
    }
}
