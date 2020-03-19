package com.human.ex;
class Cat{
	String name;
	int age;
}
public class java200319b {
	
	public static Cat catFunc(Cat c) {
		Cat rValue=c;
		rValue.age=rValue.age+1;
		return rValue;
	}
	
	public static Cat[] catArrFunc(Cat[] arr) {
		//Cat[] rArr=arr;
		Cat[] rArr=new Cat[2];
		rArr[0]=new Cat();
		rArr[0].name=arr[0].name;
		rArr[0].age=arr[0].age;
		
		rArr[1]=new Cat();
		rArr[1].name=arr[1].name;
		rArr[1].age=arr[1].age;
		
		rArr[1].age=6;
		return rArr;
	}
	public static void main(String[] args) {
		
		Cat cArr1[]=new Cat[2];
		Cat cArr2[];		
		
		cArr1[0]=new Cat();
		cArr1[0].name="°í1";
		cArr1[0].age=15;
		
		cArr1[1]=new Cat();
		cArr1[1].name="°í2";
		cArr1[1].age=16;
		
		cArr2=catArrFunc(cArr1);
		System.out.println(cArr1[1].age);
		System.out.println(cArr2[1].age);
		
		
		
		
		
		
		/*
		cArr2=cArr1;
		cArr2[1].age=6;
		System.out.println(cArr1[1].age);
		System.out.println(cArr2[1].age);
		*/
	}

}