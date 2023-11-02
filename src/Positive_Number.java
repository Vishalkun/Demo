import java.util.Scanner;

public class Positive_Number {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num =sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Its an even number");
            num+=10;
            System.out.println(num);
        }else{
            System.out.println("Its an odd number");
        }*/
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner as we have finished taking input
        scanner.close();

        // Print the next letter for each character in the input string
        System.out.print("Next letters: ");
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char nextChar = (char)(currentChar + 1);
            System.out.print(nextChar);
        }

        System.out.println();  // Move to the next line
    }
    }


