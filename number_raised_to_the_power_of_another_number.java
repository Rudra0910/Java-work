import java.util.*;
public class number_raised_to_the_power_of_another_number {
    public static double power(double a , double b)
    {
        double exponent=Math.pow(a, b);
        return exponent;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double exponent = power(a, b);
        System.out.println(exponent);

    }
}
