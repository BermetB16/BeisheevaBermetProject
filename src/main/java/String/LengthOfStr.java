package String;

import java.util.Scanner;

public class LengthOfStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = "Good morning";
        int lengthGreeting = greeting.length();
        System.out.println("Length of the word " + lengthGreeting);
      //  findTheLength(greeting);
    }
    static void findTheLength(String word){
        System.out.println(word.length());
    }

}
