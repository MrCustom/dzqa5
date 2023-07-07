package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Введи букавы");
        String string1=scan.next()+" ";
       // System.out.println(string1);
        String string2=string1.concat(scan.next()+" ");
       // System.out.println(string2);
        String string3=string2.concat(scan.next());
        //System.out.println(string3);
        String string4=string3.concat(scan.next())+" " +scan.next()+" " +scan.next();
        System.out.println(string4);*/


        System.out.println("=================");


/*        Scanner scaner=new Scanner(System.in);
        System.out.println("Insert 1 number");
        int input1=scaner.nextInt();
        System.out.println("Insert 2 number");
        int input2=scaner.nextInt();
        System.out.println("Insert 3 number");
        int input3=scaner.nextInt();


        if(input1+input2>input3){
            System.out.println("Triangle aviable");
            boolean result=true;
        }
        else if(input3>input1+input2) {
            System.out.println("Triangle no aviable");
            boolean result=false;
        }*/

        System.out.println("=================");

/*        Scanner ternscan=new Scanner(System.in);
        System.out.println("Insert 1 number");
        int rentint1=ternscan.nextInt();
        System.out.println("Insert 2 number");
        int rentint2=ternscan.nextInt();
        int result1= rentint1>rentint2 ? rentint1-rentint2 : rentint2-rentint1;
        System.out.println("your result " + result1);*/

        System.out.println("=================");

       /* Scanner scandays=new Scanner(System.in);
        System.out.println("Number for days 1-7 =) ");
        int number=scandays.nextInt();
        if (number==1){
            System.out.println("Понедельник");
        }
        else if(number==2){
            System.out.println("Вторник");
        }
        else if(number==3){
            System.out.println("Среда");
        }
        else if(number==4){
            System.out.println("Четверг");
        }
        else if(number==5){
            System.out.println("Пятница");
        }
        else if(number==6){
            System.out.println("Суббота");
        }
        else if(number==7){
            System.out.println("Восскресенье");
        }
        else {
            System.out.println("Лучше бы сегодня была пятница");
        }*/


        System.out.println("=================");

/*        Scanner sc=new Scanner(System.in);

        System.out.println("Insert 1 number");
        double number1= sc.nextDouble();

        System.out.println("Insert symbol + or - or * or / or %");
        char operator=sc.next().charAt(0);

        System.out.println("Insert 2 number");
        double number2= sc.nextDouble();

        double result=operator=='+'? number1+number2:
                    operator=='-'? number1-number2:
                        operator=='*'? number1*number2:
                                operator=='%'? number1%number2:
                                        operator=='/'? number1/number2: 0;
        System.out.println("Ваш результат:"+result);*/


        System.out.println("=================");

        Scanner scannerNew=new Scanner(System.in);
        System.out.println("Какую программу вы хотите получить:IntelliJ IDEA, Git, Java");
        String program=scannerNew.nextLine();

        switch (program.trim()){
            case("IntelliJ IDEA"):
                System.out.println("Какая у вас ОС:Linux, MacOS, Windows?");
                String oc1=scannerNew.nextLine();
                switch (oc1){
                    case("Linux"):
                        System.out.println("Вот ваша версия:https://www.jetbrains.com/ru-ru/idea/download/?section=linux");
                        break;
                    case("MacOS"):
                        System.out.println("Вот ваша версия:https://www.jetbrains.com/ru-ru/idea/download/?section=mac");
                        break;
                    case("Windows"):
                        System.out.println("Вот ваша версия:https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                }
                break;

                case("Git"):
                    System.out.println("Какая у вас ОС:Linux, MacOS, Windows?");
                    String oc2=scannerNew.nextLine();
                    switch (oc2){
                        case("Linux"):
                            System.out.println("Вот ваша версия:https://git-scm.com/download/linux");
                            break;
                        case("MacOS"):
                            System.out.println("Вот ваша версия:https://git-scm.com/download/mac");
                            break;
                        case("Windows"):
                            System.out.println("Вот ваша версия:https://git-scm.com/download/win");
                            break;
                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;

                case("Java"):
                    System.out.println("Какая у вас ОС:Linux, MacOS, Windows?");
                    String oc3=scannerNew.nextLine();
                    switch (oc3){
                        case("Linux"):
                            System.out.println("Вот ваша версия:https://www.java.com/ru/download/");
                            break;
                        case("MacOS"):
                            System.out.println("Вот ваша версия:https://www.java.com/ru/download/apple.jsp");
                            break;
                        case("Windows"):
                            System.out.println("Вот ваша версия:https://www.java.com/ru/download/");
                            break;

                    }
            default:
                System.out.println("Такой програмы не существует");
            }



    }
}
