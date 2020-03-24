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
		System.out.println("안녕하세요.");
	}	
	public static int sumAll(int a,int b) {
		int sum=0;
		if(a>b) {
			int temp; temp=a; a=b; b=temp;//>>b가 큰수
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
	System.out.print("이름 : ");
	System.out.println(name);
	}

	public static void pnum(String pNum) {
	System.out.print("전화번호 : ");
	System.out.println(pNum);
	}

	public static void from(String from) {
	System.out.print("사는곳 : ");
	System.out.println(from);
	}
		
 	public static int sum1(int a,int b) {
	int sum=0;
	if(a>b) {
		int temp; temp=a; a=b; b=temp;//>>b가 큰수
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
		System.out.println("나이 : "+a+", 몸무게 : "+b+", 이름 : "+c);
	}
	public static int[] intArrFunc(int arr[]) {
		return arr;
		
	}
	/*public static int[] catobjectFunc(int arr[], String st) {
		System.out.println("나이 : "+arr[0]+"몸무게 : "+arr[1]+"이름 : "+st);
	}*/
	
	
	
	public static void main(String[] args) {
		//문제 1
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
		
		//문제2
		for(int i=0;i<3;i++) {
			hello();
		}
		
		//문제3
		int x=10, y=12;
		System.out.println(sumAll(a,b));
		System.out.println(sumAll(5,2));
		
		
		
		
		//문제1
		triangle1();
		triangle2();
		triangle3();
		
		//문제2
		card("홍길동","010-1234-5678","천안");
		
		//문제3
		System.out.println(sum1(1,10));
		
		//문제4
		System.out.println("월\t화\t수\t목\t금\t토\t일");
		System.out.println(month(31));
		
		//문제5
		int i=intFunc(3);
		double d=douFunc(5.3);
		String s=strFunc("고1");
		
		int intArrFunc[]= {a,(int)b};
		System.out.println(Arrays.toString(intArrFunc));
		
		catFunc(a,b,s);
		
		/*catobjectFunc(intArrFunc,s);*/
		
		//
		
		
		
		
		//메소드의 지역변수는 메소드가 실행되면 스택에 올라간다.
		//메소드간 지역변수는 공유가 안된다
		//메소드가 종료되면 메모리에서 사라진다
		//코드블럭 지역변수는 코드블럭에서만 존재하며 코드블럭이 종료되면 같이 사라진다.
		
		
		
		
		//함수는 선언부와 호출부로 나뉜다.
		//f(a,b)=2a*b 가 선언부이고, f(2,1)이 호출부가 된다.
		//return 다음에는 함수를 사용할 수 없다.
		
		//메소드에서 선언한 변수 : 스택에 저장
		
		
		//함수 안에서 다른함수를 부를 수 있다 
		//함수 안에서 자기함수를 부를 수 있다 : 재귀호출
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}