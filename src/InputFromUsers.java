import java.util.Scanner;

public class InputFromUsers {
    public static void main(String[] args) {
        /*
        nextLine()----->String
        nextInt()------>Integer
        nextByte()----->Byte
        nextFloat()---->Float
        nextDouble()---->Double
         */
        //String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surName;
        surName = scanner.nextLine();
        System.out.println("Your name and surname: "+name+" "+surName);

        //Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is : "+age);

        //Double
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Your weight is : "+weight);


    }
}
