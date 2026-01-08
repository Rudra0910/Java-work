import java.util.*;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        do{
            c=a%b;
            a=b;
            b=c;
        }while(b!=0);
        System.out.println(a);
    }
    
}
