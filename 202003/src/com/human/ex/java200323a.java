package com.human.ex;

import java.util.Scanner;

public class java200323a {
	
	public static Scanner sc=new Scanner(System.in);
	public static int acount=0;
	
	public static void menu() {
		System.out.println("1-�Ա�, 2-���, 3-��ȸ, 4-����");
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
		System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�.");
		int in=Integer.parseInt(sc.nextLine());
		System.out.println("�Ա��� �ݾ��� "+in+"�� �Դϴ�.");
		System.out.println("���� ���� �ݾ��� "+(acount+in)+"�� �Դϴ�.");
		acount=acount+in;
		menu();
	}
	
	public static void out() {
		System.out.println("����� �ݾ��� �Է��Ͻʽÿ�.");
		int out=Integer.parseInt(sc.nextLine());
		if(out>acount) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else if(out<acount){
			System.out.println("����� �ݾ��� "+out+"�� �Դϴ�.");
			System.out.println("���� ���� �ݾ��� "+(acount-out)+"�� �Դϴ�.");
			acount=acount-out;
		}
		menu();
	}
	
	public static void All() {
		System.out.println("����� �� �ݾ��� "+acount+"�Դϴ�.");
		menu();
	}
	
	public static void escape() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public static void main(String[] args) {
	
		menu();
		
	}
}