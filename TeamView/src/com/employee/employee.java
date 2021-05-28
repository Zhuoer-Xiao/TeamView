package com.employee;

public class employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public employee(){

    }

    public employee(int id, String name, int age, double salary){
        this.age=age;
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetails(){
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}


