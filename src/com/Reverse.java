package com;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	static int Numrev(int num) {
		int reversed = 0;
	    for(;num != 0; num /= 10) {
	    	int digit = num % 10;
	        reversed = reversed * 10 + digit;
	    }
	    return reversed;
	}
	public static void main(String[] args) {
		int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    int a[] = new int[n]; 
	    for(int i = 0; i < n; i++)
	    {
	    	int k = s.nextInt();
	    	int j=Numrev(k);
	    	a[i]=j;
	    }
	    Arrays.sort(a);
	    s.close();
	    for(int i=0;i<n;i++) {
	    	System.out.print(a[i]+" ");
	    }
	}
}

