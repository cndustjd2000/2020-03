package com.human.ex;

import java.util.Arrays;

public class java200317 {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		java.util.Random ran=new java.util.Random();
		
		/*
		//5-1 �ִ밪 �ּҰ� ���ϱ�
		int mArr[]=new int[10];
		
		for(int i=0;i<10;i++) {
			mArr[i]=ran.nextInt(10);
		}
		
		//int max=Integer.MIN_VALUE;
		//int min=Integer.MAX_VALUE;
		//int max=-1;
		//int min=100;
		
		int max=mArr[0];
		int min=mArr[0];
		
		for(int i=0;i<10;i++) {
			if(max<mArr[i]) {
				max=mArr[i];
			}
			if(min>mArr[i]) {
				min=mArr[i];
			}
		}
		
		System.out.println(Arrays.toString(mArr));
		System.out.println(max);
		System.out.println(min);
		
		
		//5-2
	
		for(int i=0;i<10;i++){
			mArr[i]=mArr[i]*3;
		}
		int inputNum=6;
		
		for(int i=0;i<10;i++) {
			if(inputNum==mArr[i]) {
				System.out.println("index : "+i);
			}
		}
		
		System.out.println(Arrays.toString(mArr));
		System.out.println(max);
		System.out.println(min);
		
		//5-3
		int bArr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<bArr.length;i++) {
			System.out.print(bArr[i]*10+" ");
		}
		System.out.println("");
		
		System.out.println("Ž���� ���� �Է��ϼ���.");
		int input=Integer.parseInt(sc.nextLine());
		
		input=(input/10)-2;
		
		System.out.println("Ž�� ���� �ε��� : "+bArr[input]);
		
		//6������
		int iArr[]=new int[9];
		for(int i=0;i<9;i++) {
			iArr[i]=i%3+1;
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("");
		
		//6-1
		String aArr[]=new String[6];
		aArr[0]="A";
		aArr[1]="B";
		aArr[2]="C";
		aArr[3]=aArr[2];
		aArr[4]=aArr[1];
		aArr[5]=aArr[0];
		
		System.out.println(Arrays.toString(aArr));
		
		System.out.println("");
		
		//7-4
		int cArr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("�̵��� ���ϴ� ���ڸ� �Է��ϼ���.");
		int move=Integer.parseInt(sc.nextLine());
			
		for(int i=move;i<10;i++) {
			cArr[i-move]=cArr[i];
			//cArr[i]=0;
		}
		for(int i=10-move;i<10;i++) {
			cArr[i]=0;
		}
		System.out.println(Arrays.toString(cArr));
		
		//7������
		int a2Arr[]= {1,9,3,6,5,4,7,8,2,10};
		int b2Arr[]= {7,8,2,5,10,1,3,6,4,9};
		int c2Arr[]=new int[10];
		
		
		for(int i=0;i<10;i++) {
			c2Arr[i]=a2Arr[i]*b2Arr[i];
			System.out.print(c2Arr[i]+" ");
		}
		
		System.out.println("");
		
		//8������
		int sArr[]=new int[5];
		int highScore=0;
		System.out.println("������ �Է��ϼ���.");
		
		for(int i=0;i<5;i++) {
			int score=Integer.parseInt(sc.nextLine());
			sArr[i]=score;
			System.out.println((i+1)+" ��° ����� ���������� "+sArr[i]+"�� �Դϴ�.");	
			if(sArr[i]>highScore) {
				highScore=score;
			}
		}
		System.out.println(Arrays.toString(sArr));
		System.out.println("�ְ����� : "+highScore);
		
		
		//9-2
		int sArr1[]=new int[5];
		
		int count=0;
		
		System.out.println("������ �Է��ϼ���.");
		
		for(int i=0;i<5;i++) {
			int score=Integer.parseInt(sc.nextLine());
			sArr1[i]=score;
			if(sArr1[i]<score) {
				sArr1[i]=score;
			}
			System.out.println((i+1)+" ��° ����� ���������� "+sArr1[i]+"�� �Դϴ�.");
			if(sArr1[i]>70) {
				count++;
			}
		}
		System.out.println("70�� �̻��� �л��� "+count+"�� �Դϴ�.");
		
		
		
		//10-2
		
		double kor[]=new double[5];
		double eng[]=new double[5];
		double mat[]=new double[5];
		
		double korSum=0;
		double engSum=0;
		double matSum=0;
		
		double korAvr=0;
		double engAvr=0;
		double matAvr=0;
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"�� �л� ���� ���� �Է�");
			double ko=Double.parseDouble(sc.nextLine());
			
			System.out.println((i+1)+"�� �л� ���� ���� �Է�");
			double eg=Double.parseDouble(sc.nextLine());
			
			System.out.println((i+1)+"�� �л� ���� ���� �Է�");
			double mt=Double.parseDouble(sc.nextLine());
			
			kor[i]=ko;
			eng[i]=eg;
			mat[i]=mt;
			
			korSum=korSum+ko; engSum=engSum+eg; matSum=matSum+mt;
			
		}
		
		korAvr=korSum/5; engAvr=engSum/5; matAvr=matSum/5;
		
		System.out.println("���� ���� : "+korSum);
		System.out.println("���� ���� : "+engSum);
		System.out.println("���� ���� : "+matSum);
		
		//10-3
		System.out.println("�� �ڸ����� ������ �Է��Ͻÿ�.");
		int fo=Integer.parseInt(sc.nextLine());
		
		int a[]=new int[4];
		
		a[0]=fo/1000;
		a[1]=(fo%1000)/100;
		a[2]=(fo%100)/10;
		a[3]=fo%10;
		
		for(int i=0;i<4;i++) {
			System.out.println("a["+i+"]�� �� : "+a[i]);
		}
		System.out.println("������� : "+a[3]+a[2]+a[1]+a[0]);
		
		
		//11-1
		int student[]=new int[16];
		
		System.out.println("1-�⼮ �Է�. 2-�Ἦ�Է�. 3-�ʱ�ȭ. 4-�⼮���� ���. 5-���α׷� ����.");
		for(int i=0;i<student.length;i++) {
			
			System.out.println((i+1)+"��° ���ǿ� �⼮�ϼ̳���? <�⼮�� 1 ���, �Ἦ�� 0 ���>");
			int check=Integer.parseInt(sc.nextLine());
			
			switch(check) {
				case 1:
					student[i]=1;
					break;
				case 2:
					student[i]=0;
					break;
				case 3:
					System.out.println("��� �⼮-1 ��� �Ἦ-2");
					int all=Integer.parseInt(sc.nextLine());
					
					if(all==1) {
						for(i=0;i<student.length;i++) {
							student[i]=1;
						}
						if(all==2) {
							for(i=0;i<student.length;i++) {
								student[i]=0;
							}
						}
					}
					break;
				case 4:
					for(i=0;i<student.length;i++) {
						System.out.println(student[i]);
					}
					break;
				case 5:
					break;
			}
		}
		System.out.println(Arrays.toString(student));
		System.out.println("���α׷� ����");
		
		//12-3
		int lotto[]=new int[6];
		int lottoInput=0;
		for(int i=0;i<lotto.length;i++) {
			System.out.println("0~45�� �ζǹ�ȣ�� �Է��Ͻÿ�.");
			lottoInput=Integer.parseInt(sc.nextLine());
			lotto[i]=lottoInput;
			for(int i1=0;i1<i;i1++) {
				if(lotto[i1]==lotto[i]) {
					System.out.println("�ߺ��� �Է��Դϴ�. �ٸ� ���� �Է��Ͻÿ�.");
					lottoInput=Integer.parseInt(sc.nextLine());
					lotto[i]=lottoInput;
					i1=-1;
				}
			}
		}
		System.out.println("�Է��� ��ȣ : "+Arrays.toString(lotto));
		*/
		
		
		
	}

}