/**
 * 
 */
package mamin1;

import mamin1.Student;

/**
 * @author 敏儿
 *@package_name:mamin1
*@file_name:Student.java
*@date-time:2017年10月15日下午4:00:07
*@location:https://github.com/1508010207/yinhang.git
 */
public class Student {//Student类
		private String name;//姓名
		private int age;//年龄
		private String education ;//学位
		public Student(String name, int age, String education) {//构造方法
			super();
			this.name = name;
			this.age = age;
			this.education = education;
		}
		public Student() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEducation() {
			return education;
		}
		public void setDegree(String education) {
			this.education = education;
		}
		public void show(){
			System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getEducation() );
		}
	}
	class Undergraduate extends Student{//本科生类
		private String specialty;
		public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
		public Undergraduate(String name, int age, String education, String specialty) {
			super(name, age, education);
			this.specialty = specialty;
		}
		public Undergraduate(String name, int age, String education) {
			super(name, age, education);
		}
		
		public void show(){
			System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getEducation() + ". 专业：" + this.getSpecialty());
		}
	}
	class Graduate extends Student{//研究生类
		private String direction;//研究方向
		public String getDirection() {
			return direction;
		}
		public void setDirection(String direction) {
			this.direction = direction;
		}
		public Graduate(String name, int age, String Education, String direction) {
			super(name, age, Education);
			this.direction = direction;
		}
		public Graduate(String name, int age, String Education) {
			super(name, age, Education);
		}
		public void show(){
			System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getEducation() + ". 研究方向：" + this.getDirection());
		}
		/**
		 * @return
		 */
		public String getEducation() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	