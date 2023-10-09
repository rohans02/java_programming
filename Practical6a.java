public class Practical6a {
    public static void main(String[] args) {
        String str = "We live in our own fantasies";

        System.out.println("String Length : " + str.length());
        System.out.println("String Concat : " + str.concat(" -Itachi Uchiha"));
        System.out.println("String Compare: " +              
                            str.equals(str.toLowerCase()));
        System.out.println("Substring     : " + str.substring(14, 28));
        System.out.println("String Search : " + str.indexOf("own"));
        System.out.println("String Search : [LastIdx] " + 
                            str.lastIndexOf("fantasies"));
    }
}
