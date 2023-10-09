class Shape {
    double calculateArea() {
        return 0;
    }
}
class Square extends Shape {
    int sides;
    Square(int sides) {
        this.sides = sides;
    }
    
    double calculateArea() {
        return Math.pow(sides, 2);
    }
}
public class Practical8b {
    public static void main(String[] args) {
        System.out.println("Shape.calculateArea() : " + 
                           new Shape().calculateArea());
        System.out.println("Square.calculateArea(): " + 
                           new Square(4).calculateArea());
    }
}
