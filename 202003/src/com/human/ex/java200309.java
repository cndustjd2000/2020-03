package com.human.ex;

public class java200309 {

	public static void main(String[] args) {
		/*
		int sum=0;
		for(int i=2; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		*/
		
		
		/*
		int sum=0;
		int i=2;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		*/
		
		
		/*
		int sum=0;
		int i=2;
		do {
			sum=sum+i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		*/
		
		/*for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		/*int num1=Integer.parseInt(sc.nextLine());
		int num2=Integer.parseInt(sc.nextLine());
		
		String op=sc.nextLine();
		
		int result=0;
		
		switch(op) {
			case "*":
				result=num1*num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "/":
				result=num1/num2;
				break;
			case "+":
				result=num1+num2;
				break;
			default:
				break;
		}
		
		
		
		
		
		System.out.println(result);*/
		
		
		
		int [] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		for(int i =2; i<arr.length; i++) {
		arr[i] = arr[i-2]+arr[i-1];
		System.out.println( arr[i]);
		}

	}

}
