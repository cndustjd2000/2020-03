package com.human.ex;

public class java200311 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		java.util.Random ran=new java.util.Random();
		/*
		//9-3������
		System.out.println("������ ���ڸ� �Է��Ͻÿ�.");
		int input=Integer.parseInt(sc.nextLine());
		int sum=0;
		for(int i=1; i<=input; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	
		//9-5�� ����
		//�Ѵ� i�� ���� 2�� �ƴϴ�.
		//���� i ���� 2���ٸ� while���� �ݺ��� ������ ������ i=0;���� �ݺ����� ���ϰ� �������̴�. 
		
		
		
		//9������ ����	
		String stringInput="";
		
		while(!stringInput.equals("2")) {
			System.out.println("�����ϼ���");
			System.out.println("1-�λ縻, 2-����");
			stringInput=sc.nextLine();
			
			switch(stringInput) {
				case "1":
					System.out.println("�ȳ�");
						break;
				case "2":
					break;
			}
		}System.out.println("�ݺ��� ���� �մϴ�.");
		
		int i=1;
		for(int i1=0; i<i1;i++) {
			System.out.println("���Ḧ �Է����� ������ ���ѹݺ�.");
			stringInput = sc.nextLine();
			if(stringInput.equals("����")) {
				i=i+2;
			}
			i1++;
		}
		
		System.out.println("���Ḧ �Է����� ������ ���ѹݺ�.");
		String str=sc.nextLine();
		int i=0;
		while(i==0) {
			if(str.equals("����")) {
				i=1;
				System.out.println("�����մϴ�.");
			}else {
				System.out.println("���Ḧ �Է����� ������ ���ѹݺ�.");
				str=sc.nextLine();
			}
		}
		
		
		
		
		
		
		//10-3������
		int a=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" ��° ������ �Է��ϼ���.");
			int b=Integer.parseInt(sc.nextLine());
			if(b<0) {
				b=-b;
			}
			a=a+b;
			
		}
		System.out.println("�ټ� �� ������ ���� : "+a);
		
		
		//11-4������
		
		System.out.println("������ �Է��ϼ���.");
		int a=Integer.parseInt(sc.nextLine());
		int a1=0, re=0;
		int sum=a-a1;
		
		while(!(sum<0)) {
			a=a-2;
			a1=a1+3;
			re=re+1;
			sum=a-a1;
		}
		System.out.println("a���� : "+a+" b���� : "+a1);
		System.out.println("�ݺ��� Ƚ���� : "+re );
		
		
		
		
		
		
		
		//12-3������
		
		String menu="";
		
		double c1=0;
		double c2=0;
		
		while(!menu.equals("3")) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1-�����Է�, 2-���꼱��, 3-����");
			menu=sc.nextLine();
			
			
			switch(menu) {
				case "1":
					System.out.println("���ڸ� �Է��ϼ���");
					double b1=Double.parseDouble(sc.nextLine());
					System.out.println("���ڸ� �Է��ϼ���");
					double b2=Double.parseDouble(sc.nextLine());
					c1=b1;
					c2=b2;
						break;
				case "2":
					System.out.println("���� ����(+,-,*,/)");
					String str1=sc.nextLine();
					switch(str1) {
						case "+":
							System.out.println("���� : "+(c1+c2));
							break;
						case "-":
							System.out.println("���� : "+(c1-c2));
							break;
						case "*":
							System.out.println("���� : "+(c1*c2));
							break;
						case "/":
							System.out.println("���� : "+(c1/c2));
							break;
						default:
							System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
							break;		
					}
					break;
				case "3":
					System.out.println("����Ǿ����ϴ�. �����մϴ�.");
					break;
				default:
					System.out.println("�߸��� �Է�");
				
			}
		
		}
		
		//13-4������
		
		//13-1������
		//������ 10
		
		//13-2������
		//������ x�� 100���� ���� ��
		
		//13-3������
		//������ break;
		
		//14-9������
		//���ڿ��� =�� �ƴ� .equals�� ����ؾ� �Ѵ�.
		 
		//14������ ����
		
		java.util.Random ran=new java.util.Random();
		
		int count1=ran.nextInt(10);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("0���� 9������ ���ڸ� �Է��Ͻÿ�.");
			int count=Integer.parseInt(sc.nextLine());
			
			System.out.println(i+"��° ���� : "+count);
			
			if(count<count1) {
				System.out.println(count+"���� Ů�ϴ�");
			}else if(count>count1) {
				System.out.println(count+"���� �۽��ϴ�");			
			}else if(count==count1) {
				System.out.println("���! ��Ȯ�մϴ�."+i+"��°���� ���豺��");
				break;
			}
		}
		
		
		//15-1�� ����
		int sum=0;
		for(int i=1;i<10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//16-4��
		//a�� 10��, b�� 10��, c�� 11�� �ݺ��ȴ�.
		
		//17-1�� ����
		System.out.println("1~10������ ¦���� ����մϴ�.");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		//17-2������
		int stringInput=Integer.parseInt(null);
		int point1=0;
		
		System.out.println("���������� �Է��Ͻÿ�. 0�̸� ����");
		while(!stringInput) {
		
			int point=Integer.parseInt(sc.nextLine());
		
			switch(point) {
				case 0:
					break;
				default:
					point1=point+point;
			}
		}System.out.println(point1);
		
		//18������ ����
		System.out.println("1���� �����ϴ� ���α׷� �Դϴ�.");
		System.out.println("������ ���� �Է��ϼ���");
		System.out.print("1���� =>");
		int a=Integer.parseInt(sc.nextLine());
		int sum=0;
		System.out.println("1���� "+a+"���� �����մϴ�.");
		
		for(int i=1;i<=a;i++) {
			sum=sum+i;
			System.out.println("["+(i-1)+"��] TotalNumber�� �� : "+sum);
		}
		System.out.println("1���� "+a+"������ �� ���� "+sum+"�Դϴ�");
		
		
		//19-2������
		System.out.print("����̳� �ݺ��ұ��");
		int re=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=re;i++) {
			System.out.println("�ȳ��ϼ���?");
		}
		
		//20-6������
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		
		//20-2�� ����
		/*System.out.println("ù ��° ���� �Է��ϼ���.");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���");
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
		System.out.println("�� ������ ����"+c);
		
		//21-3((((((((((((((((())))))))))))))))))
		
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���.");
		int a=Integer.parseInt(sc.nextLine());
		
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				System.out.println(a+"��(��) �Ҽ��� �ƴմϴ�.");
				break;
			}else{
				System.out.println(a+"��(��) �Ҽ��Դϴ�.");
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
		System.out.print("�������� : ");
		int x=Integer.parseInt(sc.nextLine());
		System.out.print("�������� : ");
		int y=Integer.parseInt(sc.nextLine());
		int sum=0;
		
		for(int i=x;i<=y;i++) {
			sum=sum+i;
		}
		System.out.println("sum of "+x+" to "+y+" = "+sum);
		
		
		//22-4
		System.out.print("ù ��° ���� �Է�");
		int x=Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ���� �Է�");
		int y=Integer.parseInt(sc.nextLine());
		int a=0;
		
		for(int i=1;i<=y;i++) {
			a=x*i;
			System.out.println(a);
		}
		
		//22-5
		//4��
		
		
		//23-6
		int j=7;
		
		for(int i1=1;i1<=10;i1++) {
			System.out.println(i1+"*"+j+"="+i1*j);
		}
		
		
		//23-9
		System.out.println("������ �Է��Ͻÿ�");
		int w=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=w;i++) {
			if(w%i==0) {
				System.out.println(i);
			}
		}
		
		//23������
		
		System.out.println("1~1000 ������ �� �߿��� �ϳ��� �Է��Ͻÿ�.");
		int a=Integer.parseInt(sc.nextLine());
		int sum=0;
		int b=0;
		for(int i=1;i<=1000;i++) {
			if(i%a==0) {
				sum=sum+i;
				b++;
			}
			
		}
		
		System.out.println("1~1000������ "+a+"�� ����� ���� : "+b+", ����� �� : "+sum);
		
		//24������
		
		System.out.println("����� ������ ������ ���ϴ� ���α׷� �Դϴ�.");
		System.out.println("0�� ������ ���ᰡ �˴ϴ�.");
		int a=Integer.parseInt(sc.nextLine());
		
		if(a>0) {
			System.out.println("����� �Է��ϼ̽��ϴ�. ������ "+a+"�Դϴ�.");
		}else if(a<0) {
			System.out.println("������ �Է��ϼ̽��ϴ�. ������ "+(-a)+"�Դϴ�.");
		}else {
			System.out.println("0�� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		
		
		//24-10
		
		for(int i=0; i<=100; i+=10) {
			System.out.println("ȭ���µ� : "+i+"��, �����µ� : "+((i-32)*5/9)+"��");
		}
		
		//25-12
		for(int i=1;i<=10;i++) {
			
			System.out.println("1~50���� ���� �����͸� �Է��Ͻÿ�.");
			int a=Integer.parseInt(sc.nextLine());
			String str="*";
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		//25-14	
		
		System.out.println("n�� ���� �Է��Ͻÿ�.");
		int n=Integer.parseInt(sc.nextLine());
		int sum=0;
		
		for(int a=1;a<=n;a++) {
			sum=sum+(a*a);
		}
		System.out.println("��갪�� "+sum+"�Դϴ�.");
		
		
		
		//26-16
		System.out.println("�ʱ� ���ᷮ�� 1000�Դϴ�.");
		int oil=1000;
		
		System.out.println("���� ���� �� ���-1, ����-2");
		int a=Integer.parseInt(sc.nextLine());
		
		while(a!=2) {
			if(oil<=10) {
				System.out.println("(���) ���ᰡ 10 ���� �Դϴ�.");
				break;
			}
			if(a==1) {
				System.out.println("���� ������ 1, ���� �Ҹ�� 2�� �Է��Ͻÿ�.");
				int i=Integer.parseInt(sc.nextLine());
				
				switch(i) {
					case 1:
						System.out.println("������ ������ ���� �Է��ϼ���.");
						int plus=Integer.parseInt(sc.nextLine());
						System.out.println("���� �����ִ� ������ ���� "+(oil=oil+plus)+"�Դϴ�.");
						break;
					case 2:
						System.out.println("�Ҹ��� ������ ���� �Է��ϼ���.");
						int minus=Integer.parseInt(sc.nextLine());
						System.out.println("���� �����ִ� ������ ���� "+(oil=oil-minus)+"�Դϴ�.");
						break;
				}
			}
		}
		System.out.println("�����մϴ�.");
		
		
		*/
		
		//26-17(((((((((((((())))))))))))))))
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���.");
		int a=Integer.parseInt(sc.nextLine());
		
		boolean is=false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				is=false;
				break;
			}
		}
		
		if(is==true) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
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
			System.out.println("���ڸ� �Է��ϼ���. 0�Է½� ����");
			a=Integer.parseInt(sc.nextLine());
			if(a>max) {
				max=a;
			}else if(a==0) {
				break;
			}else if(a<min) {
				min=a;
			}
			
		}while(min!=0); 
		System.out.println("�ִ밪�� "+max);
		System.out.println("�ּҰ��� "+min);
		
		
		
		//28-3
		
		int [] arr = new int[100];
		arr[0] = 0;
		arr[1] = 1;
		for(int i =2; i<arr.length; i++) {
		arr[i] = arr[i-2]+arr[i-1];
		System.out.println(arr[i]);
		}
		
		 
		
		//28������
		
		int a=0, c=0;
		
		System.out.println("������� ���� ��� ���α׷� �Դϴ�.");
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
		
		
		//30������((((()))))))))
		
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
		//5�� : �� �� �ִ�.
		
		//33-2
		//1,3,4��
		
		//33-3
		//0��
		
		//33-4 a : 0,3,6,9  b : 0,3,6,9  c : 0,2,4,8  d : 10,9,8,7,6,5,4,3,2,1,0
		//33-4~34 e : *��� 9�� ���  
		
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
		//(a)-��ȯ ���� ����. (b)-��ȯ ���� ����. (c)-���ѷ��� (d)-����� ���� �������� ����
		
		//35������
		System.out.println("���������⸦ ���� �մϴ�.");
		int a=ran.nextInt(2);
		if(a==0) {
			System.out.println("�ո��Դϴ�.");
		}else {
			System.out.println("�޸��Դϴ�.");
		}
		
		//36������
		int count=0;
		int dice=ran.nextInt(6)+1;
		int input=0;
		while(!(dice==input)) {
			dice=ran.nextInt(6)+1;
			System.out.println("1~6������ ���ڸ� �����ּ���.");
			input=Integer.parseInt(sc.nextLine());
			if(input>6||input<0) {
				System.out.println("##1~6������ ���ڸ� �����ּ���. Ƚ���� �þ�� �ʽ��ϴ�.");
			}else if(!(dice==input)) {
				System.out.println("����! �ֻ��� : "+dice+" User : "+input+" �ٽ� �����մϴ�.");
				count++;
			}
		}
		System.out.println("�ֻ��� ���ڸ� ���߼̽��ϴ�! ** �ֻ��� : "+dice+" User : "+input);
		System.out.println("�ݺ�Ƚ���� "+count+"ȸ �Դϴ�.");
		
		
		//37������
		System.out.println("��� ������ �ڵ����� �����մϴ�. ��ȸ�� 3���Դϴ�.");
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
				System.out.println("�¾ҽ��ϴ�.");
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
		System.out.println("�����մϴ�.");
		
		*/
		
		
		
		
	}

}
