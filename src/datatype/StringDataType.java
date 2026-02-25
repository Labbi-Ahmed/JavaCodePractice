package datatype;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class StringDataType {
    public String string;

    Scanner sc = new Scanner(System.in);

    public void inputStringDataType(){
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
    }

    // test the string immutable
    public void  printStringDataType(){
        int len = string.length();
        System.out.println( "Enter any index between 0 and "+ (len - 1 ) +": ");
        int index;
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        StringBuilder sb = new StringBuilder(string);
        if(index >= 0 && index < len-1){
            sb.setCharAt(index ,'x' );
        }
        System.out.print( "Try modify string is : " + sb );
    }

    public void modifyString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = sc.nextLine();

        // 1. Show the "ID" of the original object
        System.out.println("Original Memory ID: " + System.identityHashCode(string));

        string += "hello"; // This creates a BRAND NEW object

        // 2. Show the "ID" of the modified object
        System.out.println("Modified Memory ID: " + System.identityHashCode(string));

        System.out.println("Modified string is: " + string);
    }

    public void charArrayAsStringDataType(){
        string = sc.nextLine();
        char[] charArray = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            charArray[i] = string.charAt(i);
        }
        charArray[0] = 'x';
        System.out.println("The output is " + (String.valueOf(charArray)));
    }

    public void demonstrateThreadSafety() throws InterruptedException {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        // Task: Add "A" 1,000 times
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                builder.append("A");
                buffer.append("A");
            }
        };

        // Create two threads doing the same task simultaneously
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        // Wait for both to finish
        thread1.join();
        thread2.join();

        System.out.println("Expected length: 2000");
        System.out.println("StringBuilder length: " + builder.length()); // Usually < 2000 (Data Lost!)
        System.out.println("StringBuffer length: " + buffer.length());   // Always 2000 (Safe)
    }

    public void stringMemoryReferenceDataType(){
        String str = "TEst";
        System.out.println("Original Memory ID: " + System.identityHashCode(str));
        String str2 = "TEst";
        System.out.println("New variable with same value Memory ID: " + System.identityHashCode(str2));
        str2 = str + "Hello";
        System.out.println("change Memory ID: " + System.identityHashCode(str2));
        System.out.println("Original Memory ID: " + System.identityHashCode(str));
    }


}
