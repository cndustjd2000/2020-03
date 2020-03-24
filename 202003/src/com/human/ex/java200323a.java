package com.human.ex;

import java.util.Scanner;

public class java200323a {
	
	public static Scanner sc=new Scanner(System.in);
	public static int acount=0;
	
	public static void menu() {
		System.out.println("1-입금, 2-출금, 3-조회, 4-종료");
		int stringInput=Integer.parseInt(sc.nextLine());	
		if(stringInput==1) {
			in();
		}else if(stringInput==2) {
			out();
		}else if(stringInput==3) {
			All();
		}else if(stringInput==4) {
			escape();
		}
		
	}
	
	
	public static void in() {
		System.out.println("입금할 금액을 입력하시오.");
		int in=Integer.parseInt(sc.nextLine());
		System.out.println("입금한 금액은 "+in+"원 입니다.");
		System.out.println("현재 남은 금액은 "+(acount+in)+"원 입니다.");
		acount=acount+in;
		menu();
	}
	
	public static void out() {
		System.out.println("출금할 금액을 입력하십시오.");
		int out=Integer.parseInt(sc.nextLine());
		if(out>acount) {
			System.out.println("잔액이 부족합니다.");
		}else if(out<acount){
			System.out.println("출금한 금액은 "+out+"원 입니다.");
			System.out.println("현재 남은 금액은 "+(acount-out)+"원 입니다.");
			acount=acount-out;
		}
		menu();
	}
	
	public static void All() {
		System.out.println("당신의 총 금액은 "+acount+"입니다.");
		menu();
	}
	
	public static void escape() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void main(String[] args) {
	
		menu();
		
	}
}