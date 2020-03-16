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
		
		
		//1.1번
		int a=100;
		int b=10;
		int sum=a+b;
		
		//1.2번
		System.out.println("안녕하세요! JAVA를 즐깁시다.");
		
		//1.3번
		int a1=3124/1000;
		int b1=(3124/100)%10;
		int c1=(3124/10)%10;
		int d1=3124%10;
		
		System.out.println(a1+b1+c1+d1);
		
		//2.1번
		int sum1=0;
		
		for(int i=1;i<=100;i++) {
			sum1=sum1+i;
			System.out.println(sum1);
		}
		
		//2.2번
		int j=3;
		
		for(int i1=0;j>=i1;i1++) {
			System.out.println(i1+"*"+j+"="+i1*j);
		}
		
		//2.3번
		int arr[]= {2,5,3,9,8};
		
		//3.1번
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int max=0;
		
		for(int m=0; m<10; m++) {
			System.out.println("정수입력");
			int input=Integer.parseInt(sc.nextLine());
			if(max<input) {
				max=input;
			}
		}
		
		System.out.println("가장 큰 수는 "+max);
		
		//3.2번
		Car c=new Car();
		
		c.company="현대 자동차";
		c.model="그랜져";
		c.color="검정";
		c.maxspeed=350;
		
		System.out.println("제작회사 : "+c.company);
		System.out.println("모델명 : "+c.model);
		System.out.println("색깔 : "+c.color);
		System.out.println("최고속도 : "+c.maxspeed);
		System.out.println("현재속도 : "+c.speed);
		
		c.maxspeed=60;
		System.out.println("최고속도 : "+c.maxspeed);
		
		//3.3번
		for(int h=1;h<=100;h++) {
			if(h%4==0&&h%7==0) {
				System.out.println(h);
			}
		}
		
	}

}
