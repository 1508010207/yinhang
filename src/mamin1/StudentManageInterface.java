/**
 * 
 */
package mamin1;

import mamin1.Graduate;
import mamin1.StudentManageInterface;
import mamin1.TeacherManageInterface;

/**
 * @author 敏儿
 *@package_name:mamin1
*@file_name:StudentManageInterface.java
*@date-time:2017年11月12日下午11:55:05
*@location:https://github.com/1508010207/yinhang.git
 */
public interface StudentManageInterface {
	void setFee(int fee);
    int getFee();
}
interface TeacherManageInterface{
    void setPay(int pay);
    int getPay();
}
class Graduate implements StudentManageInterface,TeacherManageInterface{
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;
    public Graduate(String name,int fee,int pay){
       super();
       this.name=name;
       this.fee=fee;
       this.pay=pay;
       if(this.pay-this.fee<2000)
           System.out.println("You  need a loan!");
       else
           System.out.println("You income is enough！");
    }
    public int getFee(){
       return this.fee;
    }
    public int getPay(){
       return this.pay;
    }
    public void setFee(int fee){
       this.fee=fee;
    }
    public void setPay(int pay){
       this.pay=pay;
    }
    public String getName(){
       return name;
    }
    public void setName(String name){
       this.name=name;
    }
    public String getSex(){
       return sex;
    }
    public int getAge(){
       return age;
    }
    public void setAge(int age){
       this.age=age;
    }
}
class Test2 {
    public static void main(String[] args) {
       new Graduate("张三",5500,10000	);
    }
 
}
