package com.human.ex;


class phone{
	public String number;
	public String name;
	public String model;
	public String msg;
	public phone(String number,String name,String model) {
		this.number=number; this.name=name; this.model=model;
		System.out.println("�ڵ�����ȣ : "+number+", �̸� : "+name+", �� : "+model);
	}
	public void call(phone a) {
		System.out.println(a.number);
		System.out.println(a.name+"���� ��ȭ ���� ��..");
		System.out.println("��ȭ ���ῡ �����Ͽ����ϴ�. ����� ���ڸ� �Է��ϼ���.");
	}
	public void sendmsg(phone p,String s) {
		p.msg=s;
		System.out.println(p.number);
		System.out.println(p.name+"���� ���ڸ� ���½��ϴ�.");
	}
	public void checkmsg(phone p) {
		System.out.println(p.number);
		System.out.println(p.name+"���Լ� �� ���ڸ޼��� �Դϴ�.");
		System.out.println(msg);
	}
	public void info() {
		System.out.println("�ڵ�����ȣ : "+this.number+", �̸� : "+this.name+", �� : "+this.model);
	}	
}

class TV{
	public int size;
	public String model;
	public String name;
	public int year;
	public TV(int size, String model, String name) {
		this.size=size; this.model=model; this.name=name;
		System.out.println("������ : "+size+", �� : "+model+", �̸� : "+name);
	}
	public void made(int a) {
		year=a;
		System.out.println(model+name+"�� ����⵵ : "+year);
	}
	public void tvInfo() {
		System.out.println("������ : "+this.size+", �� : "+this.model+", �̸� : "+this.name);
	}
}

class elevator{
	public int weight;
	public int people;
	public int floor;
	public elevator(int weight,int people, int floor) {
		this.weight=weight; this.people=people; this.floor=floor;
		System.out.println("���������� ����");
		System.out.println("���� : "+weight+", �ο��� : "+people+", ���� : "+floor);
	}
	public void move(int a) {
		floor=a;
		System.out.println("�̵��� ���Ͻô� ������ "+floor+"�� �Դϴ�.");
	}	
}

class game{
	public String name;
	public String kind;
	public int pay;
	public game(String name, String kind, int pay) {
		this.name=name; this.kind=kind; this.pay=pay;
		System.out.println("��������");
		System.out.println("�����̸� : "+name+", �������� : "+kind+", ���� : "+pay);
	}
	public void gamePlay(int a) {
		System.out.println("������ ������ �̸� : "+this.name);
		System.out.println("�÷��� �� �ð� : "+a);
	}
}


public class javaClass200324a {	

	
	public static void main(String[] args) {
		
		

		
		//�츮 �ֺ��� �ִ� �繰�� ��ü�� ����� ����ϴ� ���α׷��� ������
		//�ڵ���, TV, ���������� ������ �ϳ� �߰�
		
		//�ڵ�����ȣ, �̸�, ��ǰ��
		//��ȭ�ɱ�, �޼��� ������, �ڵ��� ���� ���
		//�޼���
		//���� �ڵ�����ȣ, ���� �ڵ��� ��ȣ, ���� �ż��� �ð�
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/*phone p1=new phone("010-1234-5678","ȫ�浿","������");
		phone p2=new phone("010-8765-4321","��ƹ���","�Ｚ");
		
		p1.call(p2);
		
		p1.sendmsg(p2,sc.nextLine());
		p2.checkmsg(p1);*/
		
		TV t1=new TV(70,"�Ｚ","QLED");
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