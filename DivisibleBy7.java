import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if-else
        if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7.");
        } else {
            System.out.println(num + " is not divisible by 7.");
        }

        // Using switch-case
        int remainder = num % 7;
        switch (remainder) {
            case 0:
                System.out.println(number + " is divisible by 7.");
                break;
            default:
                System.out.println(number + " is not divisible by 7.");
        }
    }
}
