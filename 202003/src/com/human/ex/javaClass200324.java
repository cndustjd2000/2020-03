package com.human.ex;

class Cat123{
	public String name="�̸�";//�ν��Ͻ� �ʵ�
	public int age=0;
	//������ �޼ҵ� : �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ �ϴµ� ���
	//1. ���� ���� ����. 2.Ŭ���� ��� �̸��� �����ϴ�
	public Cat123() {
		System.out.println("�⺻������ �Լ� ����");
	}
	public Cat123(String name) {
		this(name,1);//�ٸ������� ȣ�� : ������ ù �ٿ����� ��밡��
	}	
	public Cat123(String name, int age) {
		//���� ã�� ���� 1.�������� 2.�ν��Ͻ� �ʵ� 3.Ŭ���� �ʵ�
		this.name=name;
		this.age=age;
	}
	//���� ������ : public, default, protected, private ��
	//��𼭵��� ��� ���� : public - 1.����Ŭ����, 2.�ٸ�Ŭ����, 3.����Package, 4.��ӹ��� Ŭ����
	//�ɹ� �޼ҵ�-�ν��Ͻ� �޼ҵ�
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
		System.out.println("���� : "+Sum);
		System.out.println("��� : "+Avr);
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
		c1.name="��1";
		c1.age=12;
		
		Cat123 c2=new Cat123();
		c2.name="��2";
		c2.age=13;
		
		Cat123 c3=new Cat123();
		c3.name="��3";
		c3.age=14;*/
		
		/*Cat123 c1=new Cat123("��1",12);
		c1.age=16;
		Cat123 c2=new Cat123("��2",13);
		Cat123 c3=new Cat123("��3",14);
		Cat123 c4=new Cat123();
		Cat123 c5=new Cat123("��5");
		
		
		c1.catAddAge(5);
		
		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();*/
		
		
		//����� ���̸� �Ű�������ŭ ������Ű�ų� ���ҽ�Ű�� �Լ��� ������.
		//catAddAge
	
		//�Լ��� ���
		/*catPrint(c1);
		catPrint(c2);
		catPrint(c3);*/
		
		
		//������ ���
		/*System.out.println(c1.name+", "+c1.age);
		System.out.println(c2.name+", "+c2.age);*/
		
		
		//�簢�� ���� ���ϴ� �޼ҵ带 ������ ��ü�� ����� �簢�� ���̸� ���϶�.Rectangle
		/*Rectangle r1=new Rectangle(20,30);
		
		int area=r1.area();
		System.out.println("�簢���� ���̴� : "+area);
		
		
		//������ ���� ��հ� ������ ����� �� �ִ� ��ü�� ������.Student
		Student s1=new Student();
		
		s1.kor(70); s1.eng(75); s1.mat(70);
		
		s1.Avr();
		
		
		s1.studentPrint();	*/	
		

		
		//�츮 �ֺ��� �ִ� �繰�� ��ü�� ����� ����ϴ� ���α׷��� ������
		//�ڵ���, TV, ���������� ������ �ϳ� �߰�
		
		//�ڵ�����ȣ, �̸�, ��ǰ��
		//��ȭ�ɱ�, �޼��� ������, �ڵ��� ���� ���
		//�޼���
		//���� �ڵ�����ȣ, ���� �ڵ��� ��ȣ, ���� �ż��� �ð�
		
		
		
		
		
		
		
	}
}