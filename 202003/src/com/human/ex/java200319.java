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
		System.out.println("1�� �޴��� ���õǾ����ϴ�.");
		}
	public static void menu2() {
		System.out.println("2�� �޴��� ���õǾ����ϴ�.");
		}
	public static void menu3() {
		System.out.println("3�� �޴��� ���õǾ����ϴ�.");
		}
	public static void menu4() {
		System.out.println("�ý����� �����մϴ�.");
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
	System.out.println("���ݱ����� ������� "+money+"�Դϴ�.");
	}
	public static void draw(int amount) {
	money=money-amount;
	if(money<0) {
	System.out.println("�ܾ��� �����մϴ�.");
	}else {
	System.out.println("���ݱ����� �ܾ��� "+money+"�Դϴ�.");
	}

	}
	
	public static void main(String[] args) {
	
		//�Լ� overload override overloading overriding
		
		//overload �Ű������� �ٸ��� ���� �̸��� �Լ��� ���� �� �ִ�.
		//���� ������ ���谡 ����.
		//�Ű������� �ڵ� ����ȯ�� �Ǿ� ����.
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		

		//override ��Ӱ� ���õ� �޼ҵ� ������.
		
		
		//���� 5
		int sum=funcAll(10,20);
		double c=15.0;
		System.out.println(sum);
		System.out.println(funcAll(sum,c));
		
		String st1="�ȳ�";
		String st2="�ϼ���";
		funcAll(st1,st2);
	
		
		//���� 6
		System.out.println("���ϰ��� �ϴ� ������ �Է��Ͻÿ�");
		String shape=sc.nextLine();
		
		System.out.println("������ ũ�⸦ �Է��ϼ���, ���̶�� �������� �Է��ϼ���.");
		int wei=Integer.parseInt(sc.nextLine());
		
		System.out.println("������ ũ�⸦ �Է��ϼ���, ���̶�� �ƹ� ���ڸ� ��������.");
		int high=Integer.parseInt(sc.nextLine());
		
		int tri=tri(wei,high);
		int sqa=sqa(wei,high);
		double cic=cic(wei);
		
		switch(shape) {
			case "��":
				System.out.println(cic);
				break;
			case "�簢��":
				System.out.println(sqa);
				break;
			case "�ﰢ��":
				System.out.println(tri);
				break;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				break;
		}
		
		//10������
		System.out.println("���ϴ� �޴��� �����ϼ���.");
		System.out.println("1.�ܹ���, 2.ġ�����, 3.������ġ, 4.����");
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
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				break;
				
		}		
		
		//11������
		for(int i=0;i!=3;) {
			System.out.println("****������ ����****");
			System.out.println("1.���簢��, 2.��");
			System.out.println("******************");
			
			System.out.print("���̸� ���Ϸ��� ������ �����ϼ���(����:3)");
			int shapeInput=Integer.parseInt(sc.nextLine());
			
			switch(shapeInput) {
				case 1:
					System.out.println("���簢�� �� ���� ���̸� �Է��ϼ���.");
					int squInput=Integer.parseInt(sc.nextLine());
					
					System.out.println("���簢���� ���� : "+squre(squInput));
					continue;
				case 2:
					System.out.println("���� �������� �Է��ϼ���.");
					int cicInput=Integer.parseInt(sc.nextLine());
					
					System.out.println("���� ���� : "+cic(cicInput));
					continue;
				case 3:
					System.out.println("�ý����� �����մϴ�.");
					i=shapeInput;
					break;
				default:
					System.out.println("�� ���� �Է��Դϴ�. �ٽ� �Է��ϼ���");
					break;
			}
		}
		
		
		//12������
		System.out.print("¦���� �� : ");
		a1Num();
		System.out.print("");
		System.out.print("Ȧ���� �� : ");
		a2Num();
		
		
		//17������
		int input1=0;
		int save=0;
		int draw=0;
		
		while(!(input1==-1)){
			System.out.println("�޴��� �����ϼ��� 1.���� 2.��������(����� -1):");
			input1=Integer.parseInt(sc.nextLine());
			switch(input1) {
				case 1:
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				save=Integer.parseInt(sc.nextLine());
				save(save);
				break;
				case 2:
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				draw=Integer.parseInt(sc.nextLine());
				draw(draw);
				break;
			}

			}
			System.out.println("���α׷��� �����մϴ�.");
	}

}