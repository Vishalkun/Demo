import java.util.Scanner;

public class Positive_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num =sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Its an even number");
            num+=10;
            System.out.println(num);
        }else{
            System.out.println("Its an odd number");
        }
    }
}
