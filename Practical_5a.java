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


/*
 * Title: Develop a program for implementation of Arrays in Java
 * Assignment No: 05 (B)
 *
 * Enrollment No: 2106181      Date: 18th Aug 2023
 * */
public class Practical_5b {
    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 0;


        for (int i = 0; i < arr.length; i++)
            System.out.println("[" + i + "] : " + arr[i]);


        for (int element : arr)
            sum += element;


        System.out.println("Sum = " + sum);


        String[] names = new String[2];
        names[0] = "Eren Yeager";
        names[1] = "Itachi Uchiha";


        for (String name : names)
            System.out.println(name);
    }
}
