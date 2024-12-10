package problem_ten;

// Rectangle class
class Rectangle{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void printRectangle(){
        System.out.println("Rectangle: Length: " + length + ", Width: " + width);
    }
}

//  Employee class
 class Employee{
    String name;
    int id;
    double salary;
    void printEmployee(){
        System.out.println("Employee: Name: " + name + ", id: " + id+ ", Salary:"+salary);
    }
}

// Circle Class
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void printCircle() {
        System.out.println("Circle: Radius: " + radius);
    }
}

// Car Class
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void printCar() {
        System.out.println("Car: Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Student Class
class Student {
    String name;
    int rollNumber;
    String program;
    int batch;

    Student(String name, int rollNumber, String program, int batch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.program = program;
        this.batch = batch;
    }

    void printStudent() {
        System.out.println("Student [Name: " + name + ", Roll Number: " + rollNumber + ", Program: " + program + ", Batch: " + batch + "]");
    }
}

public class ProblemTen {
    public static void main(String[] args) {
        // Rectangle objects using Constructor
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.printRectangle();

        // Employee objects
        Employee employee = new Employee();
        employee.name =  "Sadman";
        employee.id = 8;
        employee.salary = 10.00;
        employee.printEmployee();

        // Circle objects
        Circle circle = new Circle(5.9);
        circle.printCircle();
        // Car objects
        Car car = new Car("Tesla","X",2024);
        car.printCar();
        // Student objects
        Student student = new Student("Sadman",17,"CSE", 15);
        student.printStudent();
    }



}


