package String;

public class CompareOfStr {
    public static void main(String[] args) {
        String str1 = "IEMIT";
        String str2 = "IEMIT";
        String str3 = "Iemit";
        boolean compare12 = str1.equals(str2);
        boolean compare13 = str1.equals(str3);
        System.out.println(compare12);
        System.out.println(compare13);
    }
}
