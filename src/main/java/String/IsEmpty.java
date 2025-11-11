package String;

public class IsEmpty {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "snow";
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        if (str1.isEmpty()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (str1.equals("")){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str2.length() == 0){
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
    }
}
