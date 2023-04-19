package com.tutorialforbeginners;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date; //to get Date Class from java.util package
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        //primitive types
//        byte age = 30;
//        short queue = 123;
//        int viewsCount = 123_456_789; //underscore to separate every 3 digits
//        long balanceAccount = 3_123_456_789L; //add L to specify long data type
//        float price = 10.99F; //add F to specify float data type
//        double anotherPrice = 10.99;
//        char letter = 'A'; //if the var only consist 1 character, use single quote
//        boolean isEligible = false;

//        //reference type
//        Date now = new Date(); //now is now an instance of Date Class
//        now.getTime();
//        System.out.println(now);

//        //primitive vs reference
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

//        Point point1 = new Point(1,1 );
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        //String
//        String message = "   Hello World" + "!!   ";
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("l"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim()); //this will remove whitespaces

//        //Escape Sequences
//        String message = "Hello \" Afdy"; //use backslash to escape double quote
//        String message1 = "c:\\Windows\\Documents\\...";
//        String message2 = "c:\nNewLine\n\tTab";
//        System.out.println(message);
//        System.out.println(message1);
//        System.out.println(message2);

        //Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
        //numbers[10] = 3; //this will cause error, because maximum index is 4
//        System.out.println(Arrays.toString(numbers));  //you need to call Class Arrays to print out your array variables

//        int[] numbers1 = {1, 4, 3, 2, 5};
//        Arrays.sort(numbers1);
//        System.out.println(numbers1.length);
//        System.out.println(Arrays.toString(numbers1));

//        //Multi-dimensional Arrays
//        int[][] numbers2 = new int[2][3];
//        numbers2[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers2)); //multi-dimension array needs to use DeepToString
//
//        int[][] numbers3 = { {1,3,2}, {4,6,5} };
//        System.out.println(Arrays.deepToString(numbers3));

        //Constants
//        final float PI = 3.14F; //final will make this variable as a constant

        //Arithmetic Expression
//        int result = 10 + 3; // - * % /
//        float result1 = (float)10 / (float)3; //to get the correct result of divide we need to use double or float
//        int x1 = 1;
//        int x2 = 1;
//        //x++; //you can put ++ as a prefix or postfix
//        int y = x1++; //this will set y as x, and then x will be increment by 1, y = x = x + 1
//        int z = ++x2; //this will set z as x increment by 1, and x will be increment by 1, z = 1 + x = x
//        //x = x + 2 is equal to x += 2, you can use any operator
//        System.out.println(result1);
//        System.out.println("x1: " + x1);
//        System.out.println("x2: " + x2);
//        System.out.println("y: " + y);
//        System.out.println("z: " + z);

        //Order of operations
//        int x = 10 + 3 * 2; // * and / will always be executed first then + and -
//        System.out.println(x);

//        //Casting
//        // Implicit casting byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//
//        double a = 1.1;
//        double b = a + 2; //java will cast 2 into 2.0
//        System.out.println(b);
//
//        double c = 1.1;
//        int d = (int)c + 2; //explicit casting, this will convert c into an int data type
//        System.out.println(d);
//
//        String e = "1";
//        int f = Integer.parseInt(e) + 2; //this will parse String into int data type
//        System.out.println(f);

//        //The Math class
//        int result = (int)Math.round(1.1F);
//        int result1 = (int)Math.ceil(1.1F);
//        int result2 = (int)Math.floor(1.1F);
//        int result3 = Math.max(1,2);
//        double result4 = Math.random() * 100; //math random will always return decimal
//        int result5 = (int)Math.round(Math.random() * 100); //math round will round the random number
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);

//        //Formatting numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance(); //use this if currency formatting will be use by many variables
//        String result = currency.format(123098.241);
//        System.out.println(result);
//
//        String result1 = NumberFormat.getPercentInstance().format(0.0381); //use this if your want to only format a single variable
//        System.out.println(result1);

//        //Reading Input
//        Scanner scanner = new Scanner(System.in); //System.in is used to get user input from terminal
//        System.out.print("please input your age : ");
//        byte age = scanner.nextByte();
//        System.out.println("you are " + age + " years old");
//
//        System.out.print("input your name : ");
//        String name = scanner.next(); //use nextLine() to read 1 line
//        System.out.println("your name is " + name);
//
//        System.out.print("input your name : ");
//        String name1 = scanner.nextLine().trim(); //add .trim() to remove whitespaces
//        System.out.println("your name is " + name1);


    }
}