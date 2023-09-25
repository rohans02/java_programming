/*
Title: Demonstrate Use Default Constructor
 Assignment No: 04 (A)
 
 Enrollment No: 2106181                               Date: 18th Aug 2023
 */


public class Practical_4a {
    Practical_4() {
        System.out.println("Creating the Object | Constructor Called");
    }


    public static void main(String args[]) {
        Practical_4a obj = new Practical_4a(); // implicit call to constructor
    }
}

/*
 * Title: Demonstrate Use Parameterized Constructor
 * Assignment No: 04 (B)
 *
 * Enrollment No: 2106181      Date: 18th Aug 2023
 * */


class Adder {
    int sum = 0; // initialize sum to 0
    Adder() {
        System.out.println("Default Constructor Called");
    }


    Adder(int a) {
        System.out.println("Constructor with one argument called");
        for ( int i = 1; i <= a; i++ )
            sum += i;
    }


    void display() {
        System.out.println("Sum = " + sum);
    }
}


public class Practical_4b {
    public static void main(String args[]) {
        Adder objA = new Adder();
        Adder objB = new Adder(3);
        
        objA.display();
        objB.display();
 
    }
}
