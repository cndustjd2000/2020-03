package com.human.ex;

public class java200316 {

	public static void main(String[] args) {
		//���� �����
		
		java.util.Random ran=new java.util.Random();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//ī�� ����
		int deck[]=new int[52];
		
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		
		//ī�� ����
		for(int i=0;i<10000;i++) {
			int rNumber=ran.nextInt(52);
			int temp;
			
			temp=deck[0];
			deck[0]=deck[rNumber];
			deck[rNumber]=temp;
		}
		
		//ī�� ���
		for(int i:deck) {
			System.out.print("ī���� : "+cardShape[i/cardNumber.length]);
			System.out.println(", ī�� ���� : "+cardNumber[i%cardNumber.length]);
		}
		
		//ī�� �й�
		
		
		
		
		
		
		
	}

}
