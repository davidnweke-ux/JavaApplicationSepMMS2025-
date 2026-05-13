public class OperatorPart2{
	public static void main(String[] args){
		//Logical Operator(&&, PIPE,!)
		int num1 = 15;
		int num2 = 30
		int num3 = 18;
		
		boolean andOperator = (num1 > num2) && (num1 > num3);
		System.out.printf("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,andOperator)
	}
}