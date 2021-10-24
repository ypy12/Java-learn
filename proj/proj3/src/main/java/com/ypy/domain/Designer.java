package com.ypy.domain;

public class Designer extends Programmer {
    private double bonus;

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name,age, salary,equipment);
        this.bonus = bonus;
    }

    public void setbonus(double bonus) {
        this.bonus = bonus;

    }

    public double getbonus() {
        return this.bonus;
    }

    protected String getDetails() {
        return  getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() ;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + status + "\t"+getbonus()+ "\t\t" +equipment.getDescription() ;
    }
}
