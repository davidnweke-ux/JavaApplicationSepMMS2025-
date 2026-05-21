import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
		
		System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

		System.out.println();
        System.out.println("===========================================");

		
		System.out.printf("Hello %s%n",name);
		System.out.printf("You live in  %s%n", address);
        System.out.printf("You are %d years old%n", age);
	}		
}