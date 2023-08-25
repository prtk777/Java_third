import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if-else statement
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

  }
}
	


         // Using switch-case statement
        int remainder = num % 2;
        switch (remainder) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}

