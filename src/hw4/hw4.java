package hw4;

import java.util.*;

public class hw4 {


    public static void main(String[] args) {


        /*Scanner inputWords=new Scanner(System.in);
        String wordsToRes="";

        while (true){
            String wordsForInput=inputWords.nextLine();
            wordsToRes=wordsToRes+wordsForInput;
            if (wordsForInput.equals("STOP")){
                break;
            }

        }
        String result=wordsToRes.replace("STOP","\s");
        System.out.println(result);*/


        System.out.println("==========================================");


        /*Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Insert number");
        String number = inputNumbers.nextLine();
        char[] numberChars = number.toCharArray();
        boolean polindron = true;
        for (int i = 0; i <= numberChars.length / 2 - 1; i++) {
            if (numberChars[i]!=numberChars[numberChars.length-i-1]){
                polindron=false;
            }

        }
        if(polindron){
            System.out.println("Polindrom");
        }
        else {
            System.out.println("Non Polidrom");
        }*/


        System.out.println("==========================================");

   /*     Scanner in=new Scanner(System.in);
        int sklad=100;
        System.out.println("Размер склада "+sklad);
        System.out.println("Кіко метала вносіть буш?");
        while (sklad>0){
            if(sklad==0){
                break;
            }
            int ves= in.nextInt();
                if (ves<=5){
                    System.out.println("Броу слішком мало надо больше");
                    continue;
                }
            if (sklad-ves<0){
                System.out.println("Нізя стока броу");
                System.out.println("Осталось места "+sklad);
                continue;

            }

            sklad=sklad-ves;
            System.out.println("Осталось места "+sklad);
        }*/


        System.out.println("==========================================");

        String[] arrayNames = {"Петя", "Маша", "Алена", "Федя", "Саша", "Антон", "Глеб"};
        int[] arrayTime = {10, 12, 14, 16, 18, 20};
        String[] arrayPlaces = {"школу", "магазин", "церковь", "тренажерный", "зал", "кино", "поликлинику"};
        Scanner scan=new Scanner(System.in);
        int[] arrayOfPre=new int[3];
        for (int i=0;i<arrayOfPre.length;i++){
            arrayOfPre[i]=scan.nextInt();
        }
        System.out.println(arrayNames[arrayOfPre[0]]+" идет в "+arrayPlaces[arrayOfPre[1]]+" в "+arrayTime[arrayOfPre[2]]);


        System.out.println("==========================================");


        /*int[] array = new int[10];
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
            System.out.print(array[i] + " ");
        }


        int num = in.nextInt();

        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                result = true;
                num = array[i];

            }

        }
        if (result) {
            System.out.println("Chisla est");
        } else {
            System.out.println("chisla net");
        }*/


        System.out.println("==========================================");

        /*int[]arrayOfNums=new int[45];
        Random random2=new Random();

        for (int i=0;i<arrayOfNums.length;i++){
            arrayOfNums[i]=random2.nextInt(-50,50);
        }
        for (int masive:arrayOfNums){
            System.out.print(masive+" ");
        }


        int minNum=arrayOfNums[0];
        for (int i=0;i< arrayOfNums.length;i++){
            if (minNum>arrayOfNums[i]){
                minNum=arrayOfNums[i];
            }
        }
        int maxNum=arrayOfNums[0];
        for (int i=0;i<arrayOfNums.length;i++){
            if (maxNum<arrayOfNums[i]){
                maxNum=arrayOfNums[i];
            }
        }
        System.out.println("\nМаксимальное число "+maxNum);
        System.out.println("Минимальное число "+minNum);
*/




    }
}
