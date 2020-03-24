package com.human.ex;


class phone{
	public String number;
	public String name;
	public String model;
	public String msg;
	public phone(String number,String name,String model) {
		this.number=number; this.name=name; this.model=model;
		System.out.println("핸드폰번호 : "+number+", 이름 : "+name+", 모델 : "+model);
	}
	public void call(phone a) {
		System.out.println(a.number);
		System.out.println(a.name+"에게 전화 연결 중..");
		System.out.println("전화 연결에 실패하였습니다. 남기실 문자를 입력하세요.");
	}
	public void sendmsg(phone p,String s) {
		p.msg=s;
		System.out.println(p.number);
		System.out.println(p.name+"에게 문자를 보냈습니다.");
	}
	public void checkmsg(phone p) {
		System.out.println(p.number);
		System.out.println(p.name+"에게서 온 문자메세지 입니다.");
		System.out.println(msg);
	}
	public void info() {
		System.out.println("핸드폰번호 : "+this.number+", 이름 : "+this.name+", 모델 : "+this.model);
	}	
}

class TV{
	public int size;
	public String model;
	public String name;
	public int year;
	public TV(int size, String model, String name) {
		this.size=size; this.model=model; this.name=name;
		System.out.println("사이즈 : "+size+", 모델 : "+model+", 이름 : "+name);
	}
	public void made(int a) {
		year=a;
		System.out.println(model+name+"의 생산년도 : "+year);
	}
	public void tvInfo() {
		System.out.println("사이즈 : "+this.size+", 모델 : "+this.model+", 이름 : "+this.name);
	}
}

class elevator{
	public int weight;
	public int people;
	public int floor;
	public elevator(int weight,int people, int floor) {
		this.weight=weight; this.people=people; this.floor=floor;
		System.out.println("엘리베이터 정보");
		System.out.println("무게 : "+weight+", 인원수 : "+people+", 층수 : "+floor);
	}
	public void move(int a) {
		floor=a;
		System.out.println("이동을 원하시는 층수는 "+floor+"층 입니다.");
	}	
}

class game{
	public String name;
	public String kind;
	public int pay;
	public game(String name, String kind, int pay) {
		this.name=name; this.kind=kind; this.pay=pay;
		System.out.println("게임정보");
		System.out.println("게임이름 : "+name+", 게임종류 : "+kind+", 가격 : "+pay);
	}
	public void gamePlay(int a) {
		System.out.println("선택한 게임의 이름 : "+this.name);
		System.out.println("플레이 한 시간 : "+a);
	}
}


public class javaClass200324a {	

	
	public static void main(String[] args) {
		
		

		
		//우리 주변에 있는 사물을 객체로 만들어 출력하는 프로그램을 만들어라
		//핸드폰, TV, 엘리베이터 본인이 하나 추가
		
		//핸드폰번호, 이름, 제품명
		//전화걸기, 메세지 보내기, 핸드폰 정보 출력
		//메세지
		//본인 핸드폰번호, 상대방 핸드폰 번호, 보낸 매세지 시간
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		phone p1=new phone("010-1234-5678","홍길동","아이폰");
		phone p2=new phone("010-8765-4321","김아무개","삼성");
		
		p1.call(p2);
		
		p1.sendmsg(p2,sc.nextLine());
		p2.checkmsg(p1);
		
		TV t1=new TV(70,"삼성","QLED");
		t1.made(2020);
		System.out.println("");
		TV t2=new TV(60,"LG","LED");
		t2.made(2019);
		
		System.out.println("");
		elevator e1=new elevator(2000,25,35);
		e1.move(20);
		
		System.out.println("");
		elevator e2=new elevator(2000,25,35);
		e2.move(30);
		
		System.out.println("");
		game g1=new game("OverWatch","FPS",35000);
		g1.gamePlay(5);
		
		System.out.println("");
		game g2=new game("League of legends","AOS",0);
		g2.gamePlay(7);
		
	}
}
