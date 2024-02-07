import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter year: ");
        year = sc.nextInt();

        //check 
        if(year % 400 == 0)
        {
            System.out.println(year+ " is leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println(year+ " is leap year");
        }
        else
        {
            System.out.println(year+ " is not leap year");
            
        }
        sc.close();
    }
}

/* 
 * leap year is come every 4 year means after 4 year
 * 2000,2004,2008,2012,2016,2020,2024 etc
 * to find leap year we need to divide  the year by 400 and 4 but year must not divide by 100
 * i.e (year % 400 == 0) OR (year % 4==0 && year % 100 !=0)
 */