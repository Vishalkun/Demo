import java.util.Scanner;

public class Print_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sc = scanner.nextLine();

        scanner.close();

        System.out.print(" Printing the next letters: ");
        for (int i = 0; i < sc.length(); i++) {
            char currentChar = sc.charAt(i);
            char nextChar = (char) (currentChar + 1);
            System.out.print(nextChar);
        }

        System.out.println();
    }
    }

