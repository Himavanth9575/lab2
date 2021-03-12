package com;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    int a[] = new int[n]; 
	    for(int i = 0; i < n; i++)
	    {
	        a[i] = s.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println(a[1]);
	    s.close();
	}
}