public class Practical7c {
    public static void main(String[] args) {
        // calculate sum & avg of a given array
        Integer[] marks = new Integer[]{81, 94, 95, 92};
        Double sum = 0.0;
        Double avg = 0.0;


        for (Integer mark : marks) {
            sum += mark;
        }


        avg = sum / marks.length;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
