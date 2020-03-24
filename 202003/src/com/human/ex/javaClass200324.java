package com.human.ex;

class Cat123{
	public String name="이름";//인스턴스 필드
	public int age=0;
	//생성자 메소드 : 인스턴스 필드의 값을 초기화 하는데 사용
	//1. 리턴 값이 없다. 2.클래스 명과 이름이 동일하다
	public Cat123() {
		System.out.println("기본생성자 함수 실행");
	}
	public Cat123(String name) {
		this(name,1);//다른생성자 호출 : 무조건 첫 줄에서만 사용가능
	}	
	public Cat123(String name, int age) {
		//변수 찾는 순서 1.지역변수 2.인스턴스 필드 3.클래스 필드
		this.name=name;
		this.age=age;
	}
	//접근 제한자 : public, default, protected, private 등
	//어디서든지 사용 가능 : public - 1.같은클래스, 2.다른클래스, 3.같은Package, 4.상속받은 클래스
	//맴버 메소드-인스턴스 메소드
	public void catPrint() {
		System.out.println(name+", "+age);
	}
	public void catAddAge(int a) {
		age=age+a;
	}
}

class Rectangle{
	public int width=0;
	public int height=0;
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int area() {
		return width*height;
	}
}

class Student{
	public double Sum;
	public double Avr;	
	public void studentPrint() {
		System.out.println("총점 : "+Sum);
		System.out.println("평균 : "+Avr);
	}	
	public void kor(int a) {
		Sum=Sum+a;
	}
	public void eng(int a) {
		Sum=Sum+a;
	}
	public void mat(int a) {
		Sum=Sum+a;
	}
	public void Avr() {
		Avr=Sum/3;
	}
}

public class javaClass200324 {	
	
	public static void catPrint(Cat123 c) {
		System.out.println(c.name+", "+c.age);
	}
	
	
	
	public static void main(String[] args) {
		
		/*Cat123 c1=new Cat123();
		c1.name="고1";
		c1.age=12;
		
		Cat123 c2=new Cat123();
		c2.name="고2";
		c2.age=13;
		
		Cat123 c3=new Cat123();
		c3.name="고3";
		c3.age=14;*/
		
		/*Cat123 c1=new Cat123("고1",12);
		c1.age=16;
		Cat123 c2=new Cat123("고2",13);
		Cat123 c3=new Cat123("고3",14);
		Cat123 c4=new Cat123();
		Cat123 c5=new Cat123("고5");
		
		
		c1.catAddAge(5);
		
		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();*/
		
		
		//고양이 나이를 매개변수만큼 증가시키거나 감소시키는 함수를 만들어보자.
		//catAddAge
	
		//함수적 방식
		/*catPrint(c1);
		catPrint(c2);
		catPrint(c3);*/
		
		
		//절차적 방식
		/*System.out.println(c1.name+", "+c1.age);
		System.out.println(c2.name+", "+c2.age);*/
		
		
		//사각형 넓이 구하는 메소드를 포함한 객체를 만들어 사각형 넓이를 구하라.Rectangle
		/*Rectangle r1=new Rectangle(20,30);
		
		int area=r1.area();
		System.out.println("사각형의 넓이는 : "+area);
		
		
		//국영수 과목 평균과 총점을 출력할 수 있는 객체를 만들어라.Student
		Student s1=new Student();
		
		s1.kor(70); s1.eng(75); s1.mat(70);
		
		s1.Avr();
		
		
		s1.studentPrint();	*/	
		

		
		//우리 주변에 있는 사물을 객체로 만들어 출력하는 프로그램을 만들어라
		//핸드폰, TV, 엘리베이터 본인이 하나 추가
		
		//핸드폰번호, 이름, 제품명
		//전화걸기, 메세지 보내기, 핸드폰 정보 출력
		//메세지
		//본인 핸드폰번호, 상대방 핸드폰 번호, 보낸 매세지 시간
		
		
		
		
		
		
		
	}
}