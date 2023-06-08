package com.example.importjavascenery.knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
// 流处理可以处理数组也就是Collection的子类，如ArrayList类
public class Employee {
    private String name;
    private  int age;
    private  double salary;
    private String sex;
    private String dept;

    public Employee(String name, int age, double salary, String sex, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    static List<Employee> getEmplist(){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("老张",40, 9000,"男", "运营部"));
        list.add(new Employee("小刘",25, 10000,"男", "运营部"));
        return list;
    }

    public static void main(String[] args) {
       List<Employee> list = Employee.getEmplist();
        Stream<Employee> stream = list.stream();
        boolean result = stream.allMatch(people->people.getAge() > 25);
        System.out.println("所有大院25岁的re" + result);
    }
}
