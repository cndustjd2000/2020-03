package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class java200323 {
	//p1
	public static int deckIndex=0;//���� ����� ī�� �ε���
	public static int p1Deck[]=new int[10];//p1�� ī����
	public static int p1Index=0;//p1 ī������ �ε���
	public static boolean p1Flag=true;//����ڰ� ī�带 ���� ������
	
	//p2
	public static int p2Deck[]=new int[10];//p2�� ī����
	public static int p2Index=0;//p2 ī������ �ε���
	public static boolean p2Flag=true;//����ڰ� ī�带 ���� ������
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void getP1Card() {
		if(p1Flag) {
			System.out.println("p1�� ī�带 �ްڽ��ϱ�? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//������ ī�带 �޴� �۾�
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
	}
	
	public static void getP2Card() {
		if(p2Flag) {
			System.out.println("p2�� ī�带 �ްڽ��ϱ�? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p2Flag=false;
			}
			if(p2Flag) {//������ ī�带 �޴� �۾�
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
				System.out.println("�� �÷��̾ ī�� ������ ���� �Ͽ����ϴ�.");
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
		System.out.println(">>ī�� ��Ȳ");
		deckDisplay(p1Deck,p1Index,"p1");
		System.out.println("p1 ����"+getSum(p1Deck,p1Index));
		deckDisplay(p2Deck,p2Index,"p2");
		System.out.println("p2����>>"+getSum(p2Deck,p2Index));
	}
	
	public static void deckDisplay() {
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1 : ");
		for(int i=0;i<p1Index;i++) {
			//ī�� ���
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//ī�� ����
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]);
		}
	}	
	
	public static void deckDisplay(int deck[], int index, String title) {
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print(title+":");
		for(int i=0;i<index;i++) {
			//ī�� ���
			int cardSIndex=deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//ī�� ����
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
			playState="p2 �¸�";
		}else if(p2>21) {
			playState="p1 �¸�";
		}else if(p1>p2) {
			playState="p1 �¸�";
		}else if(p2==p1) {
			playState="���º�";
		}else {
			playState="p2 �¸�";
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
				System.out.println("�� �÷��̾ ī�� ������ ���� �Ͽ����ϴ�.");
				break;
			}
			gameDisplay();
		}
		System.out.println("----------------");
		gameDisplay();
		System.out.println(whoIswin());*/
		//ī�����
		/*for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		createCard();
		*/
		
		
		//ī�弯��
		/*int rand;
		int temp;
		
		for(int i=0;i<10000;i++) {
			rand=rd.nextInt(52);
			temp=deck[0];
			deck[0]=deck[rand];
			deck[rand]=temp;
		}*/
		
		//ī��ޱ�
		/*int deckIndex=0;//���� ����� ī�� �ε���
		int p1Deck[]=new int[10];//p1�� ī����
		int p1Index=0;//p1 ī������ �ε���
		boolean p1Flag=true;//����ڰ� ī�带 ���� ������
		Scanner sc=new Scanner(System.in);
		
		
		if(p1Flag) {
			System.out.println("ī�带 �ްڽ��ϱ�? 0-No, 1-Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//������ ī�带 �޴� �۾�
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
		*/
		
		//ī�����
		/*String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1 : ");
		for(int i=0;i<p1Index;i++) {
			//ī�� ���
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//ī�� ����
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.println(cardNumber[cardNIndex]);
		}
		System.out.print("p2 : ");
		for(int i=0;i<p2Index;i++) {
			//ī�� ���
			int cardSIndex=p2Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]+",");
			//ī�� ����
			int cardNIndex=p2Deck[i]%cardNumber.length;
			System.out.println(cardNumber[cardNIndex]);
		}*/
		
	}



}