/**
 * 
 */
package mamin1;

import mamin1.DepositAccount;

/**
 * @author ����
 *@file:���ж��ڴ��.java
*@package:mamin1
*@project:mamin1
*@date time:2017��10��11������10:27:36
*@location:https://github.com/1508010207/yinhang.git
 */
public class ���ж��ڴ�� {
            public static void main(String arg[]){
	 		DepositAccount saver=new DepositAccount("1234567890","Zhang San",5000);
	 		DepositAccount.setInterest(0.023);//����������
	 		saver.queryBanlance();//��ѯ���
	 		saver.deposit(2000);//����2000Ԫ
	 		System.out.println("�������ǣ�"+saver.calyearInterest());
	 		System.out.println("�������ǣ�"+saver.calmouthInterest());
	 	}
	 }
	 class DepositAccount{
	 	private String accountNumber;//�˺�
	 	private String name;//����
	 	private double balance;//���
	 	static double interest;//������
	 	public static void setInterest(double d){ 
	 	interest=d;
	 	}
	  public DepositAccount(String num, String mamin,double money){//����
	 	accountNumber=num;
	 	name=mamin;
	 	balance=money;
	 }
	 public double calyearInterest(){//��������Ϣ
	 	return balance*interest;
	 }
	 public double calmouthInterest(){//��������Ϣ
		 	return balance*interest/12;
		 }
		public void queryBanlance(){//��ѯ���
	 		System.out.println("�������ǣ�"+balance);	
	 	}
	 	public void deposit (double cash){//���
	 	    System.out.println("���˻�ԭ����"+balance);
	 		System.out.println("�����ڴ��룺"+cash);
	 		balance+=cash;
	 		System.out.println("���ɹ����������ǣ�"+balance);
	 	}
	 

}