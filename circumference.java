import java.util.*;
public class circumference {
    public static void calculate_circum(int r)
    {
        double circumference = 2*Math.PI*r;
        System.out.println("The circumference of the circle is " + circumference);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle of which you want the circumference of");
        int r = sc.nextInt();
        calculate_circum(r);
    }
    
}
