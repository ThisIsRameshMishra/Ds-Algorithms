package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       long n=sc.nextLong();
	       long m=sc.nextLong();
	       long a[]=new long[10000000];
	       long ans=0;
	       while(m-->0){
	           long sum=0;
	           long a1=sc.nextLong();
	           long b=sc.nextLong();
	           long k=sc.nextLong();
	           for(long i=a1;i<=b;i++){
	               a[(int) i]=a[(int) i]+k; 
	           }
	           long max=a[0];
	           for(long i=0;i<a.length;i++){
	               if(a[(int) i]>max){
	                   max=a[(int) i];
	               }
	           }
	           if(max>ans){
	               ans=max;
	           }
	           
	       }
	       System.out.println(ans);
	}
}
