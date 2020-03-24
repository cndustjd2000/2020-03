package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class java200323 {
	//p1
	public static int deckIndex=0;//다음 사용할 카드 인덱스
	public static int p1Deck[]=new int[10];//p1의 카드목록
	public static int p1Index=0;//p1 카드목록의 인덱스
	public static boolean p1Flag=true;//사용자가 카드를 받을 것인지
	
	//p2
	public static int p2Deck[]=new int[10];//p2의 카드목록
	public static int p2Index=0;//p2 카드목록의 인덱스
	public static boolean p2Flag=true;//사용자가 카드를 받을 것인지
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void getP1Card() {
		if(p1Flag) {
			System.out.println("p1님 카드를 받겠습니까? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//실제로 카드를 받는 작업
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
	}
	
	public static void getP2Card() {
		if(p2Flag) {
			System.out.println("p2님 카드를 받겠습니까? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p2Flag=false;
			}
			if(p2Flag) {//실제로 카드를 받는 작업
				p2Deck[p2Index]=deck[deckIndex];
				deckIndex++;
				p2Index++;
			}
		}
	}
	
	public static int deck[]=new int[52];
	
	public static void gamePlay() {
		createDeck();
		mixDeck();
		for(int i=0;i<10;i++) {
			getP1Card();
			if(getSum(p1Deck,p1Index)>21) {
				break;
			};
			getP2Card();
			if(getSum(p2Deck,p2Index)>21){
				break;
			};
			if(p1Flag==false && p2Flag==false) {
				System.out.println("두 플레이어가 카드 수령을 중지 하였습니다.");
				break;
			}
			gameDisplay();
		}
		System.out.println("----------------");
		gameDisplay();
		System.out.println(whoIswin());
	}
	
	public static int getSum(int deck[],int index) {
		int sum=0;
		for(int i=0;i<index;i++) {
			int score=0;
			score=deck[i]%13+1;
			if(score>10) {
				score=10;
			}			
			sum=sum+score;
		}
		for(int i=0;i<index;i++) {
			if(deck[i]%13==0) {
				if(sum+10<=21) {
					sum=sum+10;	
				}
			}
		}
		return sum;
	}
	
	public static void gameDisplay() {
		System.out.println(">>카드 현황");
		deckDisplay(p1Deck,p1Index,"p1");
		System.out.println("p1 총점"+getSum(p1Deck,p1Index));
		deckDisplay(p2Deck,p2Index,"p2");
		System.out.println("p2총점>>"+getSum(p2Deck,p2Index));
	}
	
	public static void deckDisplay() {
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1 : ");
		for(int i=0;i<p1Index;i++) {
			//카드 모양
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//카드 숫자
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]);
		}
	}	
	
	public static void deckDisplay(int deck[], int index, String title) {
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print(title+":");
		for(int i=0;i<index;i++) {
			//카드 모양
			int cardSIndex=deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//카드 숫자
			int cardNIndex=deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]);
		}
		System.out.println();
	}
	
	public static String whoIswin() {
		int p1=getSum(p1Deck,p1Index);
		int p2=getSum(p2Deck,p2Index);
		
		String playState="";
		if(p1>21) {
			playState="p2 승리";
		}else if(p2>21) {
			playState="p1 승리";
		}else if(p1>p2) {
			playState="p1 승리";
		}else if(p2==p1) {
			playState="무승부";
		}else {
			playState="p2 승리";
		}
		return playState;
	}
	
 	public static void mixDeck() {
		Random rd=new Random();
		int rand;
		int temp;
				
		for(int i=0;i<10000;i++) {
			rand=rd.nextInt(52);
			temp=deck[0];
			deck[0]=deck[rand];
			deck[rand]=temp;
		}
	}
	
	public static void createDeck() {
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
	}
	
	public static void main(String[] args) {
		//int deck[]=new int[52];
				
		gamePlay();
		
		/*createDeck();
		mixDeck();
		for(int i=0;i<10;i++) {
			getP1Card();
			if(getSum(p1Deck,p1Index)>21) {
				break;
			};
			getP2Card();
			if(getSum(p2Deck,p2Index)>21){
				break;
			};
			if(p1Flag==false && p2Flag==false) {
				System.out.println("두 플레이어가 카드 수령을 중지 하였습니다.");
				break;
			}
			gameDisplay();
		}
		System.out.println("----------------");
		gameDisplay();
		System.out.println(whoIswin());*/
		//카드생성
		/*for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		createCard();
		*/
		
		
		//카드섞기
		/*int rand;
		int temp;
		
		for(int i=0;i<10000;i++) {
			rand=rd.nextInt(52);
			temp=deck[0];
			deck[0]=deck[rand];
			deck[rand]=temp;
		}*/
		
		//카드받기
		/*int deckIndex=0;//다음 사용할 카드 인덱스
		int p1Deck[]=new int[10];//p1의 카드목록
		int p1Index=0;//p1 카드목록의 인덱스
		boolean p1Flag=true;//사용자가 카드를 받을 것인지
		Scanner sc=new Scanner(System.in);
		
		
		if(p1Flag) {
			System.out.println("카드를 받겠습니까? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//실제로 카드를 받는 작업
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
		*/
		
		//카드출력
		/*String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1 : ");
		for(int i=0;i<p1Index;i++) {
			//카드 모양
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//카드 숫자
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.println(cardNumber[cardNIndex]);
		}
		System.out.print("p2 : ");
		for(int i=0;i<p2Index;i++) {
			//카드 모양
			int cardSIndex=p2Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//카드 숫자
			int cardNIndex=p2Deck[i]%cardNumber.length;
			System.out.println(cardNumber[cardNIndex]);
		}*/
		
	}



}