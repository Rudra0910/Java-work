import java.util.*;
public class greaternumber {
    public static void calculate_greater(int a, int b)
    {
        if(a>b)
        {
            System.out.println("The greater number is "+ a);
        }
        else if(b>a)
        {
            System.out.println("The greater number is "+ b);
        }
        else
        {
            System.out.println("Enter the numbers again");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate_greater(a, b);
    }
    
}
