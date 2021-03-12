package com;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];      
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
    	int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    int arr[] = new int[n]; 
	    for(int i = 0; i < n; i++)
	    {
	        arr[i] = s.nextInt();
	    } 
        Arrays.sort(arr);
        s.close();
        int length = arr.length;  
        length = removeDuplicateElements(arr, length); 
        int k[]=new int[length];
        for (int i=0; i<length; i++) {  
            k[i]=arr[i]; 
        } 
        for (int i=length-1; i>=0; i--) {
        	System.out.print(k[i]+" ");
        }
    }  
}  

