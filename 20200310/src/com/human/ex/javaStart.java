package com.human.ex;

public class javaStart {

	public static void main(String[] args) {
			
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String stringInput="";
		
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		int input=Integer.parseInt(sc.nextLine());
		
		while(!stringInput.equals("4")) {
			
			
			System.out.println("���Ḧ �����ϼ���.");
			System.out.println("1-���̴� 700, 2-�ݶ� 500, 3-ȯŸ 350, 4-��ȯ, 5-����");
			stringInput=sc.nextLine();
			
			switch(stringInput) {
				case "1":
					if(input>700) {
						System.out.println("���̴ٸ� �����Ͽ����ϴ�.");
						System.out.println("���� ���� �ݾ��� "+(input-700)+"�� �Դϴ�.");
						input=input-700;
						break;
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					break;
				case "2":
					if(input>500) {
						System.out.println("�ݶ� �����Ͽ����ϴ�.");
						System.out.println("���� ���� �ݾ��� "+(input-500)+"�� �Դϴ�.");
						input=input-500;
						break;
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					break;
				case "3":
					if(input>350) {
						System.out.println("ȯŸ�� �����Ͽ����ϴ�.");
						System.out.println("���� ���� �ݾ��� "+(input-350)+"�� �Դϴ�.");
						input=input-350;
						break;
					}else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				case "4":
					break;
				case "5":
					System.out.println("������ �ݾ��� �Է��ϼ���.");
					int input1=Integer.parseInt(sc.nextLine());
					input=input+input1;
					break;
			}
		
		}
		int A=input/1000;
		int B=(input%1000)/500;
		int C=(input%1000%500)/100;
		int D=(input%1000%500%100)/50;
		System.out.println("�ܾ��� õ�� "+A+"��, 500�� "+B+"��, 100�� "+C+"��, 50�� "+D+"�� �Դϴ�.");
	
		
	
	

		
		
		
	}

}
