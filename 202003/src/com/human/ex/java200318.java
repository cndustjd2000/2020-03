package com.human.ex;

import java.util.Arrays;

public class java200318 {
	public static int sum(int a, int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	public static int min(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static void hello() {
		System.out.println("�ȳ��ϼ���.");
	}	
	public static int sumAll(int a,int b) {
		int sum=0;
		if(a>b) {
			int temp; temp=a; a=b; b=temp;//>>b�� ū��
		}
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}	
	public static void triangle1() {
		System.out.println("*");
	}
	public static void triangle2() {
		System.out.println("**");
	}
	public static void triangle3() {
		System.out.println("***");
	}
	public static void card(String name, String pNum, String from) {
	name(name);
	pnum(pNum);
	from(from);
	}

	public static void name(String name) {
	System.out.print("�̸� : ");
	System.out.println(name);
	}

	public static void pnum(String pNum) {
	System.out.print("��ȭ��ȣ : ");
	System.out.println(pNum);
	}

	public static void from(String from) {
	System.out.print("��°� : ");
	System.out.println(from);
	}
		
 	public static int sum1(int a,int b) {
	int sum=0;
	if(a>b) {
		int temp; temp=a; a=b; b=temp;//>>b�� ū��
		}
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}	
	public static int month(int a) {
		
		for(int i=1;i<31;i++) {
			if(i%7==1) {
				System.out.println("");
			}
		System.out.print(i+"\t");
		}
		return a;
	}

	
	public static int intFunc(int a) {
		return a;
	}
	
	public static double douFunc(double a) {
		return a;
	}
	
	public static String strFunc(String a) {
		return a;
	}
	
	
	
	public static void catFunc(int a, double b, String c) {
		System.out.println("���� : "+a+", ������ : "+b+", �̸� : "+c);
	}
	public static int[] intArrFunc(int arr[]) {
		return arr;
		
	}
	/*public static int[] catobjectFunc(int arr[], String st) {
		System.out.println("���� : "+arr[0]+"������ : "+arr[1]+"�̸� : "+st);
	}*/
	
	
	
	public static void main(String[] args) {
		//���� 1
		int a=sum(1,2);
		int b=a+sum(2,2);
		System.out.println(a+b);
		
		int a1=min(3,2);
		int b1=min(2,2);
		System.out.println(a1-b1);
		
		int a2=mul(1,1);
		int b2=mul(2,2);
		System.out.println(a2*b2);
		
		int a3=div(1,1);
		int b3=div(2,2);
		System.out.println(a3/b3);
		
		//����2
		for(int i=0;i<3;i++) {
			hello();
		}
		
		//����3
		int x=10, y=12;
		System.out.println(sumAll(a,b));
		System.out.println(sumAll(5,2));
		
		
		
		
		//����1
		triangle1();
		triangle2();
		triangle3();
		
		//����2
		card("ȫ�浿","010-1234-5678","õ��");
		
		//����3
		System.out.println(sum1(1,10));
		
		//����4
		System.out.println("��\tȭ\t��\t��\t��\t��\t��");
		System.out.println(month(31));
		
		//����5
		int i=intFunc(3);
		double d=douFunc(5.3);
		String s=strFunc("��1");
		
		int intArrFunc[]= {a,(int)b};
		System.out.println(Arrays.toString(intArrFunc));
		
		catFunc(a,b,s);
		
		/*catobjectFunc(intArrFunc,s);*/
		
		//
		
		
		
		
		//�޼ҵ��� ���������� �޼ҵ尡 ����Ǹ� ���ÿ� �ö󰣴�.
		//�޼ҵ尣 ���������� ������ �ȵȴ�
		//�޼ҵ尡 ����Ǹ� �޸𸮿��� �������
		//�ڵ�� ���������� �ڵ�������� �����ϸ� �ڵ���� ����Ǹ� ���� �������.
		
		
		
		
		//�Լ��� ����ο� ȣ��η� ������.
		//f(a,b)=2a*b �� ������̰�, f(2,1)�� ȣ��ΰ� �ȴ�.
		//return �������� �Լ��� ����� �� ����.
		
		//�޼ҵ忡�� ������ ���� : ���ÿ� ����
		
		
		//�Լ� �ȿ��� �ٸ��Լ��� �θ� �� �ִ� 
		//�Լ� �ȿ��� �ڱ��Լ��� �θ� �� �ִ� : ���ȣ��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}