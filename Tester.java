import java.util.Scanner;
//Q1
class Student{
	private String name;
	private String course;
	private int rollNo;
	
	Student(String name,String course,int rollNo){
		this.name=name;
		this.course=course;
		this.rollNo=rollNo;
	}
	
	public String getName(){
		return name;
	}	
	
	public void setName(String name){
		this.name=name;
	}
	public String getCourse(){
		return course;
	}	
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public int getRollNo(){
		return rollNo;
	}	
	
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	
	public void display(){
		System.out.println("Student's name is "+getName());
		System.out.println("Student's course is "+getCourse());
		System.out.println("Student's rollNo is "+getRollNo());
	}
	
}

//Q2
class Rectangle{
	private int length;
	private int breadth;
	
	Rectangle(){
		length=0;
		breadth=0;
	}
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public int area(){
		return length*breadth;
	}
	
	
}

//Q3
class Calculator{
	int add(int a,int b){
		return a+b;
	}
	
	int add(int a,int b,int c){
		return a+b+c;
	}
	
	double add(double a,double b){
		return a+b;
	}
	
}

//Q4
class Vehicle{
	String brand;
	int speed;
	
	void display(){
		System.out.println("vehicle's brand is "+brand);
		System.out.println("vehicle's speed is "+speed);
	}
}
	
class Car extends Vehicle{
	String model;
	
	void display(){
		super.display();
		System.out.println("vehicle's model is "+model);
	}
}	


//Q5
class BankAccount{
	private String accountHolderName;
	private double balance;
	
	public String getAccountHolder(){
		return accountHolderName;
	}
	
	public void setAccountHolder(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public void deposit(double amount){
		balance+=amount;
	}
	
	public void withdraw(double amount){
		if(balance> amount){
			balance-=amount;
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	
	public void displayBalance(){
		System.out.println("your balance is "+balance);
	}
}

//Q6
class Book{
	private String title;
	private String author;
	private double price;
	
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.price=0;
	}
}

//Q7
class Shape{
	void area(){
		System.out.println("Area not defined");
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void area(){
		double result=Math.PI*radius*radius;
		System.out.println("Area is "+result);
	}
}

//Q8
class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void display(){
		System.out.println(" name is "+getName());
		System.out.println(" age is "+getAge());
	}
}

//Q9
class TemperatureConverter{
	double toFahrenheit(double celcius){
		return (celcius*9/5)+32;
	}
	double toCelcius(double fahrenheit){
		return (fahrenheit-32)*5/9;
	}
}

//Q10
class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void displayDetails(){
		System.out.println("Employee's name is "+name);
		System.out.println("Employee's id is "+id);
		System.out.println("Employee's salary is "+salary);
	}
}

class Manager extends Employee{
	Manager(String name,int id,double salary){
		super(name,id,salary);
	}
	
	void displayDetails(){
		super.displayDetails();
		double bonus=0.2*salary;
		System.out.println("Employee's bonus "+bonus);
	}
}

public class Tester{
	public static void main(String[] args){
		//Q1:Student
		Student student=new Student("Thusa","IT",121);
		student.display();
		System.out.println();
	
		//Q2:Rectangle
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle(5,10);
		System.out.println("Area of rect2: "+rect2.area());
		System.out.println();
		
		//Q3:Calculator
		Calculator calc=new Calculator();
		System.out.println("Add two integers: "+calc.add(2,3));
		System.out.println("Add three integers: "+calc.add(2,3,4));
		System.out.println("Add two doubles: "+calc.add(2.5,3.5));
		System.out.println();
		
		//Q4:Vehicle and Car
		Car car=new Car();
		car.brand="Toyota";
		car.speed=120;
		car.model="Corolla";
		car.display();
		System.out.println();
		
		//Q5:BankAccount
		BankAccount account=new BankAccount();
		account.deposit(5000);
		account.withdraw(1500);
		account.displayBalance();
		System.out.println();
		
		//Q6:Book
		Book book1=new Book("Java Basics ","Author A ",300.0);
		Book book2=new Book("Python Essentials ","Author B ");
		System.out.println();
		
		//Q7:Shape and Circle
		Circle circle=new Circle(5.0);
		circle.area();
		System.out.println();
		
		//Q8:Person
		Person person=new Person();
		person.setName("Alice");
		person.setAge(25);
		System.out.println("Person Name: "+person.getName());
		System.out.println("Person Age: "+person.getAge());
		System.out.println();
		
		//Q9:TemperatureConverter
		TemperatureConverter converter= new TemperatureConverter();
		System.out.println("30 Celcius to Fahrenheit:  "+converter.toFahrenheit(30));
		System.out.println("86 Fahrenheit to Celcius: "+converter.toCelcius(86));
		System.out.println();
		
		//Q10:Employee and Manager
		Manager manager=new Manager("Bob ", 201,75000);
		manager.displayDetails();
	}
	
}		
