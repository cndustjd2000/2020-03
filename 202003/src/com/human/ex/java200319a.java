package com.human.ex;
class Cat1{
	String name;
	int age;
}
public class java200319a {
	
	public static Cat catFunc(Cat c) {
		Cat rValue=c;
		rValue.age=rValue.age+1;
		return rValue;
	}
	
	
	public static void main(String[] args) {
		
		Cat cat1=new Cat();
		cat1.name="go1";
		cat1.age=10;
		
		Cat cat2;
		cat2=catFunc(cat1);
		
		System.out.println(cat1.age);
		System.out.println(cat2.age);
		
		
		
		
		
		
	}

}