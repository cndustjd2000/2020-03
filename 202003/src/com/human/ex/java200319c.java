package com.human.ex;

public class java200319c {
	
	public static int total=0;//ex)total=아무 다른 class에서 사용 가능
	
	public static int add(int num1, int i) {
		int sum=num1+i;
		total=total+sum;
		return sum;
	}
	
	public static void main(String[] args) {
		
		//369게임  10에 만세
		
		
		for(int i=1;i<100;i++) {
			if(i%10==0) {
				System.out.println("만세");
				continue;
			}
			if(i>10 && i/10%10%3==0) {
				System.out.println("박수");
			}
			if(i%10%3==0) {
				System.out.println("박수");
			}else if(i>10 && i/10%10%3==0) {
				
			}else {
				System.out.println(i);
			}
		}
		
		
		System.out.println(total);
		System.out.println(java200319c.total);//이게 원래 맞는 표현
		
		int result=0;
		int num1=10;
		result=add(num1,30);
		System.out.println(result);
		
		System.out.println(java200319c.total);
		
		
		result=add(num1,40);
		System.out.println(result);
		
		System.out.println(java200319c.total);
		
		
		
	}



}