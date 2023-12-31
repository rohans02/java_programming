/*
 * Title: Develop a program to Accept input using command line arguments
 * Assignment No: 05 (A)
 *
 * Enrollment No: 2106181      Date: 18th Aug 2023
 * */


public class Practical_5a {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Provide two numbers as Command line argument");
            System.exit(1);
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}


