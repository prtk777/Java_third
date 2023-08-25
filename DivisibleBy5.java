import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if-else 
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }

        // Using switch-case  
        int remainder = number % 5;
        switch (remainder) {
            case 0:
                System.out.println(number + " is divisible by 5.");
                break;
            default:
                System.out.println(number + " is not divisible by 5.");
        }
    }
}
