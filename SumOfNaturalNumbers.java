import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.println("Enter number:");
        num = sc.nextInt();

        for(int i=0; i<=num; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum is: " +sum);

        sc.close();
    }
    
}


// 1+2+3+4+5+6+7+8+9+10 = 55