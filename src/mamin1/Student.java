/**
 * 
 */
package mamin1;

import mamin1.Student;

/**
 * @author ����
 *@package_name:mamin1
*@file_name:Student.java
*@date-time:2017��10��15������4:00:07
*@location:https://github.com/1508010207/yinhang.git
 */
public class Student {//Student��
		private String name;//����
		private int age;//����
		private String education ;//ѧλ
		public Student(String name, int age, String education) {//���췽��
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
			System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getEducation() );
		}
	}
	class Undergraduate extends Student{//��������
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
			System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getEducation() + ". רҵ��" + this.getSpecialty());
		}
	}
	class Graduate extends Student{//�о�����
		private String direction;//�о�����
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
			System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getEducation() + ". �о�����" + this.getDirection());
		}
		/**
		 * @return
		 */
		public String getEducation() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	