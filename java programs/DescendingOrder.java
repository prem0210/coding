import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        
        System.out.println("Numbers in descending order:");

        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + ", ");
            if (num2 >= num3) {
                System.out.print(num2 + ", " + num3);
            } else {
                System.out.print(num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + ", ");
            if (num1 >= num3) {
                System.out.print(num1 + ", " + num3);
            } else {
                System.out.print(num3 + ", " + num1);
            }
        } else {
            System.out.print(num3 + ", ");
            if (num1 >= num2) {
                System.out.print(num1 + ", " + num2);
            } else {
                System.out.print(num2 + ", " + num1);
            }
        }

        scanner.close();
    }
}
