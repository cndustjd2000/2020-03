package com.human.ex;

class Car{
	public String company;
	public String model;
	public String color;
	public int maxspeed;
	public int speed;
	
	
}
public class java200310a {

	public static void main(String[] args) {
		
		
		//1.1��
		int a=100;
		int b=10;
		int sum=a+b;
		
		//1.2��
		System.out.println("�ȳ��ϼ���! JAVA�� ���ô�.");
		
		//1.3��
		int a1=3124/1000;
		int b1=(3124/100)%10;
		int c1=(3124/10)%10;
		int d1=3124%10;
		
		System.out.println(a1+b1+c1+d1);
		
		//2.1��
		int sum1=0;
		
		for(int i=1;i<=100;i++) {
			sum1=sum1+i;
			System.out.println(sum1);
		}
		
		//2.2��
		int j=3;
		
		for(int i1=0;j>=i1;i1++) {
			System.out.println(i1+"*"+j+"="+i1*j);
		}
		
		//2.3��
		int arr[]= {2,5,3,9,8};
		
		//3.1��
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int max=0;
		
		for(int m=0; m<10; m++) {
			System.out.println("�����Է�");
			int input=Integer.parseInt(sc.nextLine());
			if(max<input) {
				max=input;
			}
		}
		
		System.out.println("���� ū ���� "+max);
		
		//3.2��
		Car c=new Car();
		
		c.company="���� �ڵ���";
		c.model="�׷���";
		c.color="����";
		c.maxspeed=350;
		
		System.out.println("����ȸ�� : "+c.company);
		System.out.println("�𵨸� : "+c.model);
		System.out.println("���� : "+c.color);
		System.out.println("�ְ�ӵ� : "+c.maxspeed);
		System.out.println("����ӵ� : "+c.speed);
		
		c.maxspeed=60;
		System.out.println("�ְ�ӵ� : "+c.maxspeed);
		
		//3.3��
		for(int h=1;h<=100;h++) {
			if(h%4==0&&h%7==0) {
				System.out.println(h);
			}
		}
		
	}

}
