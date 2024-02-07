import java.util.Scanner;

public class PrimeNumberinGivenRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;

        System.out.println("Enter first Number: ");
        start = sc.nextInt();

        System.out.println("Enter last number: ");
        end = sc.nextInt();

        System.out.print("Prime numbers are: " );
        for(int i=start; i<=end; i++)
        {
            if (isPrime(i)) {
                System.out.print(i+ " \t");
            } 
        }
        sc.close();
    }

    private static boolean isPrime(int num) {
    
        if(num <= 1)
        {
            return false;
        }
        else{
            for(int i=2; i<=num/2; i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
