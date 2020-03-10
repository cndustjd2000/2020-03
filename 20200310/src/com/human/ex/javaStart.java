package com.human.ex;

public class javaStart {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/*System.out.println("숫자를 입력하시오.");
		
		int input=Integer.parseInt(sc.nextLine());
		
		if(input>0){
			System.out.println("양수이다.");
		}else if(input==0){
			System.out.println("0과 같다.");
		}else{
			System.out.println("음수이다.");
		}*/
		
		
		int i=0;
		while(i<3) {
			System.out.println("안녕");
			i++;
		}
		
		
		
		
		int input=Integer.parseInt(sc.nextLine());
		
		for(int count=1;count<=input;count++) {
			System.out.println(count);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
