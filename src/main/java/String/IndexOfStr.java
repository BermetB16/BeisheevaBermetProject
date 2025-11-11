package String;

public class IndexOfStr {
    public static void main(String[] args) {
        String str = "java";
        int indexOf = str.indexOf('v');
        System.out.println("The index of 'v' equals to: " + indexOf);

        int indexOfA = str.indexOf('a');
        System.out.println("The index of first 'a' equals to: " + indexOfA);

        int indexOfSecondA = str.indexOf('a', indexOfA + 1);
        System.out.println("The index of second 'a' equals to: " + indexOfSecondA);
    }
}
