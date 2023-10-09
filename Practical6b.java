public class Practical6b {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Java Programming");

        buffer.append("1");
        System.out.println("After append : " + buffer);


        buffer.insert(16, " ");
        System.out.println("After insert : " + buffer);


        buffer.delete(0, 5);
        System.out.println("After Delete : " + buffer);


        buffer.reverse();
        System.out.println("After Reverse: " + buffer);


        System.out.println("Buffer Capacity : " + buffer.capacity());
    }
}
