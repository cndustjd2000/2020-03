package com.human.ex;

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
	public static String triangle1(String t1) {
		t1="*";
		return t1;
	}
	public static String triangle2(String t2) {
		t2="**";
		return t2;
	}
	public static String triangle3(String t3) {
		t3="***";
		return t3;
	}
	public static String card1(String name) {
		name="ȫ�浿";
		return name;
	}
	public static int card2(int age) {
		age=23;
		return age;
	}
	public static String card3(String home) {
		home="õ��";
		return home;
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
		System.out.println(triangle1("*"));
		System.out.println(triangle2("**"));
		System.out.println(triangle3("***"));
		
		//����2
		System.out.println("�̸� : "+card1("��"));
		System.out.println("���� : "+card2(2));
		System.out.println("������ : "+card3("��"));		
		
		//����3
		System.out.println(sum1(1,10));
		
		//����4
		System.out.println(month(31));
		
		//����5
		
		
		
		
		
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