package h_w;

import java.util.Scanner;

public class HomeWork8 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1
      //  changeAtoB();
        //2
       // capitalLetters();
        //3
        // reverseA_B();
        //4
       // firstWord();
        // 5
       // lastWord();
        // 6
      //  printLongestWord();
        // 7
        // countWords();
        // 8
        //  checkPalindrome();
    }

    static void changeAtoB() {
        System.out.println("'a' will change to 'b'");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int count = 0;
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
                count++;
            }
        }
        String result = new String(chars);
        System.out.println(result);
        System.out.println(count);
    }

    static void capitalLetters(){
        System.out.println("'a' will change to 'b' and 'A' to 'B'");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int count = 0;
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
                count++;
            } else if (chars[i] == 'A') {
                chars[i] = 'B';
                count++;
            }
        }

        String result = new String(chars);
        System.out.println(result);
        System.out.println(count);
    }

    static void reverseA_B(){
        System.out.println("'a' will change to 'b', 'A' to 'B' and in reverse");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int count = 0;
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
                count++;
            }  else if (chars[i] == 'A') {
        chars[i] = 'B';
        count++;
    } else if (chars[i] == 'b') {
        chars[i] = 'a';
        count++;
    } else if (chars[i] == 'B') {
        chars[i] = 'A';
        count++;
    }
}

String result = new String(chars);
        System.out.println(result);
        System.out.println(count);
    }

    static void firstWord(){
        System.out.println("First word of the text");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int spaceIndex = text.indexOf(' ');
        if (spaceIndex == -1) {
            System.out.println("First: " + text);
        } else {
            String firstWord = text.substring(0, spaceIndex);
            System.out.println("First word: " + firstWord);
        }
    }

    static void lastWord(){
        System.out.println("Last word of the text");
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        int lastSpaceIndex = text.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            System.out.println("Last word: " + text);
        } else {
            String lastWord = text.substring(lastSpaceIndex +1);
            System.out.println("First word: " + lastWord);
        }
    }
    public static void printLongestWord() {
        String text = sc.nextLine();

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        System.out.println(longestWord);
        System.out.println(longestWord.length());
    }

    public static void countWords() {
        String text = sc.nextLine();

        Scanner lineScanner = new Scanner(text);
        int count = 0;

        while (lineScanner.hasNext()) {
            lineScanner.next();
            count++;
        }
        System.out.println(count);
    }

    public static void checkPalindrome() {
        String word = sc.nextLine();

        boolean isPalindrome = true;
        int len = word.length();

        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
