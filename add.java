import java.util.Scanner;
public class add
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.print("addition ="+c);
    }
}