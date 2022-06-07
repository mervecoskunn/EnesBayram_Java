import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
            int age;
            age= scanner.nextInt();
        System.out.println("Entered your age: "+ age );
        if (age>18)
            System.out.println("Welcome to the program!");
        else
            System.out.println("It is not possible to enter for person under the age of 18." );


    }
}
