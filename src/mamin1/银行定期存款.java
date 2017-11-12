/**
 * 
 */
package mamin1;

import mamin1.DepositAccount;

/**
 * @author 敏儿
 *@file:银行定期存款.java
*@package:mamin1
*@project:mamin1
*@date time:2017年10月11日下午10:27:36
*@location:https://github.com/1508010207/yinhang.git
 */
public class 银行定期存款 {
            public static void main(String arg[]){
	 		DepositAccount saver=new DepositAccount("1234567890","Zhang San",5000);
	 		DepositAccount.setInterest(0.023);//设置年利率
	 		saver.queryBanlance();//查询余额
	 		saver.deposit(2000);//存入2000元
	 		System.out.println("年利率是："+saver.calyearInterest());
	 		System.out.println("月利率是："+saver.calmouthInterest());
	 	}
	 }
	 class DepositAccount{
	 	private String accountNumber;//账号
	 	private String name;//姓名
	 	private double balance;//余额
	 	static double interest;//年利率
	 	public static void setInterest(double d){ 
	 	interest=d;
	 	}
	  public DepositAccount(String num, String mamin,double money){//开户
	 	accountNumber=num;
	 	name=mamin;
	 	balance=money;
	 }
	 public double calyearInterest(){//计算年利息
	 	return balance*interest;
	 }
	 public double calmouthInterest(){//计算月利息
		 	return balance*interest/12;
		 }
		public void queryBanlance(){//查询余额
	 		System.out.println("你的余额是："+balance);	
	 	}
	 	public void deposit (double cash){//存款
	 	    System.out.println("你账户原有余额："+balance);
	 		System.out.println("你现在存入："+cash);
	 		balance+=cash;
	 		System.out.println("存款成功，你的余额是："+balance);
	 	}
	 

}