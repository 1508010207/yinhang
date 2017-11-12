/**
 * 
 */
package mamin1;

import mamin1.Car;
import mamin1.ComputerWeight;
import mamin1.Computer;
import mamin1.Television;
import mamin1.WashMachine;

/**
 * @author 敏儿
 *@package_name:mamin1
*@file_name:ComputerWeight.java
*@date-time:2017年11月12日下午11:56:46
*@location:https://github.com/1508010207/yinhang.git
 */
public interface ComputerWeight {
	public double computeWeight();
}
class Television implements ComputerWeight { 
	public double computeWeight() {  
		return 200;   
		} 
	}  
class Computer implements ComputerWeight { 
	public double computeWeight() {
		return 150;   
		} 
	}  
class WashMachine implements ComputerWeight 
{
	public double computeWeight() { 
		return 100;    
		}
	} 
class Car {  
	ComputerWeight[] goods;
	double totalWeights=0;
	Car(ComputerWeight[] goods){
		this.goods=goods;  
		}  
	public double getTotalWeights() {
		totalWeights=0; 
		for(int i=0;i<goods.length;i++) {    
			totalWeights+=goods[i].computeWeight();  
			}   
		return totalWeights; 
		} 
	}  
class Road {
	public static void main(String args[]) { 
		ComputerWeight[] goodsOne=new ComputerWeight[50], 
				goodsTwo=new ComputerWeight[22]; 
		for(int i=0;i<goodsOne.length;i++) {  
			if(i%3==0)    
				goodsOne[i]=new Television();
			else if(i%3==1)    
				goodsOne[i]=new Computer();  
			else if(i%3==2)      
				goodsOne[i]=new WashMachine(); 
			}     
		for(int i=0;i<goodsTwo.length;i++)    {  
			if(i%3==0)    
				goodsTwo[i]=new Television();  
			else if(i%3==1)     
				goodsTwo[i]=new Computer();  
			else if(i%3==2)       
				goodsTwo[i]=new WashMachine(); 
			}    
		Car bigcar=new Car(goodsOne); 
		System.out.println("大货车装载的货物重量:"+bigcar.getTotalWeights()); 
		Car smallcar=new Car(goodsTwo);  
		System.out.println("小货车装载的货物重量:"+smallcar.getTotalWeights());  
		} 
	}
