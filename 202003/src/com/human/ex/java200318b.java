package com.human.ex;

public class java200318b {
	
	public static void a() {
		System.out.println("a함수 시작");
		b();
		System.out.println("a함수 종료");
	}
	public static void b() {
		System.out.println("b함수 시작");
		System.out.println("b함수 종료");
	}
	public static void c() {
		System.out.println("c함수 시작");
		System.out.println("c함수 종료");
	}
	public static void d() {
		System.out.println("d함수 시작");
		b();
		System.out.println("d함수 종료");
	}
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//8페이지
		a();
		c();
		d();
		
		//9페이지
		System.out.print("하나의 숫자를 입력하세요.");
		int input=Integer.parseInt(sc.nextLine());
		
		
	}
}