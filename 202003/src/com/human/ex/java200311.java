package com.human.ex;

public class java200311 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		java.util.Random ran=new java.util.Random();
		/*
		//9-3번문제
		System.out.println("랜덤한 숫자를 입력하시오.");
		int input=Integer.parseInt(sc.nextLine());
		int sum=0;
		for(int i=1; i<=input; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	
		//9-5번 문제
		//둘다 i의 값이 2가 아니다.
		//만약 i 값이 2였다면 while문은 반복문 이지만 마지막 i=0;에서 반복하지 못하고 끝날것이다. 
		
		
		
		//9페이지 문제	
		String stringInput="";
		
		while(!stringInput.equals("2")) {
			System.out.println("선택하세요");
			System.out.println("1-인사말, 2-종료");
			stringInput=sc.nextLine();
			
			switch(stringInput) {
				case "1":
					System.out.println("안녕");
						break;
				case "2":
					break;
			}
		}System.out.println("반복을 종료 합니다.");
		
		int i=1;
		for(int i1=0; i<i1;i++) {
			System.out.println("종료를 입력하지 않으면 무한반복.");
			stringInput = sc.nextLine();
			if(stringInput.equals("종료")) {
				i=i+2;
			}
			i1++;
		}
		
		System.out.println("종료를 입력하지 않으면 무한반복.");
		String str=sc.nextLine();
		int i=0;
		while(i==0) {
			if(str.equals("종료")) {
				i=1;
				System.out.println("종료합니다.");
			}else {
				System.out.println("종료를 입력하지 않으면 무한반복.");
				str=sc.nextLine();
			}
		}
		
		
		
		
		
		
		//10-3번문제
		int a=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" 번째 정수를 입력하세요.");
			int b=Integer.parseInt(sc.nextLine());
			if(b<0) {
				b=-b;
			}
			a=a+b;
			
		}
		System.out.println("다섯 개 정수의 합은 : "+a);
		
		
		//11-4번문제
		
		System.out.println("정수를 입력하세요.");
		int a=Integer.parseInt(sc.nextLine());
		int a1=0, re=0;
		int sum=a-a1;
		
		while(!(sum<0)) {
			a=a-2;
			a1=a1+3;
			re=re+1;
			sum=a-a1;
		}
		System.out.println("a값은 : "+a+" b값은 : "+a1);
		System.out.println("반복한 횟수는 : "+re );
		
		
		
		
		
		
		
		//12-3번문제
		
		String menu="";
		
		double c1=0;
		double c2=0;
		
		while(!menu.equals("3")) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1-숫자입력, 2-연산선택, 3-종료");
			menu=sc.nextLine();
			
			
			switch(menu) {
				case "1":
					System.out.println("숫자를 입력하세요");
					double b1=Double.parseDouble(sc.nextLine());
					System.out.println("숫자를 입력하세요");
					double b2=Double.parseDouble(sc.nextLine());
					c1=b1;
					c2=b2;
						break;
				case "2":
					System.out.println("연산 선택(+,-,*,/)");
					String str1=sc.nextLine();
					switch(str1) {
						case "+":
							System.out.println("연산 : "+(c1+c2));
							break;
						case "-":
							System.out.println("연산 : "+(c1-c2));
							break;
						case "*":
							System.out.println("연산 : "+(c1*c2));
							break;
						case "/":
							System.out.println("연산 : "+(c1/c2));
							break;
						default:
							System.out.println("잘 못 입력 하셨습니다.");
							break;		
					}
					break;
				case "3":
					System.out.println("종료되었습니다. 감사합니다.");
					break;
				default:
					System.out.println("잘못된 입력");
				
			}
		
		}
		
		//13-4번문제
		
		//13-1번문제
		//정답은 10
		
		//13-2번문제
		//정답은 x가 100보다 작을 때
		
		//13-3번문제
		//정답은 break;
		
		//14-9번문제
		//문자열은 =이 아닌 .equals를 사용해야 한다.
		 
		//14페이지 문제
		
		java.util.Random ran=new java.util.Random();
		
		int count1=ran.nextInt(10);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("0부터 9까지의 숫자를 입력하시오.");
			int count=Integer.parseInt(sc.nextLine());
			
			System.out.println(i+"번째 도전 : "+count);
			
			if(count<count1) {
				System.out.println(count+"보다 큽니다");
			}else if(count>count1) {
				System.out.println(count+"보다 작습니다");			
			}else if(count==count1) {
				System.out.println("우와! 정확합니다."+i+"번째만에 맞췄군요");
				break;
			}
		}
		
		
		//15-1번 문제
		int sum=0;
		for(int i=1;i<10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//16-4번
		//a는 10번, b는 10번, c는 11번 반복된다.
		
		//17-1번 문제
		System.out.println("1~10사이의 짝수를 출력합니다.");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		//17-2번문제
		int stringInput=Integer.parseInt(null);
		int point1=0;
		
		System.out.println("시험점수를 입력하시오. 0이면 종료");
		while(!stringInput) {
		
			int point=Integer.parseInt(sc.nextLine());
		
			switch(point) {
				case 0:
					break;
				default:
					point1=point+point;
			}
		}System.out.println(point1);
		
		//18페이지 문제
		System.out.println("1부터 덧샘하는 프로그램 입니다.");
		System.out.println("마지막 값을 입력하세요");
		System.out.print("1부터 =>");
		int a=Integer.parseInt(sc.nextLine());
		int sum=0;
		System.out.println("1부터 "+a+"까지 덧샘합니다.");
		
		for(int i=1;i<=a;i++) {
			sum=sum+i;
			System.out.println("["+(i-1)+"행] TotalNumber의 값 : "+sum);
		}
		System.out.println("1부터 "+a+"까지의 총 합은 "+sum+"입니다");
		
		
		//19-2번문제
		System.out.print("몇번이나 반복할까요");
		int re=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=re;i++) {
			System.out.println("안녕하세요?");
		}
		
		//20-6번문제
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		
		//20-2번 문제
		/*System.out.println("첫 번째 수를 입력하세요.");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력하세요");
		int b=Integer.parseInt(sc.nextLine());
		int c=0;
		
		if(a>b) {
			c=a;
			a=b;
			b=c;
			c=0;
		}
		
		for(int i=a;i<=b;i++){
			c=c+i;
		}
		System.out.println("두 사이의 합은"+c);
		
		//21-3((((((((((((((((())))))))))))))))))
		
		System.out.println("하나의 숫자를 입력하세요.");
		int a=Integer.parseInt(sc.nextLine());
		
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				System.out.println(a+"는(은) 소수가 아닙니다.");
				break;
			}else{
				System.out.println(a+"는(은) 소수입니다.");
				break;
			}
		}
		
		
		//21-7
		for(int i=1; i<=100; i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
		
		//21-8
		System.out.print("시작정수 : ");
		int x=Integer.parseInt(sc.nextLine());
		System.out.print("종료정수 : ");
		int y=Integer.parseInt(sc.nextLine());
		int sum=0;
		
		for(int i=x;i<=y;i++) {
			sum=sum+i;
		}
		System.out.println("sum of "+x+" to "+y+" = "+sum);
		
		
		//22-4
		System.out.print("첫 번째 숫자 입력");
		int x=Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자 입력");
		int y=Integer.parseInt(sc.nextLine());
		int a=0;
		
		for(int i=1;i<=y;i++) {
			a=x*i;
			System.out.println(a);
		}
		
		//22-5
		//4번
		
		
		//23-6
		int j=7;
		
		for(int i1=1;i1<=10;i1++) {
			System.out.println(i1+"*"+j+"="+i1*j);
		}
		
		
		//23-9
		System.out.println("정수를 입력하시오");
		int w=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=w;i++) {
			if(w%i==0) {
				System.out.println(i);
			}
		}
		
		//23페이지
		
		System.out.println("1~1000 사이의 수 중에서 하나만 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		int sum=0;
		int b=0;
		for(int i=1;i<=1000;i++) {
			if(i%a==0) {
				sum=sum+i;
				b++;
			}
			
		}
		
		System.out.println("1~1000까지의 "+a+"의 배수의 개수 : "+b+", 배수의 합 : "+sum);
		
		//24페이지
		
		System.out.println("양수와 음수의 절댓값을 구하는 프로그램 입니다.");
		System.out.println("0을 누르면 종료가 됩니다.");
		int a=Integer.parseInt(sc.nextLine());
		
		if(a>0) {
			System.out.println("양수를 입력하셨습니다. 절댓값은 "+a+"입니다.");
		}else if(a<0) {
			System.out.println("음수를 입력하셨습니다. 절댓값은 "+(-a)+"입니다.");
		}else {
			System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		
		
		//24-10
		
		for(int i=0; i<=100; i+=10) {
			System.out.println("화씨온도 : "+i+"℉, 섭씨온도 : "+((i-32)*5/9)+"℃");
		}
		
		//25-12
		for(int i=1;i<=10;i++) {
			
			System.out.println("1~50까지 중의 데이터를 입력하시오.");
			int a=Integer.parseInt(sc.nextLine());
			String str="*";
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//25-14	
		
		System.out.println("n의 값을 입력하시오.");
		int n=Integer.parseInt(sc.nextLine());
		int sum=0;
		
		for(int a=1;a<=n;a++) {
			sum=sum+(a*a);
		}
		System.out.println("계산값은 "+sum+"입니다.");
		
		
		
		//26-16
		System.out.println("초기 연료량은 1000입니다.");
		int oil=1000;
		
		System.out.println("연료 충전 및 사용-1, 종료-2");
		int a=Integer.parseInt(sc.nextLine());
		
		while(a!=2) {
			if(oil<=10) {
				System.out.println("(경고) 연료가 10 이하 입니다.");
				break;
			}
			if(a==1) {
				System.out.println("연료 충전은 1, 연료 소모는 2를 입력하시요.");
				int i=Integer.parseInt(sc.nextLine());
				
				switch(i) {
					case 1:
						System.out.println("충전할 연료의 양을 입력하세요.");
						int plus=Integer.parseInt(sc.nextLine());
						System.out.println("현재 남아있는 연료의 양은 "+(oil=oil+plus)+"입니다.");
						break;
					case 2:
						System.out.println("소모한 연료의 양을 입력하세요.");
						int minus=Integer.parseInt(sc.nextLine());
						System.out.println("현재 남아있는 연료의 양은 "+(oil=oil-minus)+"입니다.");
						break;
				}
			}
		}
		System.out.println("종료합니다.");
		
		
		*/
		
		//26-17(((((((((((((())))))))))))))))
		System.out.println("하나의 숫자를 입력하세요.");
		int a=Integer.parseInt(sc.nextLine());
		
		boolean is=false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				is=false;
				break;
			}
		}
		
		if(is==true) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		
		
		/*
		//27-5
		for(int i=1; i<=1000; i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println("");
			}
		}
		
		
		
		//27-2
		int a=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		do {
			System.out.println("숫자를 입력하세요. 0입력시 종료");
			a=Integer.parseInt(sc.nextLine());
			if(a>max) {
				max=a;
			}else if(a==0) {
				break;
			}else if(a<min) {
				min=a;
			}
			
		}while(min!=0); 
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
		
		
		
		//28-3
		
		int [] arr = new int[100];
		arr[0] = 0;
		arr[1] = 1;
		for(int i =2; i<arr.length; i++) {
		arr[i] = arr[i-2]+arr[i-1];
		System.out.println(arr[i]);
		}
		
		 
		
		//28페이지
		
		int a=0, c=0;
		
		System.out.println("지그재그 숫자 출력 프로그램 입니다.");
		for(c=1;c<=5;c++) {
			if(c%2==0) {
				for(a=c*5;a>=(c*5)-4;a--) {
					System.out.print(a+"\t");
				}
				System.out.println("");
			}else {
				for(a=((c-1)*5+1);a<=((c-1)*5)+5;a++) {
					System.out.print(a+"\t");
				}
				System.out.println("");
			}
		}
		
		
		//30페이지((((()))))))))
		
		int start=1, end=31, day=0, date=0;
		
		for(day=0;day<=start;day++) {
			System.out.print("\t");
		}
		
		for(date=1;date<=end;date++) {
			if(day==7) {
				day=0;
				System.out.println("\t");
			}else {
				day++;
				System.out.print(date+"\t");
			}
		}
		
		
		//33-1
		//5번 : 들어갈 수 있다.
		
		//33-2
		//1,3,4번
		
		//33-3
		//0번
		
		//33-4 a : 0,3,6,9  b : 0,3,6,9  c : 0,2,4,8  d : 10,9,8,7,6,5,4,3,2,1,0
		//33-4~34 e : *모양 9개 출력  
		
		//34-5
		//(a)
		int i=10;
		
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		
		//(b)
		
		for(i=10;i>=0;i-=3) {
			System.out.println(i);
		}
		
		
		//34-6
		//(a)-8 (b)-9
		
		//34-7
		//(a)-변환 값이 없다. (b)-변환 값이 없다. (c)-무한루프 (d)-출력할 값을 지정하지 않음
		
		//35페이지
		System.out.println("동전던지기를 시작 합니다.");
		int a=ran.nextInt(2);
		if(a==0) {
			System.out.println("앞면입니다.");
		}else {
			System.out.println("뒷면입니다.");
		}
		
		//36페이지
		int count=0;
		int dice=ran.nextInt(6)+1;
		int input=0;
		while(!(dice==input)) {
			dice=ran.nextInt(6)+1;
			System.out.println("1~6까지의 숫자를 눌러주세요.");
			input=Integer.parseInt(sc.nextLine());
			if(input>6||input<0) {
				System.out.println("##1~6까지의 숫자를 눌러주세요. 횟수는 늘어나지 않습니다.");
			}else if(!(dice==input)) {
				System.out.println("실패! 주사위 : "+dice+" User : "+input+" 다시 시작합니다.");
				count++;
			}
		}
		System.out.println("주사위 숫자를 맞추셨습니다! ** 주사위 : "+dice+" User : "+input);
		System.out.println("반복횟수는 "+count+"회 입니다.");
		
		
		//37페이지
		System.out.println("산수 문제를 자동으로 출제합니다. 기회는 3번입니다.");
		int x=ran.nextInt()%100;
		int y=ran.nextInt()%100;
		
		int sum=0;
		sum=x+y;
		int input=0;
		
		for(int count=1;count<=3;count++) {
			x=ran.nextInt()%100;
			y=ran.nextInt()%100;
			sum=x+y;
			System.out.println(x+" + "+y+" = ");
			input=Integer.parseInt(sc.nextLine());
			if(sum==input) {
				System.out.println("맞았습니다.");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		System.out.println("종료합니다.");
		
		*/
		
		
		
		
	}

}
