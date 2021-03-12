package com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class StringArray {
    public static void main(String[] args) {
    	int count;
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter number of strings: ");
        count = s.nextInt();
         
        String strArray[] = new String[count];
        Scanner s2 = new Scanner(System.in);
         
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            strArray[i] = s2.nextLine();
        }
        s.close();
        s2.close();

        strArray = Stream.of(strArray).sorted().toArray(String[]::new);
        int l=strArray.length;
        System.out.print("Strings in Sorted Order: " + Arrays.toString(strArray));
    }
}
