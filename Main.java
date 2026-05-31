public class Main {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;
        int n6 = 60;
        int n7 = 70;
        int n8 = 80;
        int n9 = 90;
        int n10 = 100;

        int sum1 = n1 + n5 + n10;
        int sum2 = n3 + n8 + n2;
        int product = sum1 * sum2;
        int sum3 = n4 + n7 + n6 + n9;
        int finalResult = sum3 - product;

        if (finalResult >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}