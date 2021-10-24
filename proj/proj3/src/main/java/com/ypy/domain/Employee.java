package com.ypy.domain;

public class Employee {
    private String name;
    private int id;
    private int age;
    private double salary;
    public Employee(){
        super();
    }
    public Employee(int id,String name,int age,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void setName(String name) {
        this.name=name;
        
    }
    public String getName() {
        return this.name;
        
    }
    public void setId(int id) {
        this.id=id;
        
    }
    public int getId() {
        return this.id;
    }
    public void setAge(int age) {
        this.age=age;
        
    }
    public int getAge() {
        return this.age;
    }
    public void setSalary(double salary) {
        this.salary=salary;
        
    }
    public double getSalary() {
        return this.salary;
    }
    //没想到的地方
    protected String getDetails() {
        return id + "\t" + name + "\t" + age+ "\t" +salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
