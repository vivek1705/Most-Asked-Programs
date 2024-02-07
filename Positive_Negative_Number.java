import java.util.Scanner;

public class Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        System.out.println("Enter any number: ");
        num = sc.nextInt();

        if(num >= 0)
        {
            System.out.println(num+ " is positive number");
        }
        else{
            System.out.println(num+ " is negative number");
        }
        sc.close();
    }
    
}
