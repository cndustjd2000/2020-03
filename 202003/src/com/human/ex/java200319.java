package com.human.ex;

public class java200319 {
	
	public static int funcAll(int a, int b) {
		System.out.println("int+int");
		return a+b;
	}
	public static int funcAll(int a, double b) {
		System.out.println("int+double");
		return (int)(a+b);
	}
	public static void funcAll(String a, String b) {
		System.out.println(a+b);
	}
	
	public static double cic(double a) {
		double sum=a*3.14;	
		return sum;
	}
	public static int sqa(int a, int b) {
		int sum=(a*b);
		return sum;
	}
	public static int tri(int a, int b) {
		int sum=((a/2)*b);
		return sum;
	}
	
	public static void menu1() {
		System.out.println("1번 메뉴가 선택되었습니다.");
		}
	public static void menu2() {
		System.out.println("2번 메뉴가 선택되었습니다.");
		}
	public static void menu3() {
		System.out.println("3번 메뉴가 선택되었습니다.");
		}
	public static void menu4() {
		System.out.println("시스템을 종료합니다.");
		}
	
	public static int squre(int a) {
		return a*a;
	}
	
	public static void a1Num() {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	public static void a2Num() {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static int money=0;
	public static void save(int amount) {
	money=money+amount;
	System.out.println("지금까지의 저축액은 "+money+"입니다.");
	}
	public static void draw(int amount) {
	money=money-amount;
	if(money<0) {
	System.out.println("잔액이 부족합니다.");
	}else {
	System.out.println("지금까지의 잔액은 "+money+"입니다.");
	}

	}
	
	public static void main(String[] args) {
	
		//함수 overload override overloading overriding
		
		//overload 매개변수가 다르면 같은 이름의 함수를 만들 수 있다.
		//리턴 값과는 관계가 없다.
		//매개변수도 자동 형변환이 되어 들어간다.
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		

		//override 상속과 관련된 메소드 재정의.
		
		
		//문제 5
		int sum=funcAll(10,20);
		double c=15.0;
		System.out.println(sum);
		System.out.println(funcAll(sum,c));
		
		String st1="안녕";
		String st2="하세요";
		funcAll(st1,st2);
	
		
		//문제 6
		System.out.println("구하고자 하는 도형을 입력하시오");
		String shape=sc.nextLine();
		
		System.out.println("가로의 크기를 입력하세요, 원이라면 반지름을 입력하세요.");
		int wei=Integer.parseInt(sc.nextLine());
		
		System.out.println("세로의 크기를 입력하세요, 원이라면 아무 숫자를 누르세요.");
		int high=Integer.parseInt(sc.nextLine());
		
		int tri=tri(wei,high);
		int sqa=sqa(wei,high);
		double cic=cic(wei);
		
		switch(shape) {
			case "원":
				System.out.println(cic);
				break;
			case "사각형":
				System.out.println(sqa);
				break;
			case "삼각형":
				System.out.println(tri);
				break;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
		}
		
		//10페이지
		System.out.println("원하는 메뉴를 선택하세요.");
		System.out.println("1.햄버거, 2.치즈버거, 3.샌드위치, 4.종료");
		int input=Integer.parseInt(sc.nextLine());
		
		switch(input) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				menu3();
				break;
			case 4:
				menu4();
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
				
		}		
		
		//11페이지
		for(int i=0;i!=3;) {
			System.out.println("****도형의 넓이****");
			System.out.println("1.정사각형, 2.원");
			System.out.println("******************");
			
			System.out.print("넓이를 구하려는 도형을 선택하세요(종료:3)");
			int shapeInput=Integer.parseInt(sc.nextLine());
			
			switch(shapeInput) {
				case 1:
					System.out.println("정사각형 한 변의 길이를 입력하세요.");
					int squInput=Integer.parseInt(sc.nextLine());
					
					System.out.println("정사각형의 넓이 : "+squre(squInput));
					continue;
				case 2:
					System.out.println("원의 반지름을 입력하세요.");
					int cicInput=Integer.parseInt(sc.nextLine());
					
					System.out.println("원의 넓이 : "+cic(cicInput));
					continue;
				case 3:
					System.out.println("시스템을 종료합니다.");
					i=shapeInput;
					break;
				default:
					System.out.println("잘 못된 입력입니다. 다시 입력하세요");
					break;
			}
		}
		
		
		//12페이지
		System.out.print("짝수의 합 : ");
		a1Num();
		System.out.print("");
		System.out.print("홀수의 합 : ");
		a2Num();
		
		
		//17페이지
		int input1=0;
		int save=0;
		int draw=0;
		
		while(!(input1==-1)){
			System.out.println("메뉴를 선택하세요 1.저축 2.예금인출(종료는 -1):");
			input1=Integer.parseInt(sc.nextLine());
			switch(input1) {
				case 1:
				System.out.println("얼마를 저축하시겠습니까?");
				save=Integer.parseInt(sc.nextLine());
				save(save);
				break;
				case 2:
				System.out.println("얼마를 인출하시겠습니까?");
				draw=Integer.parseInt(sc.nextLine());
				draw(draw);
				break;
			}

			}
			System.out.println("프로그램을 종료합니다.");
	}

}