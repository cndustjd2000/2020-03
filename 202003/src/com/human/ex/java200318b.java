package com.human.ex;

public class java200318b {
	
	public static void a() {
		System.out.println("a�Լ� ����");
		b();
		System.out.println("a�Լ� ����");
	}
	public static void b() {
		System.out.println("b�Լ� ����");
		System.out.println("b�Լ� ����");
	}
	public static void c() {
		System.out.println("c�Լ� ����");
		System.out.println("c�Լ� ����");
	}
	public static void d() {
		System.out.println("d�Լ� ����");
		b();
		System.out.println("d�Լ� ����");
	}
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//8������
		a();
		c();
		d();
		
		//9������
		System.out.print("�ϳ��� ���ڸ� �Է��ϼ���.");
		int input=Integer.parseInt(sc.nextLine());
		
		
	}
}