package com.human.ex;

public class java200319c {
	
	public static int total=0;//ex)total=�ƹ� �ٸ� class���� ��� ����
	
	public static int add(int num1, int i) {
		int sum=num1+i;
		total=total+sum;
		return sum;
	}
	
	public static void main(String[] args) {
		
		//369����  10�� ����
		
		
		for(int i=1;i<100;i++) {
			if(i%10==0) {
				System.out.println("����");
				continue;
			}
			if(i>10 && i/10%10%3==0) {
				System.out.println("�ڼ�");
			}
			if(i%10%3==0) {
				System.out.println("�ڼ�");
			}else if(i>10 && i/10%10%3==0) {
				
			}else {
				System.out.println(i);
			}
		}
		
		
		System.out.println(total);
		System.out.println(java200319c.total);//�̰� ���� �´� ǥ��
		
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