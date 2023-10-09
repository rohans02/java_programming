interface BaseFirst {
    void basefirst_display();
}

interface BaseSecond {
    void basesecond_display();
}

class Derived implements BaseFirst, BaseSecond {
    public void basefirst_display() {
        System.out.println("[FirstBase] display implementation");
    }


    public void basesecond_display() {
        System.out.println("[SecondBase] display implementation");
    }


    public void display() {
        System.out.println("[Derived] display implementation");
    }
}
public class Practical9b {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
        d.basefirst_display();
        d.basesecond_display();
    }
}
