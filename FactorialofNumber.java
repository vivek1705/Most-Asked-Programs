import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, factorial=1;
        System.out.println("Enter any Number: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +num+ " is: " +factorial);
        sc.close();
    }
}
