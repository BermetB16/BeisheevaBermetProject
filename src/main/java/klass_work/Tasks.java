package klass_work;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println("The length of the String: " + input.length());
//        System.out.println( input.charAt(0) + " " + input.charAt(input.length()-1));
// 3
//        System.out.println("Enter text: ");
//        String text = sc.nextLine();
//        System.out.println("Enter word: ");
//        String word = sc.nextLine();
//        boolean check = true;
//        if (text.contains(word)){
//            System.out.println(check);
//        } else{
//            System.out.println(!check);
//        }
// 4
//        String str = sc.nextLine();
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//       5
//        System.out.println("Enter first string");
//        String str1 = sc.nextLine();
//        System.out.println("Enter second string");
//        String str2 = sc.nextLine();
//        System.out.println(str1.equals(str2));
        // 6
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        String both = str1.concat(str2);
//        System.out.println(both);
//        System.out.println(both.length());
        // 7
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int sum = n1 + n2;
//        System.out.println(sum);
//        String intoStrN1 = Integer.toString(n1);
//        String intoStrN2 = Integer.toString(n2);
//        System.out.println(intoStrN1 + intoStrN2);
        // 8
        //1
//        String text = sc.nextLine();
//      for (String i : text.split(" ")){
//          if (i.length() % 2 == 0){
//              System.out.print(i + " ");
//          }
//      }
        // 2
        System.out.println("Text");
        String text = sc.nextLine();
        System.out.println("Word");
        String insertWord = sc.nextLine();
        System.out.println("Index");
        int index = sc.nextInt();
        String subStr = text.substring(0,index);
        String subStr2 = text.substring(index);
        System.out.println(subStr + insertWord + subStr2);
    }
}
