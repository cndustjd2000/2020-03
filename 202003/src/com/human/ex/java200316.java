package com.human.ex;

public class java200316 {

	public static void main(String[] args) {
		//블랙잭 만들기
		
		java.util.Random ran=new java.util.Random();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//카드 생성
		int deck[]=new int[52];
		
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		
		//카드 섞기
		for(int i=0;i<10000;i++) {
			int rNumber=ran.nextInt(52);
			int temp;
			
			temp=deck[0];
			deck[0]=deck[rNumber];
			deck[rNumber]=temp;
		}
		
		//카드 출력
		for(int i:deck) {
			System.out.print("카드모양 : "+cardShape[i/cardNumber.length]);
			System.out.println(", 카드 숫자 : "+cardNumber[i%cardNumber.length]);
		}
		
		//카드 분배
		
		
		
		
		
		
		
	}

}
