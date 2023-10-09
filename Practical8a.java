class Greetings {
    static void greet() {
        System.out.println("Welcome, User!!!");
    }


    static void greet(String name) {
        System.out.println("Welcome, " + name + "!!!");
    }
}


public class Practical8a {
    public static void main(String[] args) {
        Greetings.greet();
        Greetings.greet("Itachi");
    }
}
