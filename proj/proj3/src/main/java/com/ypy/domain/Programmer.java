package com.ypy.domain;

import com.ypy.service.*;

public class Programmer extends Employee {
    private int MemberId;
    protected Equipment equipment;
    public Status status = Status.FREE;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public void setStatus(Status status) {
        this.status = status;

    }

    public Status getStatus() {
        return this.status;

    }

    public void setMemberId(int MemberId) {
        this.MemberId = MemberId;

    }

    public int getMemberId() {
        return this.MemberId;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;

    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    protected String getDetails() {
        return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }
    public String getDetailsForTeam() {
        return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary()+"\t"+getMemberId();
    }
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription() ;
    }
}