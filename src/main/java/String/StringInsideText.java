package String;

public class StringInsideText {
    public static void main(String[] args) {
        String str1 = "One two and let's Do";
        String str2 = "One";
        String str3 = "four";
        boolean check = str1.contains(str2);
        boolean check2 = str1.contains(str3);
        System.out.println(check);
        System.out.println(check2);

    }
}
