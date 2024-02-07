public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        
        int n1=10, n2=25, n3=5;

        if(n1>=n2 && n1>=n3)
        {
            System.out.println(n1+ " is greater.");
        }
        else if(n2>=n1 && n2>=n3)
        {
            System.out.println(n2+ " is greater.");
        }
        else{
            System.out.println(n3+ " is greater");
        }
    }
}

/* AND (&&) 
 * 0 && 0 = 0
 * 0 && 1 = 0
 * 1 && 0 = 0
 * 1 && 1 = 1
*/