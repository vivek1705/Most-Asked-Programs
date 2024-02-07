class SumOfNumbersIngivenRange
{
    public static void main(String[] args) {
        
        int num1=10, num2=12, sum = 0;

        for(int i=num1; i<=num2; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}