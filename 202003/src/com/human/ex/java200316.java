package com.human.ex;

public class java200316 {
	
	public static void main(String[] args) {
		
		java.util.Random rd=new java.util.Random();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		int deck[]=new int[52];//deck �����������
		
		//ī����
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		
		//ī�����
		String cardNumber[]= {"A","2","3","4","5","6"
		,"7","8","9","10","J","Q","k"};
		
		//deck[0]=0;
		//deck[1]=1;;
		//ī�� ����
		
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		//ī�带 �����.
			  
		for(int i=0;i<10000;i++) {
			int rNumber=rd.nextInt(52);
			int temp;
			temp=deck[0];
			deck[0]=deck[rNumber];
			deck[rNumber]=temp;
		}
			  
		//ī�带 ���徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
		int deckIndex=0;
		int userADeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int userBDeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int userAIndex=0;
		int userBIndex=0;
		boolean userAFlag=true;
		boolean userBFlag=true;
		
		int scoureBSum=0;
		int scoureASum=0;
		
		for(int j=0;j<10;j++) {
			if(userAFlag) {
				System.out.println("AUser�� ī�带 ���� �Ͻðڽ��ϱ� 0-no 1-yes");
			    if(sc.nextLine().equals("0")) {
			    	userAFlag=false;    
			    };
			}
			if(userBFlag) {
			  System.out.println("BUser�� ī�带 ���� �Ͻðڽ��ϱ� 0-no 1-yes");
			  if(sc.nextLine().equals("0")) {
				  userBFlag=false;    
			  };
			}
			if(!(userAFlag || userBFlag)) {
				break;
			}
			   
			if(userAFlag) {
				userADeck[userAIndex]=deck[deckIndex];
			    deckIndex++;
			    userAIndex++;
			}
			if(userBFlag) {
				userBDeck[userBIndex]=deck[deckIndex];
			    userBIndex++;
			    deckIndex++;
			}
			   
		//userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
			System.out.println("AUserCard");
			for(int i:userADeck) {
				if(i!=-1) {
			     
			     //System.out.print(i+" ");
					System.out.print(" ī����"+cardShape[i/cardNumber.length]);
					System.out.println(" ī�� ����"+cardNumber[i%cardNumber.length]);
			    }
			}
			
			
			System.out.println("");
					
			
			System.out.println("BUserCard");
			for(int i=0;i<userBIndex;i++) {
				//System.out.println(userBDeck[i]+" ");
			    System.out.print(" ī����"
			      +cardShape[userBDeck[i]/cardNumber.length]);
			    System.out.println(" ī�� ����"
			      +cardNumber[userBDeck[i]%cardNumber.length]);
			}
			System.out.println("");
			   
			   //���� ���
			   //userADeck �������
			   //int scoureA=0;
			   //scoureA=userADeck[i]%13+1;
			   //if(scoureA>10) scoureA=10;
			   
			scoureASum=0;
			for(int i=0;i<userAIndex;i++) {
				int scoureA=0;
				scoureA=userADeck[i]%13+1;
				if(scoureA>10) {
					scoureA=10;
			    }
			    scoureASum=scoureASum+scoureA;
			   }
			   //A 1 or 11
			 for(int i=0;i<userAIndex;i++) {
				 if(userADeck[i]%13==0) {
			     //A������ 10�����ؼ� 22�� ���������� scoureASum�� 10�� 
			     //�����ְ� ������ �ȴ����ָ�ȴ�.
			     if((scoureASum+10)<=21) {
			      scoureASum=scoureASum+10;
			     }    
				 }
			 }  
			 System.out.println("totalAUser:"+scoureASum);
			 if(scoureASum>21) {
				 System.out.println("21�� �ʰ�");
				 break;
			 }
			   
			   
			   
			   //userBDeck �������
			 scoureBSum=0;
			   
			   for(int i=0;i<userBIndex;i++) {
				   int scoureB=0;
				   scoureB=userBDeck[i]%13+1;
				   if(scoureB>10) {
					   scoureB=10;
			   }
			   scoureBSum=scoureBSum+scoureB;
			   }
			   //A 1 or 11
			   for(int i=0;i<userBIndex;i++) {
				   if(userBDeck[i]%13==0) {
			     //A������ 10�����ؼ� 22�� ���������� scoureASum�� 10�� 
			     //�����ְ� ������ �ȴ����ָ�ȴ�.
					   if((scoureBSum+10)<=21) {
						   scoureBSum=scoureBSum+10;
					   }    
				   }
			   }  
			   System.out.println("totalBUser:"+scoureBSum);
			   if(scoureBSum>21) {
					 System.out.println("21�� �ʰ�");
					 break;
			   }
			   
		}
			  
			  //userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
		System.out.println("AUserCard");
		for(int i:userADeck) {
			if(i!=-1) {
			    
			    //System.out.print(i+" ");
				System.out.print(" ī����"+cardShape[i/cardNumber.length]);
			    System.out.print(" ī�� ����"+cardNumber[i%cardNumber.length]);
			 }
		}
		System.out.println("");
		System.out.println("BUserCard");
		for(int i=0;i<userBIndex;i++) {
			   //System.out.println(userBDeck[i]+" ");
			System.out.print(" ī����"+cardShape[userBDeck[i]/cardNumber.length]);
			System.out.print(" ī�� ����"+cardNumber[userBDeck[i]%cardNumber.length]);
		}
		System.out.println("");
			  
			  
			  //���� ����
			  //��A�¸���, ��B�¸���, �����ºΡ�
		String playState="���";
		if(scoureASum>21) {
			playState="B�¸�";
		}else if(scoureBSum>21) {
			playState="A�¸�"; 
		}else if(scoureASum>scoureBSum) {
			playState="A�¸�";
		}else if(scoureASum==scoureBSum) {
			playState="���º�";
		}else {
			playState="B�¸�";
		}
			 
		System.out.println(playState);
			  
			  
			  //ī�� ���
			//  for(int i:deck) {
			//   System.out.println(i+" ");
			//   System.out.println("ī����"
//			     +cardShape[i/cardNumber.length]);
			//   System.out.println("ī�� ����"
//			     +cardNumber[i%cardNumber.length]);
			//   
			//   
			//  }
			  
			  


	}

}