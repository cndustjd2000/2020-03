package com.human.ex;

public class java200319 {
	
	public static int sum(int a, int b) {
		System.out.println("int+int");
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println("int+int+int");
		return a+b+c;
	}
	
	public static int sum(int a, double b) {
		System.out.println("int+double");
		return (int)(a+b);
	}
	
	
	
	
	
	
	public static double funAll(int a, double b) {
		System.out.println("int+double");
		return (int)(a+b);
	}
	
	public static String funAll(int a, String b) {
		System.out.println("int+String");
		return a+b;
	}
	
	public static String funAll(double a, String b) {
		System.out.println("double+String");
		return a+b;
	}
	
	public static int tri(int a, int b) {
		int sum=((a/2)*b);
		return sum;
	}
	
	public static int sqa(int a, int b) {
		return (a*b);
	}
	
	public static double cic(double a) {
		double sum=((a/2)*3.14);
		return sum;
	}  
	
	public static void main(String[] args) {
	
		//�Լ� overload override overloading overriding
		
		//overload �Ű������� �ٸ��� ���� �̸��� �Լ��� ���� �� �ִ�.
		//���� ������ ���谡 ����.
		//�Ű������� �ڵ� ����ȯ�� �Ǿ� ����.
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int a=sum(10,20);
		System.out.println(a);
		
		double b=10.0;
		System.out.println(sum(a,b));
		
		System.out.println(funAll(10,21.1));
		
		//override ��Ӱ� ���õ� �޼ҵ� ������.
		
		System.out.println(funAll(10.023,"�ȳ�"));
		
		System.out.println(cic(10));
		
		
		
		
	}

}