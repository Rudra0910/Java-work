import java.util.*;
public class eligibility_to_vote {
    public static void eligibility(int age)
    {
        if(age>=18)
        {
            System.out.println("The person is eligible to vote");
        }
        else if(age<18)
        {
            System.out.println("The person is not eligible to vote");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person applying to vote in the next Elections");
        int age = sc.nextInt();
        eligibility(age);
    }
}
