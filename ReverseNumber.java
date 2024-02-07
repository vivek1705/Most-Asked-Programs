import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, reverse=0;
        System.out.println("Enter any Number: ");
        num = sc.nextInt();

        // Loop to  iterate through each digit of the number until the number becomes 0.
        while(num != 0)
        {
            // Multiply the reversed number by 10 and add the last digit of the original number
            reverse = reverse * 10 + num % 10;
            // Remove the last digit from the original number
            num = num / 10;
        }

        System.out.println("Reversed number is :" +reverse);
        
        sc.close();
    }
}
