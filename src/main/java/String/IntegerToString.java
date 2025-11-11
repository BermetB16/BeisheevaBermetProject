package String;

public class IntegerToString {
    public static void main(String[] args) {
        int n = 1234;
        String strN = Integer.toString(n);
        System.out.println(strN);

        String message = "It is snowing today";
        System.out.println(message.replace("snowing", "raining"));
        System.out.println(message.replace('o', 'a'));

        String prog = "Java is programming language";
        System.out.println(prog.replace("Java", "Python"));
    }
}
