package com.ypy.domain;

public class Architect extends Designer{
    private int stock;
    public Architect(){
    }
    public Architect(int id,String name,int age,double salary,Equipment equipment,double bonus,int stock){
        super(id, name,age, salary, equipment,bonus);
        this.stock=stock;
    }
    public void setstock(int stock) {
        this.stock=stock;
        
    }
    public int getstock() {
        return this.stock;
    }
    protected String getDetails() {
        return  getId() + "\t" + getName()+ "\t" + getAge() + "\t" + getSalary();
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + status +"\t" +getbonus()+"\t"+getstock() + "\t" +equipment.getDescription() ;
    }
}
