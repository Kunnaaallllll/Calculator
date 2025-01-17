package capgemini.calculator1;
import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        if(n1<n2){
            sum=n1;
        }
        sum=n2;
        System.out.println("THe sum of your given numbers is : "+sum);
    }
}
