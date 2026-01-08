import java.util.*;
public class countpositive_negative_Zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positives_count=0;
        int negatives_count=0;
        int zeroes_count=0;
        String want;
        do {
            System.out.println("Enter the number");
            int number= sc.nextInt();
            System.out.println("Do you wish to continue, answer in yes or no");
            want=sc.next();
            if(number>0)
            {
                positives_count=positives_count+1;
            }
            else if(number<0)
            {
                negatives_count=negatives_count+1;
            }
            else
            {
                zeroes_count=zeroes_count+1;
            }
        } while (want.equals("yes"));
        
        
        System.out.println("The amount of postive numbers are : "+positives_count);
        System.out.println("The amount of negative numbers are : "+negatives_count);
        System.out.println("The amount of zeroes are : "+zeroes_count);


        
    }
}
