/**
 * 
 */
package mamin1;

import mamin1.Graduate;
import mamin1.Undergraduate;

/**
 * @author 敏儿
 *@package_name:mamin1
*@file_name:TestExtends.java
*@date-time:2017年10月15日下午4:10:27
*@location:https://github.com/1508010207/yinhang.git
 */
public class TestExtends {
		public static void main(String[] args) {
			Undergraduate stu1=new Undergraduate("马敏",20,"本科","软件工程");
	        Graduate stu2=new Graduate("赵宣",22,"硕士","网络工程");
	        stu1.show();
	        stu2.show();
		}
	}
