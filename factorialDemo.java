class Factorial
{
    int i,n,fact=1;
    Factorial()
    {
        n=4;
    }
    Factorial(int x)
    {
        n=x;
    }
    int fact()
    {
        for (i=1;i<=n;i++)
            fact=fact*i;
        return (fact);
    }

}

public class factorialDemo 
{
    public static void main(String args[])
    {
        int x,ff;
        Factorial f=new Factorial(5);
        ff=f.fact();
        System.out.println("factorial is "+ff);
        
    }
}
