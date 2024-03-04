public class amstrongNumber {
    public void number(int n)
    {
        int rem = 0;
        int sum = 0;
        while(n>0)
        {
         rem = n%10;
         sum =+ rem*rem*rem;
         n=n/10;
        }
        if(sum == n)
        {
          System.out.println("Amstrong number");
        }
        else
        {
            System.out.println("Not a amstrong number");
        }
    }
    public static void main(String[] args) {
        amstrongNumber a = new amstrongNumber();
        a.number(153);
    }
    
}
