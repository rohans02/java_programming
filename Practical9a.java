class Base {
    void display() {
        System.out.println("Display Function From Base Class");
    }
}


class Derived extends Base {
    void display() {
        super.display();
        System.out.println("Display Function from Derived Class");
    }
}


public class Practical9a {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
