package hw2;

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
        // Перша частина завдання
    String w1="This line that i want to cut, cause it is too long";
    String w2=(w1.substring(0,35));
    String w3=(w2+ " it is perfect");
        System.out.println(w1+ " " +w1.length());
        System.out.println(w2+ " " +w2.length());
        System.out.println(w3+ " " +w3.length());

        System.out.println("======================");

        // Друга частина завдання

    String t1="Testing, is my favourite job";
    String[] arrayOfString= t1.replace(","," ").split("\\s");

        //System.out.println(Arrays.toString(arrayOfString));
        System.out.println(arrayOfString[0]+" "+ arrayOfString[0].length());
        System.out.println(arrayOfString[2]+" "+ arrayOfString[2].length());
        System.out.println(arrayOfString[3]+" "+ arrayOfString[3].length());
        System.out.println(arrayOfString[4]+" "+ arrayOfString[4].length());
        System.out.println(arrayOfString[5]+" "+ arrayOfString[5].length());


        boolean result=arrayOfString[0].length()>arrayOfString[2].length()&&
                arrayOfString[0].length()>arrayOfString[3].length()&&
                arrayOfString[0].length()>arrayOfString[4].length()&&
                arrayOfString[0].length()>arrayOfString[5].length();

        System.out.println(result);



        System.out.println("======================");


        String s1="Completely random text in English. In it, we just need to determine how many times the character ‘a’ occurs there. And we can use the split method and the length method.";
        String s2=s1.toLowerCase();
        String[] arrayOfString2=s2.split("a");
        int size=arrayOfString2.length-1;

        //System.out.println(Arrays.toString(arrayOfString2));
        System.out.println("'a' зустрічається "+size+ " разів");

 }

}
