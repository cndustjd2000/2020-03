package com.human.ex;

import java.util.Arrays;

public class java200317 {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		java.util.Random ran=new java.util.Random();
		
		/*
		//5-1 최대값 최소값 구하기
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
		
		System.out.println("탐색할 값을 입력하세요.");
		int input=Integer.parseInt(sc.nextLine());
		
		input=(input/10)-2;
		
		System.out.println("탐색 성공 인덱스 : "+bArr[input]);
		
		//6페이지
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
		
		//7페이지
		int cArr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("이동을 원하는 숫자를 입력하세요.");
		int move=Integer.parseInt(sc.nextLine());
			
		for(int i=move;i<10;i++) {
			cArr[i-move]=cArr[i];
			//cArr[i]=0;
		}
		for(int i=10-move;i<10;i++) {
			cArr[i]=0;
		}
		System.out.println(Arrays.toString(cArr));
		
		//8페이지
		int a2Arr[]= {1,9,3,6,5,4,7,8,2,10};
		int b2Arr[]= {7,8,2,5,10,1,3,6,4,9};
		int c2Arr[]=new int[10];
		
		
		for(int i=0;i<10;i++) {
			c2Arr[i]=a2Arr[i]*b2Arr[i];
			System.out.print(c2Arr[i]+" ");
		}
		
		System.out.println("");
		
		//9페이지
		int sArr[]=new int[5];
		int highScore=0;
		System.out.println("점수를 입력하세요.");
		
		for(int i=0;i<5;i++) {
			int score=Integer.parseInt(sc.nextLine());
			sArr[i]=score;
			System.out.println((i+1)+" 번째 사람의 시험점수는 "+sArr[i]+"점 입니다.");	
			if(sArr[i]>highScore) {
				highScore=score;
			}
		}
		System.out.println(Arrays.toString(sArr));
		System.out.println("최고점수 : "+highScore);
		
		
		//10페이지
		int sArr1[]=new int[5];
		
		int count=0;
		
		System.out.println("점수를 입력하세요.");
		
		for(int i=0;i<5;i++) {
			int score=Integer.parseInt(sc.nextLine());
			sArr1[i]=score;
			if(sArr1[i]<score) {
				sArr1[i]=score;
			}
			System.out.println((i+1)+" 번째 사람의 시험점수는 "+sArr1[i]+"점 입니다.");
			if(sArr1[i]>70) {
				count++;
			}
		}
		System.out.println("70점 이상인 학생은 "+count+"명 입니다.");
		
		*/
		
		//11페이지
		
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
			System.out.println((i+1)+"번 학생 국어 성적 입력");
			double ko=Double.parseDouble(sc.nextLine());
			
			System.out.println((i+1)+"번 학생 영어 성적 입력");
			double eg=Double.parseDouble(sc.nextLine());
			
			System.out.println((i+1)+"번 학생 수학 성적 입력");
			double mt=Double.parseDouble(sc.nextLine());
			
			kor[i]=ko;
			eng[i]=eg;
			mat[i]=mt;
			
			korSum=korSum+ko; engSum=engSum+eg; matSum=matSum+mt;
			
		}
		
		korAvr=korSum/5; engAvr=engSum/5; matAvr=matSum/5;
		
		System.out.println("국어 총점 : "+korSum);
		System.out.println("영어 총점 : "+engSum);
		System.out.println("수학 총점 : "+matSum);
		
	}

}